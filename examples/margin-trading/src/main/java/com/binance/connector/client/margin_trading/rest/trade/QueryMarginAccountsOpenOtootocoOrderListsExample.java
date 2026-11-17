package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryMarginAccountsOpenOtootocoOrderListsResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class QueryMarginAccountsOpenOtootocoOrderListsExample {
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
     * Query Margin Account&#39;s Open OTO/OTOCO Order Lists (USER_DATA)
     *
     * <p>Retrieves all open OTO / OTOCO order lists of the margin account. Notes: - The returned
     * list contains order lists whose &#x60;listOrderStatus&#x60; is &#x60;EXECUTING&#x60;, i.e. at
     * least one order of the list is still open (&#x60;NEW&#x60; / &#x60;PARTIALLY_FILLED&#x60;). -
     * For OTO, the &#x60;orders&#x60; array contains 2 orders: the working order and the pending
     * order. - For OTOCO, the &#x60;orders&#x60; array contains 3 orders: the working order and the
     * two pending orders (pending above / pending below). Weight(UID): 10 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMarginAccountsOpenOtootocoOrderListsExample()
            throws ApiException, IOException {
        String symbol = "ASTERUSDT";
        Long recvWindow = 5000L;
        ApiResponse<QueryMarginAccountsOpenOtootocoOrderListsResponse> response =
                getApi().queryMarginAccountsOpenOtootocoOrderLists(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
