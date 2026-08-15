package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.MarginAccountTradeListResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class MarginAccountTradeListExample {
    private DerivativesTradingPortfolioMarginRestApi api;

    public DerivativesTradingPortfolioMarginRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Margin Account Trade List (USER_DATA)
     *
     * <p>Margin Account Trade List Weight(IP): 5 Security Type: USER_DATA Notes: - **Note:** * If
     * &#x60;fromId&#x60; is set, returns orders with id &gt;&#x3D; &#x60;fromId&#x60;; otherwise
     * returns recent order history. - The interval between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; must be less than 24 hours.
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountTradeListExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Long orderId = 1L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long fromId = 1L;
        Long limit = 500L;
        Long recvWindow = 5000L;
        ApiResponse<MarginAccountTradeListResponse> response =
                getApi().marginAccountTradeList(
                                symbol, orderId, startTime, endTime, fromId, limit, recvWindow);
        System.out.println(response.getData());
    }
}
