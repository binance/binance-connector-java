package com.binance.connector.client.crypto_loan.rest.flexiblerate;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.crypto_loan.rest.CryptoLoanRestApiUtil;
import com.binance.connector.client.crypto_loan.rest.api.CryptoLoanRestApi;
import com.binance.connector.client.crypto_loan.rest.model.Direction;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanAdjustLtvRequest;
import com.binance.connector.client.crypto_loan.rest.model.FlexibleLoanAdjustLtvResponse;
import java.io.IOException;

/** API examples for FlexibleRateApi */
public class FlexibleLoanAdjustLtvExample {
    private CryptoLoanRestApi api;

    public CryptoLoanRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    CryptoLoanRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new CryptoLoanRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Flexible Loan Adjust LTV (TRADE)
     *
     * <p>Flexible Loan Adjust LTV Weight(UID): 6000 Security Type: TRADE Notes: - API key needs
     * Spot &amp; Margin Trading permission for this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    public void flexibleLoanAdjustLtvExample() throws ApiException, IOException {
        FlexibleLoanAdjustLtvRequest flexibleLoanAdjustLtvRequest =
                new FlexibleLoanAdjustLtvRequest();
        flexibleLoanAdjustLtvRequest.loanCoin("BUSD");
        flexibleLoanAdjustLtvRequest.collateralCoin("BNB");
        flexibleLoanAdjustLtvRequest.adjustmentAmount(1d);
        flexibleLoanAdjustLtvRequest.direction(Direction.ADDITIONAL);
        ApiResponse<FlexibleLoanAdjustLtvResponse> response =
                getApi().flexibleLoanAdjustLtv(flexibleLoanAdjustLtvRequest);
        System.out.println(response.getData());
    }
}
