package com.binance.connector.client.vip_loan.rest.userinformation;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.GetVIPLoanRepaymentHistoryResponse;
import java.io.IOException;

/** API examples for UserInformationApi */
public class GetVIPLoanRepaymentHistoryExample {
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
     * Get VIP Loan Repayment History (USER_DATA)
     *
     * <p>VIP Loans are available only to VIP users. Weight(IP): 400 Security Type: USER_DATA Notes:
     * - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, recent 90-day data is
     * returned. - The maximum interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 180
     * days.
     *
     * @throws ApiException if the Api call fails
     */
    public void getVIPLoanRepaymentHistoryExample() throws ApiException, IOException {
        Long orderId = 1L;
        String loanCoin = "BUSD";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetVIPLoanRepaymentHistoryResponse> response =
                getApi().getVIPLoanRepaymentHistory(
                                orderId, loanCoin, startTime, endTime, current, limit, recvWindow);
        System.out.println(response.getData());
    }
}
