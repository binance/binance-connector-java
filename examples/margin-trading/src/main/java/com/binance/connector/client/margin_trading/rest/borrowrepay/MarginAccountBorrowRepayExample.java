package com.binance.connector.client.margin_trading.rest.borrowrepay;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.IsIsolated;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountBorrowRepayRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountBorrowRepayResponse;
import com.binance.connector.client.margin_trading.rest.model.OrderType;
import java.io.IOException;

/** API examples for BorrowRepayApi */
public class MarginAccountBorrowRepayExample {
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
     * Margin account borrow/repay (USER_DATA)
     *
     * <p>Margin account borrow/repay Weight(UID): 1500 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountBorrowRepayExample() throws ApiException, IOException {
        MarginAccountBorrowRepayRequest marginAccountBorrowRepayRequest =
                new MarginAccountBorrowRepayRequest();
        marginAccountBorrowRepayRequest.asset("USDT");
        marginAccountBorrowRepayRequest.isIsolated(IsIsolated.TRUE);
        marginAccountBorrowRepayRequest.amount("1.0");
        marginAccountBorrowRepayRequest.type(OrderType.ROLL_IN);
        ApiResponse<MarginAccountBorrowRepayResponse> response =
                getApi().marginAccountBorrowRepay(marginAccountBorrowRepayRequest);
        System.out.println(response.getData());
    }
}
