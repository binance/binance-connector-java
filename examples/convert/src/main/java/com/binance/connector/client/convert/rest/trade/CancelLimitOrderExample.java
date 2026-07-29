package com.binance.connector.client.convert.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.api.ConvertRestApi;
import com.binance.connector.client.convert.rest.model.CancelLimitOrderRequest;
import com.binance.connector.client.convert.rest.model.CancelLimitOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CancelLimitOrderExample {
    private ConvertRestApi api;

    public ConvertRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = ConvertRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new ConvertRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Cancel limit order (TRADE)
     *
     * <p>Enable users to cancel a limit order Weight(UID): 200 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void cancelLimitOrderExample() throws ApiException, IOException {
        CancelLimitOrderRequest cancelLimitOrderRequest = new CancelLimitOrderRequest();
        cancelLimitOrderRequest.orderId(1603680255057330400L);
        ApiResponse<CancelLimitOrderResponse> response =
                getApi().cancelLimitOrder(cancelLimitOrderRequest);
        System.out.println(response.getData());
    }
}
