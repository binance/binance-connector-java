package com.binance.connector.client.vip_loan.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.GetBorrowInterestRateResponse;

/** API examples for MarketDataApi */
public class GetBorrowInterestRateExample {
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
     * Get Borrow Interest Rate(USER_DATA)
     *
     * <p>Get Borrow Interest Rate Weight: 400
     *
     * @throws ApiException if the Api call fails
     */
    public void getBorrowInterestRateExample() throws ApiException {
        String loanCoin = "";
        Long recvWindow = 5000L;
        ApiResponse<GetBorrowInterestRateResponse> response =
                getApi().getBorrowInterestRate(loanCoin, recvWindow);
        System.out.println(response.getData());
    }
}
