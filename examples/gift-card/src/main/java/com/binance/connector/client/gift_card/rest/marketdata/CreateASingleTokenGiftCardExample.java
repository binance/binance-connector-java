package com.binance.connector.client.gift_card.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.gift_card.rest.GiftCardRestApiUtil;
import com.binance.connector.client.gift_card.rest.api.GiftCardRestApi;
import com.binance.connector.client.gift_card.rest.model.CreateASingleTokenGiftCardRequest;
import com.binance.connector.client.gift_card.rest.model.CreateASingleTokenGiftCardResponse;

/** API examples for MarketDataApi */
public class CreateASingleTokenGiftCardExample {
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
     * Create a single-token gift card (USER_DATA)
     *
     * <p>This API is for creating a Binance Gift Card. To get started with, please make sure: * You
     * have a Binance account * You have passed KYB * You have a sufﬁcient balance(Gift Card amount
     * and fee amount) in your Binance funding wallet * You need &#x60;Enable Withdrawals&#x60; for
     * the API Key which requests this endpoint. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void createASingleTokenGiftCardExample() throws ApiException {
        CreateASingleTokenGiftCardRequest createASingleTokenGiftCardRequest =
                new CreateASingleTokenGiftCardRequest();
        createASingleTokenGiftCardRequest.token("");
        createASingleTokenGiftCardRequest.amount(1.0d);
        ApiResponse<CreateASingleTokenGiftCardResponse> response =
                getApi().createASingleTokenGiftCard(createASingleTokenGiftCardRequest);
        System.out.println(response.getData());
    }
}
