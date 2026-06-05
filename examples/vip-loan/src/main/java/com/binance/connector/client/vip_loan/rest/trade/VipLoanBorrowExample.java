package com.binance.connector.client.vip_loan.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.VipLoanBorrowRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanBorrowResponse;

/** API examples for TradeApi */
public class VipLoanBorrowExample {
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
     * VIP Loan Borrow(TRADE)
     *
     * <p>VIP loan is available for VIP users only. * loanAccountId refer to loan receiving account
     * * Only master account applications are supported * loanAccountId and collateralAccountId
     * under same master account * loanTerm is mandatory if user choose stable rate Weight: 0
     *
     * @throws ApiException if the Api call fails
     */
    public void vipLoanBorrowExample() throws ApiException {
        VipLoanBorrowRequest vipLoanBorrowRequest = new VipLoanBorrowRequest();
        vipLoanBorrowRequest.loanAccountId(1L);
        vipLoanBorrowRequest.loanCoin("");
        vipLoanBorrowRequest.loanAmount(1.0d);
        vipLoanBorrowRequest.collateralAccountId(1L);
        vipLoanBorrowRequest.collateralCoin("");
        vipLoanBorrowRequest.isFlexibleRate(true);
        ApiResponse<VipLoanBorrowResponse> response = getApi().vipLoanBorrow(vipLoanBorrowRequest);
        System.out.println(response.getData());
    }
}
