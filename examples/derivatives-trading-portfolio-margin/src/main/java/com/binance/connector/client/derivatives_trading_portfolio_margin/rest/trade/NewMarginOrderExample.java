package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewMarginOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewMarginOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Side;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Type;

/** API examples for TradeApi */
public class NewMarginOrderExample {
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
     * New Margin Order(TRADE)
     *
     * <p>New Margin Order Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void newMarginOrderExample() throws ApiException {
        NewMarginOrderRequest newMarginOrderRequest = new NewMarginOrderRequest();
        newMarginOrderRequest.symbol("");
        newMarginOrderRequest.side(Side.BUY);
        newMarginOrderRequest.type(Type.LIMIT);
        ApiResponse<NewMarginOrderResponse> response =
                getApi().newMarginOrder(newMarginOrderRequest);
        System.out.println(response.getData());
    }
}
