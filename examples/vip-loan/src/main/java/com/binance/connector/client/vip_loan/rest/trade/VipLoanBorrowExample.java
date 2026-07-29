package com.binance.connector.client.vip_loan.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.VipLoanBorrowRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanBorrowResponse;
import java.io.IOException;

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
     * VIP Loan Borrow (TRADE)
     *
     * <p>VIP loan is available for VIP users only. Weight(UID): 6000 Security Type: TRADE Notes: -
     * &#x60;loanAccountId&#x60; refers to the loan receiving account. - Only master account
     * applications are supported. - &#x60;loanAccountId&#x60; and &#x60;collateralAccountId&#x60;
     * must be under the same master account. - &#x60;loanTerm&#x60; is mandatory if the user
     * chooses a fixed rate (&#x60;isFlexibleRate &#x3D; FALSE&#x60;).
     *
     * @throws ApiException if the Api call fails
     */
    public void vipLoanBorrowExample() throws ApiException, IOException {
        VipLoanBorrowRequest vipLoanBorrowRequest = new VipLoanBorrowRequest();
        vipLoanBorrowRequest.loanAccountId(1L);
        vipLoanBorrowRequest.loanCoin("BTC");
        vipLoanBorrowRequest.loanAmount(1.0d);
        vipLoanBorrowRequest.collateralAccountId("12345678,12345678,12345678");
        vipLoanBorrowRequest.collateralCoin("BUSD,USDT,ETH");
        vipLoanBorrowRequest.isFlexibleRate(true);
        ApiResponse<VipLoanBorrowResponse> response = getApi().vipLoanBorrow(vipLoanBorrowRequest);
        System.out.println(response.getData());
    }
}
