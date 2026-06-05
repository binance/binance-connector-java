package com.binance.connector.client.derivatives_trading_usds_futures.rest.convert;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SendQuoteRequestRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.SendQuoteRequestResponse;

/** API examples for ConvertApi */
public class SendQuoteRequestExample {
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
     * Send Quote Request(USER_DATA)
     *
     * <p>Request a quote for the requested token pairs * Either fromAmount or toAmount should be
     * sent * &#x60;quoteId&#x60; will be returned only if you have enough funds to convert Weight:
     * 50(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void sendQuoteRequestExample() throws ApiException {
        SendQuoteRequestRequest sendQuoteRequestRequest = new SendQuoteRequestRequest();
        sendQuoteRequestRequest.fromAsset("");
        sendQuoteRequestRequest.toAsset("");
        ApiResponse<SendQuoteRequestResponse> response =
                getApi().sendQuoteRequest(sendQuoteRequestRequest);
        System.out.println(response.getData());
    }
}
