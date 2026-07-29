package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.FuturesTradfiPerpsContractRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.FuturesTradfiPerpsContractResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class FuturesTradfiPerpsContractExample {
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
     * Futures TradFi Perps Contract (USER_DATA)
     *
     * <p>Sign TradFi-Perps agreement contract Weight(IP): 50 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void futuresTradfiPerpsContractExample() throws ApiException, IOException {
        FuturesTradfiPerpsContractRequest futuresTradfiPerpsContractRequest =
                new FuturesTradfiPerpsContractRequest();
        ApiResponse<FuturesTradfiPerpsContractResponse> response =
                getApi().futuresTradfiPerpsContract(futuresTradfiPerpsContractRequest);
        System.out.println(response.getData());
    }
}
