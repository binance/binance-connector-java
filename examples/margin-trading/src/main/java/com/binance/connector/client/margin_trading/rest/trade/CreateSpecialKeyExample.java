package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.CreateSpecialKeyRequest;
import com.binance.connector.client.margin_trading.rest.model.CreateSpecialKeyResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class CreateSpecialKeyExample {
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
     * Create Special Key(Low-Latency Trading) (TRADE)
     *
     * <p>**Eligibility** - Binance Margin offers low-latency trading through a [special
     * key](https://www.binance.com/en/support/faq/frequently-asked-questions-on-margin-special-api-key-3208663e900d4d2e9fec4140e1832f4e),
     * available exclusively to users with VIP level 7 or higher. - If you are VIP level 6 or below,
     * please contact your VIP manager for eligibility criterias. - All new Margin Special Key users
     * are required to read, understand, and agree to the Margin Special Key Supplemental Product
     * Terms at the master account level before creating a Margin Special Key. - Once signed at the
     * master account level, the agreement applies to all sub-accounts. The master account and all
     * sub-accounts (Cross Margin Classic and Portfolio Margin Pro) are authorized to create a
     * Margin Special Key and are subject to the LiquidationLoan policy. For more information,
     * please refer to
     * [FAQ](https://www.binance.com/en/support/faq/detail/3208663e900d4d2e9fec4140e1832f4e).
     * **Supported Products:** - Cross Margin - Isolated Margin - Portfolio Margin Pro **Unsupported
     * Products:** - Portfolio Margin We support several types of API keys: * Ed25519 (recommended)
     * * HMAC * RSA We recommend to **use Ed25519 API keys** as it should provide the best
     * performance and security out of all supported key types. We accept PKCS#8 (BEGIN PUBLIC KEY).
     * For how to generate an RSA key pair to send API requests on Binance. Please refer to the
     * document below
     * [FAQ](https://www.binance.com/en/support/faq/how-to-generate-an-rsa-key-pair-to-send-api-requests-on-binance-2b79728f331e43079b27440d9d15c5db)
     * . **How to use the Margin Special Key** - Use the below &#x60;sapi&#x60; endpoint to create
     * your margin special API Key. - For accessing the Cross Margin account, do not send the
     * &#x60;symbol&#x60; parameter. - For accessing the Isolated Margin account(s), pass the
     * relevant &#x60;symbol&#x60; parameter in the API Key creation request. - Use the generated
     * API Key (and Secret key, if applicable) to perform margin trading and listenKey generation
     * via **Spot** REST API (&#x60;https://api.binance.com/api/v3/_*&#x60;) endpoints. Read [REST
     * API](/products/spot/rest-api#signed-trade-and-user_data-endpoint-security) or [WebSocket
     * API](/products/spot/web-socket-api#request-security) documentation to learn how to use
     * different API keys You need to enable Permits “Enable Spot &amp; Margin Trading” option for
     * the API Key which requests this endpoint. Weight(UID): 1 Security Type: TRADE Response Notes:
     * - Error Code Description - **UNSUPPORTED_OPERATION** : Portfolio Margin is an unsupported
     * product, please change the account type to a supported margin product. - **Forbidden**: Cross
     * Margin Pro accounts require additional agreements, please contact your relationship manager.
     *
     * @throws ApiException if the Api call fails
     */
    public void createSpecialKeyExample() throws ApiException, IOException {
        CreateSpecialKeyRequest createSpecialKeyRequest = new CreateSpecialKeyRequest();
        createSpecialKeyRequest.apiName("apiName");
        ApiResponse<CreateSpecialKeyResponse> response =
                getApi().createSpecialKey(createSpecialKeyRequest);
        System.out.println(response.getData());
    }
}
