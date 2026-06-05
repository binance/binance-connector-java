package com.binance.connector.client.vip_loan.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.VipLoanRenewRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanRenewResponse;

/** API examples for TradeApi */
public class VipLoanRenewExample {
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
     * VIP Loan Renew(TRADE)
     *
     * <p>VIP loan is available for VIP users only. Weight: 6000
     *
     * @throws ApiException if the Api call fails
     */
    public void vipLoanRenewExample() throws ApiException {
        VipLoanRenewRequest vipLoanRenewRequest = new VipLoanRenewRequest();
        vipLoanRenewRequest.orderId(1L);
        vipLoanRenewRequest.loanTerm(0L);
        ApiResponse<VipLoanRenewResponse> response = getApi().vipLoanRenew(vipLoanRenewRequest);
        System.out.println(response.getData());
    }
}
