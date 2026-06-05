package com.binance.connector.client.derivatives_trading_coin_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.NotionalBracketForPairResponse;

/** API examples for AccountApi */
public class NotionalBracketForPairExample {
    private DerivativesTradingCoinFuturesRestApi api;

    public DerivativesTradingCoinFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Notional Bracket for Pair(USER_DATA)
     *
     * <p>**Not recommended to continue using this v1 endpoint** Get the pair&#39;s default notional
     * bracket list, may return ambiguous values when there have been multiple different
     * &#x60;symbol&#x60; brackets under the &#x60;pair&#x60;, suggest using the following &#x60;GET
     * /dapi/v2/leverageBracket&#x60; query instead to get the specific &#x60;symbol&#x60; notional
     * bracket list. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void notionalBracketForPairExample() throws ApiException {
        String pair = "";
        Long recvWindow = 5000L;
        ApiResponse<NotionalBracketForPairResponse> response =
                getApi().notionalBracketForPair(pair, recvWindow);
        System.out.println(response.getData());
    }
}
