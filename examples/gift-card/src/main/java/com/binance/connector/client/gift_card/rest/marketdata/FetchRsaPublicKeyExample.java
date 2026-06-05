package com.binance.connector.client.gift_card.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.gift_card.rest.GiftCardRestApiUtil;
import com.binance.connector.client.gift_card.rest.api.GiftCardRestApi;
import com.binance.connector.client.gift_card.rest.model.FetchRsaPublicKeyResponse;

/** API examples for MarketDataApi */
public class FetchRsaPublicKeyExample {
    private GiftCardRestApi api;

    public GiftCardRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = GiftCardRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new GiftCardRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Fetch RSA Public Key(USER_DATA)
     *
     * <p>This API is for fetching the RSA Public Key. This RSA Public key will be used to encrypt
     * the card code. **Please note that the RSA Public key fetched is valid only for the current
     * day.** Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void fetchRsaPublicKeyExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<FetchRsaPublicKeyResponse> response = getApi().fetchRsaPublicKey(recvWindow);
        System.out.println(response.getData());
    }
}
