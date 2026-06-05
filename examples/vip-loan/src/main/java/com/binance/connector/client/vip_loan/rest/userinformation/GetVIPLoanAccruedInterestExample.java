package com.binance.connector.client.vip_loan.rest.userinformation;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.GetVIPLoanAccruedInterestResponse;

/** API examples for UserInformationApi */
public class GetVIPLoanAccruedInterestExample {
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
     * Get VIP Loan Accrued Interest (USER_DATA)
     *
     * <p>Check VIP Loan interest record * If startTime and endTime are not sent, the recent 90-day
     * data will be returned. * The max interval between startTime and endTime is 90 days. Weight:
     * 400
     *
     * @throws ApiException if the Api call fails
     */
    public void getVIPLoanAccruedInterestExample() throws ApiException {
        Long orderId = 1L;
        String loanCoin = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long limit = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetVIPLoanAccruedInterestResponse> response =
                getApi().getVIPLoanAccruedInterest(
                                orderId, loanCoin, startTime, endTime, current, limit, recvWindow);
        System.out.println(response.getData());
    }
}
