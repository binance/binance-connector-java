package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.QueryCurrentUmOpenAlgoOrderResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryCurrentUmOpenAlgoOrderExample {
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
     * Query Current UM Open Algo Order (USER_DATA)
     *
     * <p>Check an UM algo order&#39;s status. Orders will not be found if: status is
     * CANCELED/EXPIRED with no fills and created 3+ days ago; or created 90+ days ago. Weight(IP):
     * 1 Security Type: USER_DATA Notes: - Either &#x60;algoId&#x60; or &#x60;clientAlgoId&#x60;
     * must be sent. &#x60;algoId&#x60; is self-increment for each specific &#x60;symbol&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void queryCurrentUmOpenAlgoOrderExample() throws ApiException, IOException {
        Long algoId = 2146760L;
        String clientAlgoId = "6B2I9XVcJpCjqPAJ4YoFX7";
        Long recvWindow = 5000L;
        ApiResponse<QueryCurrentUmOpenAlgoOrderResponse> response =
                getApi().queryCurrentUmOpenAlgoOrder(algoId, clientAlgoId, recvWindow);
        System.out.println(response.getData());
    }
}
