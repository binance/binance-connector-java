package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.QueryPortfolioMarginAssetIndexPriceResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class QueryPortfolioMarginAssetIndexPriceExample {
    private DerivativesTradingPortfolioMarginProRestApi api;

    public DerivativesTradingPortfolioMarginProRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginProRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginProRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Portfolio Margin Asset Index Price (MARKET_DATA)
     *
     * <p>Query Portfolio Margin Asset Index Price Weight: - 1 if &#x60;asset&#x60; is sent - 50 if
     * &#x60;asset&#x60; is not sent Security Type: MARKET_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryPortfolioMarginAssetIndexPriceExample() throws ApiException, IOException {
        String asset = "BTC";
        ApiResponse<QueryPortfolioMarginAssetIndexPriceResponse> response =
                getApi().queryPortfolioMarginAssetIndexPrice(asset);
        System.out.println(response.getData());
    }
}
