package com.binance.connector.client.stocks.rest.tokenized;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.TokenizedRedeemResponse;
import java.io.IOException;

/** API examples for TokenizedApi */
public class TokenizedRedeemExample {
    private StocksRestApi api;

    public StocksRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = StocksRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StocksRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Tokenized Redeem (TRADE)
     *
     * <p>Redeem a tokenized asset back into the underlying equity. The caller&#39;s tokenized asset
     * (e.g. &#x60;AAPLB&#x60;) is burned, and the corresponding underlying equity (e.g.
     * &#x60;AAPL&#x60;) is released. The underlying asset is resolved server-side from
     * &#x60;tokenizedAsset&#x60;; callers only provide the tokenized asset and quantity. Redeem is
     * asynchronous: the endpoint returns an &#x60;issuerRequestId&#x60; immediately with a
     * transient status; poll &#x60;/tokenized/convert-status&#x60; to observe the terminal state,
     * or inspect &#x60;/tokenized/history&#x60; for the full record. Rate limit: 200 requests / min
     * (UID). Weight: 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void tokenizedRedeemExample() throws ApiException, IOException {
        String tokenizedAsset = "AAPLB";
        String tokenizedAssetAmount = "1";
        String clientOrderId = "redeem-client-id-32chars-000000001";
        Long recvWindow = 5000L;
        ApiResponse<TokenizedRedeemResponse> response =
                getApi().tokenizedRedeem(
                                tokenizedAsset, tokenizedAssetAmount, clientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
