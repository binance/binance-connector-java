package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.DerivativesTradingPortfolioMarginRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.api.DerivativesTradingPortfolioMarginRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewMarginOrderRequest;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.NewMarginOrderResponse;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.OrderType;
import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model.Side;
import java.io.IOException;

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
     * New Margin Order (TRADE)
     *
     * <p>New Margin Order Weight(IP): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void newMarginOrderExample() throws ApiException, IOException {
        NewMarginOrderRequest newMarginOrderRequest = new NewMarginOrderRequest();
        newMarginOrderRequest.symbol("BTCUSDT");
        newMarginOrderRequest.side(Side.BUY);
        newMarginOrderRequest.type(OrderType.LIMIT);
        ApiResponse<NewMarginOrderResponse> response =
                getApi().newMarginOrder(newMarginOrderRequest);
        System.out.println(response.getData());
    }
}
