package com.binance.connector.client.vip_loan.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.GetVIPLoanInterestRateHistoryResponse;

/** API examples for MarketDataApi */
public class GetVIPLoanInterestRateHistoryExample {
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
     * Get VIP Loan Interest Rate History (USER_DATA)
     *
     * <p>Check VIP Loan flexible interest rate history * If startTime and endTime are not sent, the
     * recent 90-day data will be returned * The max interval between startTime and end Time is 180
     * days. * Time based on UTC+0. Weight: 400
     *
     * @throws ApiException if the Api call fails
     */
    public void getVIPLoanInterestRateHistoryExample() throws ApiException {
        String coin = "";
        Long recvWindow = 5000L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long limit = 10L;
        ApiResponse<GetVIPLoanInterestRateHistoryResponse> response =
                getApi().getVIPLoanInterestRateHistory(
                                coin, recvWindow, startTime, endTime, current, limit);
        System.out.println(response.getData());
    }
}
