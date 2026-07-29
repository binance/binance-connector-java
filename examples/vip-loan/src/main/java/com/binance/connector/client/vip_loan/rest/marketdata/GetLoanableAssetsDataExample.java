package com.binance.connector.client.vip_loan.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.GetLoanableAssetsDataResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class GetLoanableAssetsDataExample {
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
     * Get Loanable Assets Data (USER_DATA)
     *
     * <p>Get interest rate and borrow limit of loanable assets. The borrow limit is shown in USD
     * value. Weight(IP): 400 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getLoanableAssetsDataExample() throws ApiException, IOException {
        String loanCoin = "BUSD";
        Long vipLevel = 1L;
        Long recvWindow = 5000L;
        ApiResponse<GetLoanableAssetsDataResponse> response =
                getApi().getLoanableAssetsData(loanCoin, vipLevel, recvWindow);
        System.out.println(response.getData());
    }
}
