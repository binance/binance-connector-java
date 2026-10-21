package com.binance.connector.client.cms.websocket.stream.api;

import com.binance.connector.client.cms.websocket.stream.JSON;
import com.binance.connector.client.cms.websocket.stream.model.ComAnnouncementEnResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.SignedStreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.SignedStreamConnectionWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import java.util.UUID;

public class CmsWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-cms/1.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private final StreamConnectionInterface connection;

    private DefaultApi defaultApi;

    public CmsWebSocketStreams(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new SignedStreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new SignedStreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public CmsWebSocketStreams(StreamConnectionInterface connection) {
        connection.setUserAgent(USER_AGENT);
        if (!connection.isConnected()) {
            connection.connect();
        }
        this.connection = connection;

        this.defaultApi = new DefaultApi(connection);
    }

    public void stop() throws Exception {
        if (connection != null && connection.isConnected()) {
            connection.stop();
        }
    }

    public StreamBlockingQueueWrapper<ComAnnouncementEnResponse> comAnnouncementEn()
            throws ApiException {
        return defaultApi.comAnnouncementEn();
    }

    public String getRequestID() {
        return UUID.randomUUID().toString();
    }
}
