package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.GetCloudMiningPaymentAndRefundHistoryResponse;

/** API examples for AssetApi */
public class GetCloudMiningPaymentAndRefundHistoryExample {
    private WalletRestApi api;

    public WalletRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = WalletRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new WalletRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Cloud-Mining payment and refund history (USER_DATA)
     *
     * <p>The query of Cloud-Mining payment and refund history * Just return the SUCCESS records of
     * payment and refund. * For response, type &#x3D; 248 means payment, type &#x3D; 249 means
     * refund, status &#x3D;S means SUCCESS. Weight: 600
     *
     * @throws ApiException if the Api call fails
     */
    public void getCloudMiningPaymentAndRefundHistoryExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long tranId = 1L;
        String clientTranId = "1";
        String asset = "";
        Long current = 1L;
        Long size = 10L;
        ApiResponse<GetCloudMiningPaymentAndRefundHistoryResponse> response =
                getApi().getCloudMiningPaymentAndRefundHistory(
                                startTime, endTime, tranId, clientTranId, asset, current, size);
        System.out.println(response.getData());
    }
}
