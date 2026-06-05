package com.binance.connector.client.vip_loan.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.GetCollateralAssetDataResponse;

/** API examples for MarketDataApi */
public class GetCollateralAssetDataExample {
    private VipLoanRestApi api;

    public VipLoanRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = VipLoanRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new VipLoanRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Collateral Asset Data(USER_DATA)
     *
     * <p>Get Collateral Asset Data Weight: 400
     *
     * @throws ApiException if the Api call fails
     */
    public void getCollateralAssetDataExample() throws ApiException {
        String collateralCoin = "";
        Long recvWindow = 5000L;
        ApiResponse<GetCollateralAssetDataResponse> response =
                getApi().getCollateralAssetData(collateralCoin, recvWindow);
        System.out.println(response.getData());
    }
}
