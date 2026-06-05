package com.binance.connector.client.convert.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.api.ConvertRestApi;
import com.binance.connector.client.convert.rest.model.AcceptQuoteRequest;
import com.binance.connector.client.convert.rest.model.AcceptQuoteResponse;

/** API examples for TradeApi */
public class AcceptQuoteExample {
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
     * Accept Quote (TRADE)
     *
     * <p>Accept the offered quote by quote ID. Weight: 500(UID)
     *
     * @throws ApiException if the Api call fails
     */
    public void acceptQuoteExample() throws ApiException {
        AcceptQuoteRequest acceptQuoteRequest = new AcceptQuoteRequest();
        acceptQuoteRequest.quoteId("1");
        ApiResponse<AcceptQuoteResponse> response = getApi().acceptQuote(acceptQuoteRequest);
        System.out.println(response.getData());
    }
}
