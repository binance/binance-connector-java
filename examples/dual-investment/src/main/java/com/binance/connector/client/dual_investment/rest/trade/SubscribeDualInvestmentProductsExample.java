package com.binance.connector.client.dual_investment.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.dual_investment.rest.DualInvestmentRestApiUtil;
import com.binance.connector.client.dual_investment.rest.api.DualInvestmentRestApi;
import com.binance.connector.client.dual_investment.rest.model.AutoCompoundPlan;
import com.binance.connector.client.dual_investment.rest.model.SubscribeDualInvestmentProductsRequest;
import com.binance.connector.client.dual_investment.rest.model.SubscribeDualInvestmentProductsResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class SubscribeDualInvestmentProductsExample {
    private DualInvestmentRestApi api;

    public DualInvestmentRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DualInvestmentRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DualInvestmentRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Subscribe Dual Investment products (USER_DATA)
     *
     * <p>Subscribe Dual Investment products Weight(IP): 1 Security Type: USER_DATA Notes: - Failed
     * messages: - Products are not available. This means APR changed to a lower value, or the order
     * is unavailable. - Failed. This means system or network errors.
     *
     * @throws ApiException if the Api call fails
     */
    public void subscribeDualInvestmentProductsExample() throws ApiException, IOException {
        SubscribeDualInvestmentProductsRequest subscribeDualInvestmentProductsRequest =
                new SubscribeDualInvestmentProductsRequest();
        subscribeDualInvestmentProductsRequest.id("741590");
        subscribeDualInvestmentProductsRequest.orderId("8257205859");
        subscribeDualInvestmentProductsRequest.depositAmount(1d);
        subscribeDualInvestmentProductsRequest.autoCompoundPlan(AutoCompoundPlan.NONE);
        ApiResponse<SubscribeDualInvestmentProductsResponse> response =
                getApi().subscribeDualInvestmentProducts(subscribeDualInvestmentProductsRequest);
        System.out.println(response.getData());
    }
}
