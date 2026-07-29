package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.GetCmIncomeHistoryResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.IncomeType;
import java.io.IOException;

/** API examples for AccountApi */
public class GetCmIncomeHistoryExample {
    private DerivativesTradingPortfolioMarginRestApi api;

    public DerivativesTradingPortfolioMarginRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get CM Income History (USER_DATA)
     *
     * <p>Get CM Income History. Weight(IP): 30 Security Type: USER_DATA Notes: - If
     * &#x60;incomeType&#x60; is not sent, all kinds of flow will be returned -
     * \&quot;trandId\&quot; is unique in the same \&quot;incomeType\&quot; for a user - The
     * interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; can not exceed 200 days: - If
     * &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the last 200 days will be
     * returned
     *
     * @throws ApiException if the Api call fails
     */
    public void getCmIncomeHistoryExample() throws ApiException, IOException {
        String symbol = "BTCUSD_200925";
        IncomeType incomeType = IncomeType.TRANSFER;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long page = 1L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<GetCmIncomeHistoryResponse> response =
                getApi().getCmIncomeHistory(
                                symbol, incomeType, startTime, endTime, page, limit, recvWindow);
        System.out.println(response.getData());
    }
}
