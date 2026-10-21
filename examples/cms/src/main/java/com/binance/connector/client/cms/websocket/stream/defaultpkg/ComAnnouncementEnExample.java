package com.binance.connector.client.cms.websocket.stream.defaultpkg;

import com.binance.connector.client.cms.websocket.stream.CmsWebSocketStreamsUtil;
import com.binance.connector.client.cms.websocket.stream.api.CmsWebSocketStreams;
import com.binance.connector.client.cms.websocket.stream.model.ComAnnouncementEnResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;

/** API examples for DefaultApi */
public class ComAnnouncementEnExample {
    private CmsWebSocketStreams api;

    public CmsWebSocketStreams getApi() {
        if (api == null) {
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            WebSocketClientConfiguration clientConfiguration =
                    CmsWebSocketStreamsUtil.getClientConfiguration(signatureConfiguration);
            api = new CmsWebSocketStreams(clientConfiguration);
        }
        return api;
    }

    /**
     * Receive push notifications hen Binance publishes announcements in English (language code:
     * en).
     *
     * @throws ApiException if the Api call fails
     */
    public void comAnnouncementEnExample() throws ApiException, InterruptedException {
        StreamBlockingQueueWrapper<ComAnnouncementEnResponse> response =
                getApi().comAnnouncementEn();
        while (true) {
            System.out.println(response.take());
        }
    }
}
