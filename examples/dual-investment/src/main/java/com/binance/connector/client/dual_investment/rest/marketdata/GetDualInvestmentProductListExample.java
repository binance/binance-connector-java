package com.binance.connector.client.dual_investment.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.dual_investment.rest.DualInvestmentRestApiUtil;
import com.binance.connector.client.dual_investment.rest.api.DualInvestmentRestApi;
import com.binance.connector.client.dual_investment.rest.model.GetDualInvestmentProductListResponse;

/** API examples for MarketDataApi */
public class GetDualInvestmentProductListExample {
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
     * Get Dual Investment product list
     *
     * <p>Get Dual Investment product list Weight: 1(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void getDualInvestmentProductListExample() throws ApiException {
        String optionType = "";
        String exercisedCoin = "";
        String investCoin = "";
        Long pageSize = 10L;
        Long pageIndex = 1L;
        Long recvWindow = 5000L;
        ApiResponse<GetDualInvestmentProductListResponse> response =
                getApi().getDualInvestmentProductList(
                                optionType,
                                exercisedCoin,
                                investCoin,
                                pageSize,
                                pageIndex,
                                recvWindow);
        System.out.println(response.getData());
    }
}
