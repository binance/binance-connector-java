package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionPositionsResponse;
import java.io.IOException;

/** API examples for UserDataApi */
public class OptionPositionsExample {
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
     * Option Positions (USER_DATA)
     *
     * <p>Returns all current option positions. One record per contract; see &#x60;side&#x60; for
     * the direction. **&#x60;free&#x60; / &#x60;locked&#x60; are signed: negative for short
     * positions.** For example, with 3 short contracts of which 1 is reserved by an open order,
     * &#x60;free&#x60; &#x3D; &#x60;\&quot;-2\&quot;&#x60; and &#x60;locked&#x60; &#x3D;
     * &#x60;\&quot;-1\&quot;&#x60;. When closing (&#x60;SELL_TO_CLOSE&#x60; /
     * &#x60;BUY_TO_CLOSE&#x60;), the quantity you can order is the **absolute value** of
     * &#x60;free&#x60;. Positions past the last trading time and awaiting settlement are not
     * returned. Weight: 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionPositionsExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<OptionPositionsResponse> response = getApi().optionPositions(recvWindow);
        System.out.println(response.getData());
    }
}
