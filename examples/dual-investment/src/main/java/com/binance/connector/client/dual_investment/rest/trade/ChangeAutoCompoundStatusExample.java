package com.binance.connector.client.dual_investment.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.dual_investment.rest.DualInvestmentRestApiUtil;
import com.binance.connector.client.dual_investment.rest.api.DualInvestmentRestApi;
import com.binance.connector.client.dual_investment.rest.model.ChangeAutoCompoundStatusRequest;
import com.binance.connector.client.dual_investment.rest.model.ChangeAutoCompoundStatusResponse;

/** API examples for TradeApi */
public class ChangeAutoCompoundStatusExample {
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
     * Change Auto-Compound status(USER_DATA)
     *
     * <p>Change Auto-Compound status Weight: 1(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void changeAutoCompoundStatusExample() throws ApiException {
        ChangeAutoCompoundStatusRequest changeAutoCompoundStatusRequest =
                new ChangeAutoCompoundStatusRequest();
        changeAutoCompoundStatusRequest.positionId("1");
        ApiResponse<ChangeAutoCompoundStatusResponse> response =
                getApi().changeAutoCompoundStatus(changeAutoCompoundStatusRequest);
        System.out.println(response.getData());
    }
}
