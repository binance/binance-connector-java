package com.binance.connector.client.derivatives_trading_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.TradfiOptionsContractRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.TradfiOptionsContractResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class TradfiOptionsContractExample {
    private DerivativesTradingOptionsRestApi api;

    public DerivativesTradingOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * TradFi Options Contract (USER_DATA)
     *
     * <p>Sign TradFi Options agreement contract Weight(IP): 50 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void tradfiOptionsContractExample() throws ApiException, IOException {
        TradfiOptionsContractRequest tradfiOptionsContractRequest =
                new TradfiOptionsContractRequest();
        ApiResponse<TradfiOptionsContractResponse> response =
                getApi().tradfiOptionsContract(tradfiOptionsContractRequest);
        System.out.println(response.getData());
    }
}
