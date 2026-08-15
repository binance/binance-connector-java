package com.binance.connector.client.vip_loan.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.VipLoanRepayRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanRepayResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class VipLoanRepayExample {
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
     * VIP Loan Repay (TRADE)
     *
     * <p>VIP loan is available for VIP users only. Weight(UID): 6000 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void vipLoanRepayExample() throws ApiException, IOException {
        VipLoanRepayRequest vipLoanRepayRequest = new VipLoanRepayRequest();
        vipLoanRepayRequest.orderId(1L);
        vipLoanRepayRequest.amount(1.0d);
        ApiResponse<VipLoanRepayResponse> response = getApi().vipLoanRepay(vipLoanRepayRequest);
        System.out.println(response.getData());
    }
}
