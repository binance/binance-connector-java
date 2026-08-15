package com.binance.connector.client.spot.rest.general;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.ExchangeInfoResponse;
import com.binance.connector.client.spot.rest.model.Permissions;
import com.binance.connector.client.spot.rest.model.SymbolStatus;
import com.binance.connector.client.spot.rest.model.Symbols;
import java.io.IOException;

/** API examples for GeneralApi */
public class ExchangeInfoExample {
    private SpotRestApi api;

    public SpotRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Exchange information
     *
     * <p>Current exchange trading rules and symbol information Weight(IP): 20 Security Type: NONE
     * Notes: **Data Source:** Memory **Notes:** * If the value provided to &#x60;symbol&#x60; or
     * &#x60;symbols&#x60; do not exist, the endpoint will throw an error saying the symbol is
     * invalid. * All parameters are optional. * &#x60;permissions&#x60; can support single or
     * multiple values (e.g. &#x60;SPOT&#x60;,
     * &#x60;[\&quot;MARGIN\&quot;,\&quot;LEVERAGED\&quot;]&#x60;). This cannot be used in
     * combination with &#x60;symbol&#x60; or &#x60;symbols&#x60;. * If &#x60;permissions&#x60;
     * parameter not provided, all symbols that have either &#x60;SPOT&#x60;, &#x60;MARGIN&#x60;, or
     * &#x60;LEVERAGED&#x60; permission will be exposed. * To display symbols with any permission
     * you need to specify them explicitly in &#x60;permissions&#x60;: (e.g.
     * &#x60;[\&quot;SPOT\&quot;,\&quot;MARGIN\&quot;,...]&#x60;.). See Account and Symbol
     * Permissions for the full list. **Examples of Symbol Permissions Interpretation from the
     * Response:** * &#x60;[[\&quot;A\&quot;,\&quot;B\&quot;]]&#x60; means you may place an order if
     * your account has either permission \&quot;A\&quot; **or** permission \&quot;B\&quot;. *
     * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;]]&#x60; means you can place an order if your
     * account has permission \&quot;A\&quot; **and** permission \&quot;B\&quot;. *
     * &#x60;[[\&quot;A\&quot;],[\&quot;B\&quot;,\&quot;C\&quot;]]&#x60; means you can place an
     * order if your account has permission \&quot;A\&quot; **and** permission \&quot;B\&quot; or
     * permission \&quot;C\&quot;. (Inclusive or is applied here, not exclusive or, so your account
     * may have both permission \&quot;B\&quot; and permission \&quot;C\&quot;.)
     *
     * @throws ApiException if the Api call fails
     */
    public void exchangeInfoExample() throws ApiException, IOException {
        String symbol = "ETHBTC";
        Symbols symbols = Symbols.fromJson("[\"BTCUSDT\",\"BNBUSDT\"]");
        Permissions permissions = Permissions.fromJson("[\"SPOT\"]");
        Boolean showPermissionSets = false;
        SymbolStatus symbolStatus = SymbolStatus.TRADING;
        ApiResponse<ExchangeInfoResponse> response =
                getApi().exchangeInfo(
                                symbol, symbols, permissions, showPermissionSets, symbolStatus);
        System.out.println(response.getData());
    }
}
