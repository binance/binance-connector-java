package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.AssetDividendRecordResponse;

/** API examples for AssetApi */
public class AssetDividendRecordExample {
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
     * Asset Dividend Record (USER_DATA)
     *
     * <p>Query asset dividend record. * There cannot be more than 180 days between parameter
     * &#x60;startTime&#x60; and &#x60;endTime&#x60;. Weight: 10
     *
     * @throws ApiException if the Api call fails
     */
    public void assetDividendRecordExample() throws ApiException {
        String asset = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 7L;
        Long recvWindow = 5000L;
        ApiResponse<AssetDividendRecordResponse> response =
                getApi().assetDividendRecord(asset, startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
