package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.QuarterlyContractSettlementPriceResponse;

/** API examples for MarketDataApi */
public class QuarterlyContractSettlementPriceExample {
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
     * Quarterly Contract Settlement Price
     *
     * <p>Latest price for a symbol or symbols. Weight: 0
     *
     * @throws ApiException if the Api call fails
     */
    public void quarterlyContractSettlementPriceExample() throws ApiException {
        String pair = "";
        ApiResponse<QuarterlyContractSettlementPriceResponse> response =
                getApi().quarterlyContractSettlementPrice(pair);
        System.out.println(response.getData());
    }
}
