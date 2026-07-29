package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetPositionMarginChangeHistoryResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class GetPositionMarginChangeHistoryExample {
    private DerivativesTradingUsdsFuturesRestApi api;

    public DerivativesTradingUsdsFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Position Margin Change History (TRADE)
     *
     * <p>Get Position Margin Change History Weight(IP): 1 Security Type: TRADE Notes: - Support
     * querying future histories that are not older than 30 days - The time between
     * &#x60;startTime&#x60; and &#x60;endTime&#x60;can&#39;t be more than 30 days
     *
     * @throws ApiException if the Api call fails
     */
    public void getPositionMarginChangeHistoryExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        String type = "1";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 50L;
        Long recvWindow = 5000L;
        ApiResponse<GetPositionMarginChangeHistoryResponse> response =
                getApi().getPositionMarginChangeHistory(
                                symbol, type, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
