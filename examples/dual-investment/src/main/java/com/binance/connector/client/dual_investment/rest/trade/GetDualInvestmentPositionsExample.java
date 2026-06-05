package com.binance.connector.client.dual_investment.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.dual_investment.rest.DualInvestmentRestApiUtil;
import com.binance.connector.client.dual_investment.rest.api.DualInvestmentRestApi;
import com.binance.connector.client.dual_investment.rest.model.GetDualInvestmentPositionsResponse;

/** API examples for TradeApi */
public class GetDualInvestmentPositionsExample {
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
     * Get Dual Investment positions(USER_DATA)
     *
     * <p>Get Dual Investment positions (batch) Weight: 1(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void getDualInvestmentPositionsExample() throws ApiException {
        String status = "";
        Long pageSize = 10L;
        Long pageIndex = 1L;
        Long recvWindow = 5000L;
        ApiResponse<GetDualInvestmentPositionsResponse> response =
                getApi().getDualInvestmentPositions(status, pageSize, pageIndex, recvWindow);
        System.out.println(response.getData());
    }
}
