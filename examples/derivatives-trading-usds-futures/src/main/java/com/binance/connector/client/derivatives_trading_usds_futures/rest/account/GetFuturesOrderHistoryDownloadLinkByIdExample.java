package com.binance.connector.client.derivatives_trading_usds_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetFuturesOrderHistoryDownloadLinkByIdResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class GetFuturesOrderHistoryDownloadLinkByIdExample {
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
     * Get Futures Order History Download Link by Id (USER_DATA)
     *
     * <p>Get futures order history download link by Id Weight(IP): 10 Security Type: USER_DATA
     * Notes: - Download link expiration: 7 days
     *
     * @throws ApiException if the Api call fails
     */
    public void getFuturesOrderHistoryDownloadLinkByIdExample() throws ApiException, IOException {
        String downloadId = "545923594199212032";
        Long recvWindow = 5000L;
        ApiResponse<GetFuturesOrderHistoryDownloadLinkByIdResponse> response =
                getApi().getFuturesOrderHistoryDownloadLinkById(downloadId, recvWindow);
        System.out.println(response.getData());
    }
}
