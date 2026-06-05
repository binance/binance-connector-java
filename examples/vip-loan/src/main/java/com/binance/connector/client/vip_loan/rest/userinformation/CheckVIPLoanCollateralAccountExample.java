package com.binance.connector.client.vip_loan.rest.userinformation;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.CheckVIPLoanCollateralAccountResponse;

/** API examples for UserInformationApi */
public class CheckVIPLoanCollateralAccountExample {
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
     * Check VIP Loan Collateral Account (USER_DATA)
     *
     * <p>VIP loan is available for VIP users only * If the login account is loan account, all
     * collateral accounts under the loan account can be queried. * If the login account is
     * collateral account, only the current collateral account can be queried. Weight: 6000
     *
     * @throws ApiException if the Api call fails
     */
    public void checkVIPLoanCollateralAccountExample() throws ApiException {
        Long orderId = 1L;
        Long collateralAccountId = 1L;
        Long recvWindow = 5000L;
        ApiResponse<CheckVIPLoanCollateralAccountResponse> response =
                getApi().checkVIPLoanCollateralAccount(orderId, collateralAccountId, recvWindow);
        System.out.println(response.getData());
    }
}
