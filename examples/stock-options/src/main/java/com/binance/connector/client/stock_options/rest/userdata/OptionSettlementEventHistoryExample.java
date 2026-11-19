package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionSettlementEventHistoryResponse;
import java.io.IOException;

/** API examples for UserDataApi */
public class OptionSettlementEventHistoryExample {
    private StockOptionsRestApi api;

    public StockOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    StockOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StockOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Option Settlement Event History (USER_DATA)
     *
     * <p>Query option settlement events — the settlement outcome of a contract: exercise,
     * assignment or expiry (expired worthless), along with the shares / cash delivered and the
     * collateral released. Sorted by event time in descending order. These records are on a
     * settlement basis, separate from orders and trades. **Cursor pagination.** Omit
     * &#x60;lastId&#x60; on the first page, then pass the &#x60;nextLastId&#x60; from the previous
     * page until &#x60;hasMore&#x60; is &#x60;false&#x60;. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionSettlementEventHistoryExample() throws ApiException, IOException {
        String underlyingSymbol = "NVDA";
        String symbol = "NVDA260930C00100000";
        String eventType = "EXERCISE,ASSIGNMENT";
        Long startTime = 1790700000000L;
        Long endTime = 1790900000000L;
        Long lastId = 10086L;
        Integer size = 20;
        Long recvWindow = 5000L;
        ApiResponse<OptionSettlementEventHistoryResponse> response =
                getApi().optionSettlementEventHistory(
                                underlyingSymbol,
                                symbol,
                                eventType,
                                startTime,
                                endTime,
                                lastId,
                                size,
                                recvWindow);
        System.out.println(response.getData());
    }
}
