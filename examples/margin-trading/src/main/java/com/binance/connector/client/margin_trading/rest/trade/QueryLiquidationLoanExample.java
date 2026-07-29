package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryLiquidationLoanResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryLiquidationLoanExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Query Liquidation Loan (USER_DATA)
     *
     * <p>Query the current user&#39;s cross-margin liquidation loan information, including the
     * original loan amount, repaid amount, and remaining amount. When a cross-margin account is
     * liquidated and the account equity turns negative (bankruptcy), the system generates a
     * liquidation loan record representing the deficit. This represents the shortfall amount
     * denominated in USDC. Weight(UID): 100 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryLiquidationLoanExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<QueryLiquidationLoanResponse> response =
                getApi().queryLiquidationLoan(recvWindow);
        System.out.println(response.getData());
    }
}
