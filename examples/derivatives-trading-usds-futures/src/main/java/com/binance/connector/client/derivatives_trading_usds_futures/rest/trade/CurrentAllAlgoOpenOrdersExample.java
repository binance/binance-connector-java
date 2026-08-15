package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.CurrentAllAlgoOpenOrdersResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CurrentAllAlgoOpenOrdersExample {
    private DerivativesTradingUsdsFuturesRestApi api;

    public DerivativesTradingUsdsFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Current All Algo Open Orders (USER_DATA)
     *
     * <p>Get all open algo (conditional) orders on a symbol, including TP/SL (Take Profit / Stop
     * Loss) and trailing stop orders on USD-M Futures. Weight: **1** for a single symbol; **40**
     * when the symbol parameter is omitted **Careful** when accessing this with no symbol. Security
     * Type: USER_DATA Notes: - If the symbol is not sent, orders for all symbols will be returned
     * in an array.
     *
     * @throws ApiException if the Api call fails
     */
    public void currentAllAlgoOpenOrdersExample() throws ApiException, IOException {
        String algoType = "CONDITIONAL";
        String symbol = "BTCUSDT";
        Long algoId = 2148627L;
        Long recvWindow = 5000L;
        ApiResponse<CurrentAllAlgoOpenOrdersResponse> response =
                getApi().currentAllAlgoOpenOrders(algoType, symbol, algoId, recvWindow);
        System.out.println(response.getData());
    }
}
