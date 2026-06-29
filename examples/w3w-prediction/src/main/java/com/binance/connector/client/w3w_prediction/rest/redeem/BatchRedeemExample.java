package com.binance.connector.client.w3w_prediction.rest.redeem;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.BatchRedeemRequest;
import com.binance.connector.client.w3w_prediction.rest.model.BatchRedeemResponse;
import com.binance.connector.client.w3w_prediction.rest.model.TokenIds;

/** API examples for RedeemApi */
public class BatchRedeemExample {
    private W3WPredictionRestApi api;

    public W3WPredictionRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    W3WPredictionRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new W3WPredictionRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Batch Redeem
     *
     * <p>Redeem one or more settled prediction tokens on-chain to claim winnings. Requires SAS
     * authorization. Weight(IP): 200 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void batchRedeemExample() throws ApiException {
        BatchRedeemRequest batchRedeemRequest = new BatchRedeemRequest();
        batchRedeemRequest.walletAddress("0x12e32db8817e292508c34111cbc4b23340df542c");
        batchRedeemRequest.walletId("5b5c1ec3be4e4416a5872b21c1ca5d20");
        batchRedeemRequest.tokenIds(new TokenIds());
        ApiResponse<BatchRedeemResponse> response = getApi().batchRedeem(batchRedeemRequest);
        System.out.println(response.getData());
    }
}
