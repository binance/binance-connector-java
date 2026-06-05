package com.binance.connector.client.copy_trading.rest.futurecopytrading;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.copy_trading.rest.CopyTradingRestApiUtil;
import com.binance.connector.client.copy_trading.rest.api.CopyTradingRestApi;
import com.binance.connector.client.copy_trading.rest.model.GetFuturesLeadTradingSymbolWhitelistResponse;

/** API examples for FutureCopyTradingApi */
public class GetFuturesLeadTradingSymbolWhitelistExample {
    private CopyTradingRestApi api;

    public CopyTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    CopyTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new CopyTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Futures Lead Trading Symbol Whitelist(USER_DATA)
     *
     * <p>Get Futures Lead Trading Symbol Whitelist Weight: 20
     *
     * @throws ApiException if the Api call fails
     */
    public void getFuturesLeadTradingSymbolWhitelistExample() throws ApiException {
        Long recvWindow = 5000L;
        ApiResponse<GetFuturesLeadTradingSymbolWhitelistResponse> response =
                getApi().getFuturesLeadTradingSymbolWhitelist(recvWindow);
        System.out.println(response.getData());
    }
}
