package com.binance.connector.client.gift_card.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.gift_card.rest.GiftCardRestApiUtil;
import com.binance.connector.client.gift_card.rest.api.GiftCardRestApi;
import com.binance.connector.client.gift_card.rest.model.RedeemABinanceGiftCardRequest;
import com.binance.connector.client.gift_card.rest.model.RedeemABinanceGiftCardResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class RedeemABinanceGiftCardExample {
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
     * Redeem a Binance Gift Card (USER_DATA)
     *
     * <p>This API is for redeeming a Binance Gift Card. Once redeemed, the coins will be deposited
     * in your funding wallet. Weight(IP): 1 Security Type: USER_DATA Notes: - Parameter
     * &#x60;code&#x60; can be sent in two formats: &#x60;Plaintext&#x60; and &#x60;Encrypted&#x60;.
     * - Sending &#x60;code&#x60; in encrypted format is more secure than plaintext. - To send
     * encrypted &#x60;code&#x60;: - Fetch RSA public key from &#x60;GET
     * /sapi/v1/giftcard/cryptography/rsa-public-key&#x60;. - Encrypt card code using
     * &#x60;RSA/ECB/OAEPWithSHA-256AndMGF1Padding&#x60;. - If you enter the wrong redemption code 5
     * times within 24 hours, you will no longer be able to redeem any Binance Gift Cards that day.
     *
     * @throws ApiException if the Api call fails
     */
    public void redeemABinanceGiftCardExample() throws ApiException, IOException {
        RedeemABinanceGiftCardRequest redeemABinanceGiftCardRequest =
                new RedeemABinanceGiftCardRequest();
        redeemABinanceGiftCardRequest.code("6H9EKF5ECCWFBHGE");
        ApiResponse<RedeemABinanceGiftCardResponse> response =
                getApi().redeemABinanceGiftCard(redeemABinanceGiftCardRequest);
        System.out.println(response.getData());
    }
}
