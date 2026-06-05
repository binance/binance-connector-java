package com.binance.connector.client.margin_trading.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetMarginAssetRiskBasedLiquidationRatioResponse;

/** API examples for MarketDataApi */
public class GetMarginAssetRiskBasedLiquidationRatioExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Margin Asset Risk-Based Liquidation Ratio (MARKET_DATA)
     *
     * <p>Get Margin Asset Risk-Based Liquidation Ratio Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void getMarginAssetRiskBasedLiquidationRatioExample() throws ApiException {
        ApiResponse<GetMarginAssetRiskBasedLiquidationRatioResponse> response =
                getApi().getMarginAssetRiskBasedLiquidationRatio();
        System.out.println(response.getData());
    }
}
