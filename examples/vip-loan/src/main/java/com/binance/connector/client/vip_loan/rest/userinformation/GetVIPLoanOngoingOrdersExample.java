package com.binance.connector.client.vip_loan.rest.userinformation;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.GetVIPLoanOngoingOrdersResponse;

/** API examples for UserInformationApi */
public class GetVIPLoanOngoingOrdersExample {
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
     * Get VIP Loan Ongoing Orders(USER_DATA)
     *
     * <p>VIP loan is available for VIP users only. Weight: 400
     *
     * @throws ApiException if the Api call fails
     */
    public void getVIPLoanOngoingOrdersExample() throws ApiException {
        Long orderId = 1L;
        Long collateralAccountId = 1L;
        String loanCoin = "";
        String collateralCoin = "";
        Long current = 1L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetVIPLoanOngoingOrdersResponse> response =
                getApi().getVIPLoanOngoingOrders(
                                orderId,
                                collateralAccountId,
                                loanCoin,
                                collateralCoin,
                                current,
                                limit,
                                recvWindow);
        System.out.println(response.getData());
    }
}
