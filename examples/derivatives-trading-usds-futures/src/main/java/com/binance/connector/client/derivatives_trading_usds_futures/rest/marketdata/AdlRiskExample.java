package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AdlRiskResponse;

/** API examples for MarketDataApi */
public class AdlRiskExample {
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
     * ADL Risk
     *
     * <p>Query the symbol-level ADL risk rating. The ADL risk rating measures the likelihood of ADL
     * during liquidation, and the rating takes into account the insurance fund balance, position
     * concentration on the symbol, order book depth, price volatility, average leverage, unrealized
     * PnL, and margin utilization at the symbol level. The rating can be high, medium and low, and
     * is updated every 30 minutes. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void adlRiskExample() throws ApiException {
        String symbol = "";
        ApiResponse<AdlRiskResponse> response = getApi().adlRisk(symbol);
        System.out.println(response.getData());
    }
}
