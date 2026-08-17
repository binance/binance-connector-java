package com.binance.connector.client.stocks.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stocks.rest.StocksRestApiUtil;
import com.binance.connector.client.stocks.rest.api.StocksRestApi;
import com.binance.connector.client.stocks.rest.model.EquityTradeHistoryResponse;
import com.binance.connector.client.stocks.rest.model.Side;
import java.io.IOException;

/** API examples for TradeApi */
public class EquityTradeHistoryExample {
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
     * Equity Trade History (USER_DATA)
     *
     * <p>Paged equity trade (per-fill) history for the caller. Each row is one execution, not one
     * order — a partially filled order produces multiple rows. Filters by symbol, side, specific
     * &#x60;orderId&#x60;, and time range. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void equityTradeHistoryExample() throws ApiException, IOException {
        Long startTime = 1735800000000L;
        Long endTime = 1735900000000L;
        String symbol = "NVDA";
        Side side = Side.BUY;
        String orderId = "c3c58f49-7b0d-4b9e-a2db-1a2f9a3b8c71";
        Integer current = 1;
        Integer size = 20;
        Long recvWindow = 5000L;
        ApiResponse<EquityTradeHistoryResponse> response =
                getApi().equityTradeHistory(
                                startTime,
                                endTime,
                                symbol,
                                side,
                                orderId,
                                current,
                                size,
                                recvWindow);
        System.out.println(response.getData());
    }
}
