package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.IsIsolated;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountCancelOcoResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class MarginAccountCancelOcoExample {
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
     * Margin Account Cancel OCO (TRADE)
     *
     * <p>Cancel an entire Order List for a margin account. Weight(UID): 1 Security Type: TRADE
     * Notes: - Canceling an individual leg will cancel the entire OCO
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountCancelOcoExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        IsIsolated isIsolated = IsIsolated.TRUE;
        Long orderListId = 1L;
        String listClientOrderId = "1";
        String newClientOrderId = "1";
        Long recvWindow = 5000L;
        ApiResponse<MarginAccountCancelOcoResponse> response =
                getApi().marginAccountCancelOco(
                                symbol,
                                isIsolated,
                                orderListId,
                                listClientOrderId,
                                newClientOrderId,
                                recvWindow);
        System.out.println(response.getData());
    }
}
