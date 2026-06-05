package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.CreateSpecialKeyRequest;
import com.binance.connector.client.margin_trading.rest.model.CreateSpecialKeyResponse;

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
     * Create Special Key(Low-Latency Trading)(TRADE)
     *
     * <p>- Binance Margin offers low-latency trading through a [special
     * key](https://www.binance.com/en/support/faq/frequently-asked-questions-on-margin-special-api-key-3208663e900d4d2e9fec4140e1832f4e),
     * available exclusively to users with VIP level 4 or higher. - If you are VIP level 3 or below,
     * please contact your VIP manager for eligibility criterias.** **Supported Products:** - Cross
     * Margin - Isolated Margin - Portfolio Margin Pro - Cross Margin Pro (Additional agreement
     * required and subject to meeting eligibility criteria) **Unsupported Products:** - Portfolio
     * Margin We support several types of API keys: * Ed25519 (recommended) * HMAC * RSA We
     * recommend to **use Ed25519 API keys** as it should provide the best performance and security
     * out of all supported key types. We accept PKCS#8 (BEGIN PUBLIC KEY). For how to generate an
     * RSA key pair to send API requests on Binance. Please refer to the document below
     * [FAQ](https://www.binance.com/en/support/faq/how-to-generate-an-rsa-key-pair-to-send-api-requests-on-binance-2b79728f331e43079b27440d9d15c5db)
     * . Weight: 1(UID)
     *
     * @throws ApiException if the Api call fails
     */
    public void createSpecialKeyExample() throws ApiException {
        CreateSpecialKeyRequest createSpecialKeyRequest = new CreateSpecialKeyRequest();
        createSpecialKeyRequest.apiName("");
        ApiResponse<CreateSpecialKeyResponse> response =
                getApi().createSpecialKey(createSpecialKeyRequest);
        System.out.println(response.getData());
    }
}
