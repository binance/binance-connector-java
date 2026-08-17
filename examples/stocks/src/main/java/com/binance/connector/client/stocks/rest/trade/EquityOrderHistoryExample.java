package com.binance.connector.client.stocks.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.EquityOrderHistoryResponse;
import com.binance.connector.client.stocks.rest.model.OrderType;
import com.binance.connector.client.stocks.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class EquityOrderHistoryExample {
    private StocksRestApi api;

    public StocksRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = StocksRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StocksRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Equity Order History (USER_DATA)
     *
     * <p>Paged order history for the caller. Filters by symbol, order type, side, status, and time
     * range. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void equityOrderHistoryExample() throws ApiException, IOException {
        Long startTime = 1735800000000L;
        Long endTime = 1735900000000L;
        String symbol = "NVDA";
        OrderType orderType = OrderType.MARKET;
        Side side = Side.BUY;
        String orderStatus = "FILLED,CANCELED";
        Integer current = 1;
        Integer size = 20;
        Long recvWindow = 5000L;
        ApiResponse<EquityOrderHistoryResponse> response =
                getApi().equityOrderHistory(
                                startTime,
                                endTime,
                                symbol,
                                orderType,
                                side,
                                orderStatus,
                                current,
                                size,
                                recvWindow);
        System.out.println(response.getData());
    }
}
