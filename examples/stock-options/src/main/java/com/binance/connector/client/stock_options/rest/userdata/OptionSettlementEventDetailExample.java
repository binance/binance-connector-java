package com.binance.connector.client.stock_options.rest.userdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.OptionSettlementEventDetailResponse;
import java.io.IOException;

/** API examples for UserDataApi */
public class OptionSettlementEventDetailExample {
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
     * Option Settlement Event Detail (USER_DATA)
     *
     * <p>Full detail of a single settlement event, including the settlement basis and collateral
     * release. Returns &#x60;-1102&#x60; if &#x60;eventId&#x60; does not exist or does not belong
     * to the caller. All fields of the history endpoint are included, with two differences:
     * &#x60;contracts&#x60; is an absolute value, and &#x60;eventTime&#x60; is the time the
     * settlement record was created. For an &#x60;EXPIRY&#x60; event, &#x60;settlementKind&#x60;,
     * &#x60;cashDirection&#x60;, &#x60;amount&#x60; and &#x60;shareDelta&#x60; are not returned.
     * For an &#x60;EXPIRY&#x60; event on a short position (covered call / cash-secured put),
     * &#x60;collateralRelease&#x60; lists the collateral released. Weight: 1 Security Type:
     * USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void optionSettlementEventDetailExample() throws ApiException, IOException {
        String eventId = "a7f3c2e1-4b5d-4e8f-9c0a-1b2c3d4e5f60";
        Long recvWindow = 5000L;
        ApiResponse<OptionSettlementEventDetailResponse> response =
                getApi().optionSettlementEventDetail(eventId, recvWindow);
        System.out.println(response.getData());
    }
}
