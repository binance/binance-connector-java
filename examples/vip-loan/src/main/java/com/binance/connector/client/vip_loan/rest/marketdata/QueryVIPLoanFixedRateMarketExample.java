package com.binance.connector.client.vip_loan.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.vip_loan.rest.VipLoanRestApiUtil;
import com.binance.connector.client.vip_loan.rest.api.VipLoanRestApi;
import com.binance.connector.client.vip_loan.rest.model.QueryVIPLoanFixedRateMarketResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class QueryVIPLoanFixedRateMarketExample {
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
     * Query VIP Loan Fixed Rate Market (USER_DATA)
     *
     * <p>Query the VIP Loan fixed rate market. Returns a paginated list of fixed-rate supply
     * orders. Weight(IP): 6000 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryVIPLoanFixedRateMarketExample() throws ApiException, IOException {
        String loanCoin = "USDT";
        Long duration = 30L;
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<QueryVIPLoanFixedRateMarketResponse> response =
                getApi().queryVIPLoanFixedRateMarket(loanCoin, duration, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
