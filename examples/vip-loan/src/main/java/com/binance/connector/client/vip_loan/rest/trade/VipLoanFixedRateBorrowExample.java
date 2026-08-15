package com.binance.connector.client.vip_loan.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.VipLoanFixedRateBorrowRequest;
import com.binance.connector.client.vip_loan.rest.model.VipLoanFixedRateBorrowResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class VipLoanFixedRateBorrowExample {
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
     * VIP Loan Fixed Rate Borrow (TRADE)
     *
     * <p>Submit a fixed rate borrow request by matching market supply orders. Weight(UID): 6000
     * Security Type: TRADE Notes: - **Rate limit:** 2 requests per second per account. - When
     * multiple &#x60;supplyRequest&#x60; entries are provided, all &#x60;requestId&#x60; values
     * must correspond to the same &#x60;borrowCoin&#x60; and &#x60;loanTerm&#x60; (validated by
     * collateral facade).
     *
     * @throws ApiException if the Api call fails
     */
    public void vipLoanFixedRateBorrowExample() throws ApiException, IOException {
        VipLoanFixedRateBorrowRequest vipLoanFixedRateBorrowRequest =
                new VipLoanFixedRateBorrowRequest();
        vipLoanFixedRateBorrowRequest.supplyRequest("1212:0.12:100;3434:0.13:50");
        vipLoanFixedRateBorrowRequest.borrowCoin("BUSD");
        vipLoanFixedRateBorrowRequest.loanTerm(30L);
        vipLoanFixedRateBorrowRequest.borrowUid(12345678L);
        vipLoanFixedRateBorrowRequest.collateralCoin("BNB,ETH,BTC");
        vipLoanFixedRateBorrowRequest.collateralAccountId("12345,67890,13579");
        ApiResponse<VipLoanFixedRateBorrowResponse> response =
                getApi().vipLoanFixedRateBorrow(vipLoanFixedRateBorrowRequest);
        System.out.println(response.getData());
    }
}
