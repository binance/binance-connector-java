package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.ExitSpecialKeyModeRequest;
import java.io.IOException;

/** API examples for TradeApi */
public class ExitSpecialKeyModeExample {
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
     * Exit Special Key Mode (TRADE)
     *
     * <p>Exit the Margin Special Key mode for Cross Margin Classic accounts. **All outstanding
     * liabilities under the Cross Margin Classic account must be fully repaid before calling this
     * endpoint.** Deleting the Margin Special Key alone does not constitute a valid exit. When a
     * user creates a Margin Special API Key, the account enters \&quot;Special Key Mode\&quot;.
     * Upon a successful request, the following actions will be performed atomically: 1. All
     * existing Margin Special API Keys under the Cross Margin Classic mode account will be deleted.
     * 2. All pre-execution margin checks (including Open-order-loss calculation) will revert to
     * standard mode. 3. A cooldown period (default: 24 hours) will be enforced, during which the
     * account will not be permitted to create new Margin Special API Keys. For more information,
     * please refer to
     * [FAQ](https://www.binance.com/en/support/faq/detail/3208663e900d4d2e9fec4140e1832f4e).
     * **Preconditions:** The following conditions must be met; otherwise the request will be
     * rejected: - Account type must be **Cross Margin Classic**. - Account must currently be in
     * **Special Key Mode**. If not, the request silently succeeds. - Account must **not be in
     * liquidation**. - Account must **have no liability**. You need to enable \&quot;Permits Enable
     * Spot &amp; Margin Trading\&quot; option for the API Key which requests this endpoint.
     * Weight(UID): 10 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void exitSpecialKeyModeExample() throws ApiException, IOException {
        ExitSpecialKeyModeRequest exitSpecialKeyModeRequest = new ExitSpecialKeyModeRequest();
        ApiResponse<Object> response = getApi().exitSpecialKeyMode(exitSpecialKeyModeRequest);
        System.out.println(response.getData());
    }
}
