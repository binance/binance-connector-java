package com.binance.connector.client.common.websocket.adapter.stream;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.JSON;
import com.binance.connector.client.common.websocket.adapter.ConnectionWrapper;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueue;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.client.WebSocketClient;

public class StreamConnectionWrapper extends ConnectionWrapper
        implements StreamConnectionInterface {
    private Set<String> subcriptionsListResult = new HashSet<>();
    private final HashMap<String, List<StreamBlockingQueue<String>>> subscriptions =
            new HashMap<>();

    public StreamConnectionWrapper(WebSocketClientConfiguration configuration, Gson json) {
        super(configuration, json);
    }

    public StreamConnectionWrapper(WebSocketClientConfiguration configuration) {
        super(configuration);
    }

    public StreamConnectionWrapper(
            WebSocketClientConfiguration configuration, WebSocketClient webSocketClient) {
        super(configuration, webSocketClient);
    }

    public Map<String, StreamBlockingQueue<String>> subscribe(
            RequestWrapperDTO<Set<String>, Object> requestWrapperDTO) {
        HashMap<String, StreamBlockingQueue<String>> queueMap = new HashMap<>();
        for (String subscription : requestWrapperDTO.getParams()) {
            List<StreamBlockingQueue<String>> blockingQueueList;
            if (this.subscriptions.containsKey(subscription)) {
                blockingQueueList = this.subscriptions.get(subscription);
            } else {
                blockingQueueList = new ArrayList<>();
            }
            BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();

            StreamBlockingQueue blockingQueueWrapper =
                    new StreamBlockingQueue(blockingQueue, subscription);

            blockingQueueList.add(blockingQueueWrapper);
            this.subscriptions.put(subscription, blockingQueueList);
            this.innerSend(requestWrapperDTO);
            queueMap.put(subscription, blockingQueueWrapper);
        }

        return queueMap;
    }

    public void unsubscribe(StreamBlockingQueueWrapper blockingQueueWrapper) {
        unsubscribe(blockingQueueWrapper.getInnerQueue());
    }

    public void unsubscribe(StreamBlockingQueue queue) {
        String operationId = queue.getOperationId();
        List<StreamBlockingQueue<String>> blockingQueues = subscriptions.get(operationId);
        blockingQueues.remove(queue);

        // unsubscribe from the stream if no more queue
        if (blockingQueues.isEmpty()) {
            RequestWrapperDTO listSubscriptions =
                    new RequestWrapperDTO.Builder<>()
                            .method("UNSUBSCRIBE")
                            .params(Collections.singletonList(operationId))
                            .build();

            this.send(listSubscriptions);
        }
    }

    @Override
    public void onWebSocketText(String message) {
        try {
            JsonElement root = JsonParser.parseString(message);
            JsonObject obj = root.getAsJsonObject();
            // Response to subscribe
            JsonElement id = obj.get("id");
            if (id != null) {
                JsonElement result = obj.get("result");
                RequestWrapperDTO requestWrapperDTO = pendingRequest.get(id.getAsString());
                Type responseType = requestWrapperDTO.getResponseType();
                Object fromJson =
                        result.isJsonNull() ? null : JSON.getGson().fromJson(result, responseType);
                pendingRequest.remove(id.getAsString());
                requestWrapperDTO.getResponseCallback().complete(fromJson);
                return;
            }

            JsonElement stream = obj.get("stream");
            // no stream, we couldn't detect which queue to use.
            if (stream == null) {
                return;
            }
            List<StreamBlockingQueue<String>> blockingQueues =
                    subscriptions.get(stream.getAsString());
            if (blockingQueues == null || blockingQueues.isEmpty()) {
                return;
            }
            for (StreamBlockingQueue<String> queue : blockingQueues) {
                JsonElement data = obj.get("data");
                queue.offer(data.toString());
            }
        } catch (Exception e) {
            throw new ApiException(e);
        }
    }

    protected void beforeConnect() {
        // no session, so this is not a reconnect
        if (this.session == null || !this.session.isOpen()) {
            return;
        }
        RequestWrapperDTO<Object, HashSet<String>> listSubscriptions =
                new RequestWrapperDTO.Builder<Object, HashSet<String>>()
                        .id(UUID.randomUUID().toString())
                        .method("LIST_SUBSCRIPTIONS")
                        .responseType(new TypeToken<HashSet<String>>() {}.getType())
                        .build();

        this.send(listSubscriptions);

        listSubscriptions
                .getResponseCallback()
                .thenAccept(
                        (response) -> {
                            subcriptionsListResult = response;
                            super.beforeConnect();
                        });
    }

    protected void afterConnect(Session session) {
        if (!subcriptionsListResult.isEmpty()) {
            RequestWrapperDTO subscribe =
                    new RequestWrapperDTO.Builder<>()
                            .id(UUID.randomUUID().toString())
                            .method("SUBSCRIBE")
                            .params(subcriptionsListResult)
                            .build();

            this.send(subscribe);
        }
        super.afterConnect(session);
    }
}
