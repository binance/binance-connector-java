package com.binance.connector.client.w3w_prediction.rest.wallet;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.GetPortfolioResponse;

/** API examples for WalletApi */
public class GetPortfolioExample {
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
     * Get Portfolio
     *
     * <p>Get the authenticated user&#39;s prediction portfolio overview including active positions
     * count, aggregated PnL, and full position list. Weight(IP): 200 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getPortfolioExample() throws ApiException {
        String walletAddress = "0x12e32db8817e292508c34111cbc4b23340df542c";
        String tokenId = "112233";
        Long marketId = 5567895L;
        Long marketTopicId = 4229564L;
        Boolean activeOnly = false;
        Long recvWindow = 5000L;
        ApiResponse<GetPortfolioResponse> response =
                getApi().getPortfolio(
                                walletAddress,
                                tokenId,
                                marketId,
                                marketTopicId,
                                activeOnly,
                                recvWindow);
        System.out.println(response.getData());
    }
}
