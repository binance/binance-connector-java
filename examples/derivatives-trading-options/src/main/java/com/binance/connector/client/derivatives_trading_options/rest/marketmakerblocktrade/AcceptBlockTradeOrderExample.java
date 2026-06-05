package com.binance.connector.client.derivatives_trading_options.rest.marketmakerblocktrade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.AcceptBlockTradeOrderRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.AcceptBlockTradeOrderResponse;

/** API examples for MarketMakerBlockTradeApi */
public class AcceptBlockTradeOrderExample {
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
     * Accept Block Trade Order (TRADE)
     *
     * <p>Accept a block trade order Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void acceptBlockTradeOrderExample() throws ApiException {
        AcceptBlockTradeOrderRequest acceptBlockTradeOrderRequest =
                new AcceptBlockTradeOrderRequest();
        acceptBlockTradeOrderRequest.blockOrderMatchingKey("");
        ApiResponse<AcceptBlockTradeOrderResponse> response =
                getApi().acceptBlockTradeOrder(acceptBlockTradeOrderRequest);
        System.out.println(response.getData());
    }
}
