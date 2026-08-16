package com.binance.connector.client.vip_loan.rest.userinformation;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.CheckVIPLoanCollateralAccountResponse;
import java.io.IOException;

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
     * <p>VIP loan is available for VIP users only Weight(IP): 6000 Security Type: USER_DATA Notes:
     * - If the logged-in account is a borrowing account, all collateral accounts bound to that
     * borrowing account can be queried. - If the logged-in account is a collateral account, only
     * collateral assets under that account can be queried.
     *
     * @throws ApiException if the Api call fails
     */
    public void checkVIPLoanCollateralAccountExample() throws ApiException, IOException {
        Long orderId = 1L;
        Long collateralAccountId = 1L;
        Long recvWindow = 5000L;
        ApiResponse<CheckVIPLoanCollateralAccountResponse> response =
                getApi().checkVIPLoanCollateralAccount(orderId, collateralAccountId, recvWindow);
        System.out.println(response.getData());
    }
}
