package com.binance.connector.client.derivatives_trading_coin_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.GetFuturesTradeDownloadLinkByIdResponse;

/** API examples for AccountApi */
public class GetFuturesTradeDownloadLinkByIdExample {
    private DerivativesTradingCoinFuturesRestApi api;

    public DerivativesTradingCoinFuturesRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingCoinFuturesRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingCoinFuturesRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Futures Trade Download Link by Id(USER_DATA)
     *
     * <p>Get futures trade download link by Id * Download link expiration: 24h Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void getFuturesTradeDownloadLinkByIdExample() throws ApiException {
        String downloadId = "1";
        Long recvWindow = 5000L;
        ApiResponse<GetFuturesTradeDownloadLinkByIdResponse> response =
                getApi().getFuturesTradeDownloadLinkById(downloadId, recvWindow);
        System.out.println(response.getData());
    }
}
