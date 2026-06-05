package com.binance.connector.client.derivatives_trading_options.rest.marketmakerblocktrade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_options.rest.DerivativesTradingOptionsRestApiUtil;
import com.binance.connector.client.derivatives_trading_options.rest.api.DerivativesTradingOptionsRestApi;
import com.binance.connector.client.derivatives_trading_options.rest.model.ExtendBlockTradeOrderRequest;
import com.binance.connector.client.derivatives_trading_options.rest.model.ExtendBlockTradeOrderResponse;

/** API examples for MarketMakerBlockTradeApi */
public class ExtendBlockTradeOrderExample {
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
     * Extend Block Trade Order (TRADE)
     *
     * <p>Extends a block trade expire time by 30 mins from the current time. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void extendBlockTradeOrderExample() throws ApiException {
        ExtendBlockTradeOrderRequest extendBlockTradeOrderRequest =
                new ExtendBlockTradeOrderRequest();
        extendBlockTradeOrderRequest.blockOrderMatchingKey("");
        ApiResponse<ExtendBlockTradeOrderResponse> response =
                getApi().extendBlockTradeOrder(extendBlockTradeOrderRequest);
        System.out.println(response.getData());
    }
}
