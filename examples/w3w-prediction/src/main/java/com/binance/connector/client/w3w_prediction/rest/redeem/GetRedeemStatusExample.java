package com.binance.connector.client.w3w_prediction.rest.redeem;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.GetRedeemStatusResponse;

/** API examples for RedeemApi */
public class GetRedeemStatusExample {
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
     * Get Redeem Status
     *
     * <p>Query the on-chain transaction status of a previously submitted redeem request.
     * Weight(IP): 200 Security Type: USER_DATA Response Notes: - Status values: | Value |
     * Description | | ----------- | -------------------------------------------- | |
     * &#x60;PENDING&#x60; | Transaction submitted, awaiting confirmation | | &#x60;CONFIRMED&#x60;
     * | Transaction confirmed on-chain | | &#x60;FAILED&#x60; | Transaction failed | |
     * &#x60;NOT_FOUND&#x60; | Transaction hash not found |
     *
     * @throws ApiException if the Api call fails
     */
    public void getRedeemStatusExample() throws ApiException {
        String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c";
        String txHash = "0xabc123def456789abcdef123456789abcdef123456789abcdef123456789abcd";
        Long recvWindow = 5000L;
        ApiResponse<GetRedeemStatusResponse> response =
                getApi().getRedeemStatus(walletAddress, txHash, recvWindow);
        System.out.println(response.getData());
    }
}
