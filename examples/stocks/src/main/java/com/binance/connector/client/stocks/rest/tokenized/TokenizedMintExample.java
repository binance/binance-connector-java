package com.binance.connector.client.stocks.rest.tokenized;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.TokenizedMintResponse;
import java.io.IOException;

/** API examples for TokenizedApi */
public class TokenizedMintExample {
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
     * Tokenized Mint (TRADE)
     *
     * <p>Mint a tokenized asset from an underlying equity holding. The caller&#39;s underlying
     * equity (e.g. &#x60;AAPL&#x60;) is burned (or locked), and the corresponding tokenized asset
     * (e.g. &#x60;AAPLB&#x60;) is credited. The tokenized asset is resolved server-side from
     * &#x60;underlyingAsset&#x60;; callers only provide the underlying ticker and quantity. Mint is
     * asynchronous: the endpoint returns an &#x60;issuerRequestId&#x60; immediately with a
     * transient status; poll &#x60;/tokenized/convert-status&#x60; to observe the terminal state,
     * or inspect &#x60;/tokenized/history&#x60; for the full record. Rate limit: 50 requests / min
     * (UID). Weight: 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void tokenizedMintExample() throws ApiException, IOException {
        String underlyingAsset = "AAPL";
        String underlyingAssetAmount = "1";
        String clientOrderId = "mint-client-id-32chars-0000000001";
        Long recvWindow = 5000L;
        ApiResponse<TokenizedMintResponse> response =
                getApi().tokenizedMint(
                                underlyingAsset, underlyingAssetAmount, clientOrderId, recvWindow);
        System.out.println(response.getData());
    }
}
