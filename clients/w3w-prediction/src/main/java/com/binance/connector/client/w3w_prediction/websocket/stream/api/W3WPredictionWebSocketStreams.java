package com.binance.connector.client.w3w_prediction.websocket.stream.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.adapter.stream.SignedStreamConnectionPoolWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.SignedStreamConnectionWrapper;
import com.binance.connector.client.common.websocket.adapter.stream.StreamConnectionInterface;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.w3w_prediction.websocket.stream.JSON;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.BatchClaimPartiallySucceededResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.FundTransferFailedResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.FundTransferSucceededResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.LimitOrderFullyFilledResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.LimitOrderPartiallyFilledResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.LimitOrderSubmissionFailedResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.LimitOrderSubmittedSuccessfullyResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.MarketBuyOrderFailedResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.MarketBuyOrderFullyFilledResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.MarketResolutionNotificationResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.MarketSellOrderFailedExpiredResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.MarketSellOrderFullyFilledResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.PredictionOrderBookByMarketIdRequest;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.PredictionOrderBookByMarketIdResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.RewardClaimFailedResponse;
import com.binance.connector.client.w3w_prediction.websocket.stream.model.RewardClaimSucceededResponse;
import java.util.UUID;

public class W3WPredictionWebSocketStreams {
    private static final String USER_AGENT =
            String.format(
                    "binance-w3w-prediction/2.2.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    private final StreamConnectionInterface connection;

    private DefaultApi defaultApi;

    public W3WPredictionWebSocketStreams(WebSocketClientConfiguration configuration) {
        this(
                configuration.getUsePool()
                        ? new SignedStreamConnectionPoolWrapper(configuration, JSON.getGson())
                        : new SignedStreamConnectionWrapper(configuration, JSON.getGson()));
    }

    public W3WPredictionWebSocketStreams(StreamConnectionInterface connection) {
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

    public StreamBlockingQueueWrapper<BatchClaimPartiallySucceededResponse>
            batchClaimPartiallySucceeded() throws ApiException {
        return defaultApi.batchClaimPartiallySucceeded();
    }

    public StreamBlockingQueueWrapper<FundTransferFailedResponse> fundTransferFailed()
            throws ApiException {
        return defaultApi.fundTransferFailed();
    }

    public StreamBlockingQueueWrapper<FundTransferSucceededResponse> fundTransferSucceeded()
            throws ApiException {
        return defaultApi.fundTransferSucceeded();
    }

    public StreamBlockingQueueWrapper<LimitOrderFullyFilledResponse> limitOrderFullyFilled()
            throws ApiException {
        return defaultApi.limitOrderFullyFilled();
    }

    public StreamBlockingQueueWrapper<LimitOrderPartiallyFilledResponse> limitOrderPartiallyFilled()
            throws ApiException {
        return defaultApi.limitOrderPartiallyFilled();
    }

    public StreamBlockingQueueWrapper<LimitOrderSubmissionFailedResponse>
            limitOrderSubmissionFailed() throws ApiException {
        return defaultApi.limitOrderSubmissionFailed();
    }

    public StreamBlockingQueueWrapper<LimitOrderSubmittedSuccessfullyResponse>
            limitOrderSubmittedSuccessfully() throws ApiException {
        return defaultApi.limitOrderSubmittedSuccessfully();
    }

    public StreamBlockingQueueWrapper<MarketBuyOrderFailedResponse> marketBuyOrderFailed()
            throws ApiException {
        return defaultApi.marketBuyOrderFailed();
    }

    public StreamBlockingQueueWrapper<MarketBuyOrderFullyFilledResponse> marketBuyOrderFullyFilled()
            throws ApiException {
        return defaultApi.marketBuyOrderFullyFilled();
    }

    public StreamBlockingQueueWrapper<MarketResolutionNotificationResponse>
            marketResolutionNotification() throws ApiException {
        return defaultApi.marketResolutionNotification();
    }

    public StreamBlockingQueueWrapper<MarketSellOrderFailedExpiredResponse>
            marketSellOrderFailedExpired() throws ApiException {
        return defaultApi.marketSellOrderFailedExpired();
    }

    public StreamBlockingQueueWrapper<MarketSellOrderFullyFilledResponse>
            marketSellOrderFullyFilled() throws ApiException {
        return defaultApi.marketSellOrderFullyFilled();
    }

    public StreamBlockingQueueWrapper<PredictionOrderBookByMarketIdResponse>
            predictionOrderBookByMarketId(
                    PredictionOrderBookByMarketIdRequest predictionOrderBookByMarketIdRequest)
                    throws ApiException {
        return defaultApi.predictionOrderBookByMarketId(predictionOrderBookByMarketIdRequest);
    }

    public StreamBlockingQueueWrapper<RewardClaimFailedResponse> rewardClaimFailed()
            throws ApiException {
        return defaultApi.rewardClaimFailed();
    }

    public StreamBlockingQueueWrapper<RewardClaimSucceededResponse> rewardClaimSucceeded()
            throws ApiException {
        return defaultApi.rewardClaimSucceeded();
    }

    public String getRequestID() {
        return UUID.randomUUID().toString();
    }
}
