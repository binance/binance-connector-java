package com.binance.connector.client.derivatives_trading_usds_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AccountInformationV3Response;
import java.io.IOException;

/** API examples for AccountApi */
public class AccountInformationV3Example {
    private DerivativesTradingUsdsFuturesRestApi api;

    public DerivativesTradingUsdsFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Account Information V3 (USER_DATA)
     *
     * <p>Get current account information. User in single-asset/ multi-assets mode will see
     * different value, see comments in response section for detail. Weight(IP): 5 Security Type:
     * USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void accountInformationV3Example() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<AccountInformationV3Response> response =
                getApi().accountInformationV3(recvWindow);
        System.out.println(response.getData());
    }
}
