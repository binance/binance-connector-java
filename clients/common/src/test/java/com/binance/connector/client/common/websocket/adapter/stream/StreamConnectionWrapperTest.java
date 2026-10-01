package com.binance.connector.client.common.websocket.adapter.stream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueue;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import org.eclipse.jetty.websocket.api.RemoteEndpoint;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.WriteCallback;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class StreamConnectionWrapperTest {
    private StreamConnectionWrapper connection;
    private RemoteEndpoint remoteEndpoint;

    @BeforeEach
    public void setUp() throws Exception {
        WebSocketClientConfiguration configuration = new WebSocketClientConfiguration();
        configuration.setUrl("wss://localhost:8080");
        configuration.setReconnectIntervalTime(Integer.MAX_VALUE);

        WebSocketClient webSocketClient = Mockito.mock(WebSocketClient.class);
        Mockito.doReturn(true).when(webSocketClient).isStarted();

        Session session = Mockito.mock(Session.class);
        remoteEndpoint = Mockito.mock(RemoteEndpoint.class);
        Mockito.doReturn(remoteEndpoint).when(session).getRemote();
        Mockito.doReturn(CompletableFuture.completedFuture(session))
                .when(webSocketClient)
                .connect(Mockito.any(), Mockito.any(), Mockito.any());
        Mockito.doAnswer(
                        invocation -> {
                            invocation.getArgument(1, WriteCallback.class).writeSuccess();
                            return null;
                        })
                .when(remoteEndpoint)
                .sendString(Mockito.anyString(), Mockito.any());

        connection = new StreamConnectionWrapper(configuration, webSocketClient);
        connection.connect();
    }

    @AfterEach
    public void tearDown() throws Exception {
        connection.stop();
    }

    @Test
    public void unsubscribeIncludesRequestIdAndHandlesAcknowledgement() {
        String operationId = "btcusdt@trade";
        RequestWrapperDTO<Set<String>, Object> subscribeRequest =
                new RequestWrapperDTO.Builder<Set<String>, Object>()
                        .id("subscribe-request")
                        .method("SUBSCRIBE")
                        .params(Collections.singleton(operationId))
                        .build();

        Map<String, StreamBlockingQueue<String>> queues = connection.subscribe(subscribeRequest);
        connection.onWebSocketText("{\"result\":null,\"id\":\"subscribe-request\"}");
        Mockito.clearInvocations(remoteEndpoint);

        connection.unsubscribe(queues.get(operationId));

        ArgumentCaptor<String> payloadCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(remoteEndpoint).sendString(payloadCaptor.capture(), Mockito.any());
        JsonObject payload = JsonParser.parseString(payloadCaptor.getValue()).getAsJsonObject();
        assertEquals("UNSUBSCRIBE", payload.get("method").getAsString());
        assertTrue(payload.has("id"));
        assertFalse(payload.get("id").isJsonNull());

        String requestId = payload.get("id").getAsString();
        assertDoesNotThrow(
                () ->
                        connection.onWebSocketText(
                                "{\"result\":null,\"id\":\"" + requestId + "\"}"));
        assertTrue(connection.getPendingRequest().isEmpty());
    }
}
