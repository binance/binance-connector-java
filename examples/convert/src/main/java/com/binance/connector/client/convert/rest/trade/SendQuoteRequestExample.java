package com.binance.connector.client.convert.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.api.ConvertRestApi;
import com.binance.connector.client.convert.rest.model.SendQuoteRequestRequest;
import com.binance.connector.client.convert.rest.model.SendQuoteRequestResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class SendQuoteRequestExample {
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
     * Send Quote Request (TRADE)
     *
     * <p>Request a quote for the requested token pairs Weight(UID): 200 Security Type: TRADE Notes:
     * - Either &#x60;fromAmount&#x60; or &#x60;toAmount&#x60; should be sent. - &#x60;quoteId&#x60;
     * is returned only if you have enough funds to convert.
     *
     * @throws ApiException if the Api call fails
     */
    public void sendQuoteRequestExample() throws ApiException, IOException {
        SendQuoteRequestRequest sendQuoteRequestRequest = new SendQuoteRequestRequest();
        sendQuoteRequestRequest.fromAsset("BTC");
        sendQuoteRequestRequest.toAsset("USDT");
        ApiResponse<SendQuoteRequestResponse> response =
                getApi().sendQuoteRequest(sendQuoteRequestRequest);
        System.out.println(response.getData());
    }
}
