package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.LiquidationLoanRepayRequest;
import com.binance.connector.client.margin_trading.rest.model.LiquidationLoanRepayResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class LiquidationLoanRepayExample {
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
     * Liquidation Loan Repay (MARGIN)
     *
     * <p>Repays the outstanding cross-margin liquidation loan from the user&#39;s spot wallet. A
     * liquidation loan represents the account deficit incurred when account equity turns negative
     * during liquidation (bankruptcy). The repayment amount must be greater than 0 and cannot
     * exceed the remaining loan balance. If the Spot Account has insufficient USDC balance, the
     * repayment will fail. Weight(UID): 100 Security Type: MARGIN
     *
     * @throws ApiException if the Api call fails
     */
    public void liquidationLoanRepayExample() throws ApiException, IOException {
        LiquidationLoanRepayRequest liquidationLoanRepayRequest = new LiquidationLoanRepayRequest();
        liquidationLoanRepayRequest.asset("USDT");
        liquidationLoanRepayRequest.amount(300.00d);
        ApiResponse<LiquidationLoanRepayResponse> response =
                getApi().liquidationLoanRepay(liquidationLoanRepayRequest);
        System.out.println(response.getData());
    }
}
