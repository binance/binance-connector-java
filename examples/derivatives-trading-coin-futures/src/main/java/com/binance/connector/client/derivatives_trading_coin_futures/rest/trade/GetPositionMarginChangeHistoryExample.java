package com.binance.connector.client.derivatives_trading_coin_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetPositionMarginChangeHistoryResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class GetPositionMarginChangeHistoryExample {
    private DerivativesTradingCoinFuturesRestApi api;

    public DerivativesTradingCoinFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Position Margin Change History (TRADE)
     *
     * <p>Get position margin change history Weight(IP): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void getPositionMarginChangeHistoryExample() throws ApiException, IOException {
        String symbol = "BTCUSD";
        Long type = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 30L;
        Long recvWindow = 5000L;
        ApiResponse<GetPositionMarginChangeHistoryResponse> response =
                getApi().getPositionMarginChangeHistory(
                                symbol, type, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
