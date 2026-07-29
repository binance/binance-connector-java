package com.binance.connector.client.convert.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.convert.rest.ConvertRestApiUtil;
import com.binance.connector.client.convert.rest.api.ConvertRestApi;
import com.binance.connector.client.convert.rest.model.ExpiredType;
import com.binance.connector.client.convert.rest.model.PlaceLimitOrderRequest;
import com.binance.connector.client.convert.rest.model.PlaceLimitOrderResponse;
import com.binance.connector.client.convert.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class PlaceLimitOrderExample {
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
     * Place limit order (TRADE)
     *
     * <p>Enable users to place a limit order Weight(UID): 500 Security Type: TRADE Notes: -
     * &#x60;baseAsset&#x60; and &#x60;quoteAsset&#x60; can be determined via the
     * &#x60;exchangeInfo&#x60; endpoint. - Limit price is defined from &#x60;baseAsset&#x60; to
     * &#x60;quoteAsset&#x60;. - Exactly one of &#x60;baseAmount&#x60; or &#x60;quoteAmount&#x60;
     * should be sent.
     *
     * @throws ApiException if the Api call fails
     */
    public void placeLimitOrderExample() throws ApiException, IOException {
        PlaceLimitOrderRequest placeLimitOrderRequest = new PlaceLimitOrderRequest();
        placeLimitOrderRequest.baseAsset("BTC");
        placeLimitOrderRequest.quoteAsset("USDT");
        placeLimitOrderRequest.limitPrice(1d);
        placeLimitOrderRequest.side(Side.BUY);
        placeLimitOrderRequest.expiredType(ExpiredType.EXPIRED_TYPE_1_D);
        ApiResponse<PlaceLimitOrderResponse> response =
                getApi().placeLimitOrder(placeLimitOrderRequest);
        System.out.println(response.getData());
    }
}
