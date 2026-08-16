package com.binance.connector.client.nft.rest.nft;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.nft.rest.NftRestApiUtil;
import com.binance.connector.client.nft.rest.api.NftRestApi;
import com.binance.connector.client.nft.rest.model.GetNFTDepositHistoryResponse;

/** API examples for NftApi */
public class GetNFTDepositHistoryExample {
    private NftRestApi api;

    public NftRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = NftRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new NftRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get NFT Deposit History(USER_DATA)
     *
     * <p>et NFT Deposit History * The max interval between startTime and endTime is 90 days. * If
     * startTime and endTime are not sent, the recent 7 days&#39; data will be returned. Weight:
     * 3000
     *
     * @throws ApiException if the Api call fails
     */
    public void getNFTDepositHistoryExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 50L;
        Long page = 1L;
        Long recvWindow = 5000L;
        ApiResponse<GetNFTDepositHistoryResponse> response =
                getApi().getNFTDepositHistory(startTime, endTime, limit, page, recvWindow);
        System.out.println(response.getData());
    }
}
