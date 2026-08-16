package com.binance.connector.client.c2c.rest.defaultpkg;

import com.binance.connector.client.c2c.rest.C2cRestApiUtil;
import com.binance.connector.client.c2c.rest.api.C2cRestApi;
import com.binance.connector.client.c2c.rest.model.GetC2CTradeHistoryResponse;
import com.binance.connector.client.c2c.rest.model.TradeType;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

/** API examples for DefaultApi */
public class GetC2CTradeHistoryExample {
    private C2cRestApi api;

    public C2cRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = C2cRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new C2cRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get C2C Trade History (USER_DATA)
     *
     * <p>Get C2C Trade History Weight(IP): 1 Security Type: USER_DATA Notes: - The max interval
     * between &#x60;startTimestamp&#x60; and &#x60;endTimestamp&#x60; is 30 days. - If
     * &#x60;startTimestamp&#x60; and &#x60;endTimestamp&#x60; are not sent, the recent 30 days&#39;
     * data is returned. - You can only view data from the past 6 months. For all C2C orders, check
     * &#x60;https://c2c.binance.com/en/fiatOrder&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void getC2CTradeHistoryExample() throws ApiException, IOException {
        TradeType tradeType = TradeType.BUY;
        Long startTimestamp = 1770736694138L;
        Long endTimestamp = 1770736694138L;
        Long page = 1L;
        Long rows = 100L;
        ApiResponse<GetC2CTradeHistoryResponse> response =
                getApi().getC2CTradeHistory(tradeType, startTimestamp, endTimestamp, page, rows);
        System.out.println(response.getData());
    }
}
