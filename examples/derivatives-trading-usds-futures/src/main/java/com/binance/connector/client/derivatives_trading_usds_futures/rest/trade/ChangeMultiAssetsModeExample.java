package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeMultiAssetsModeRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ChangeMultiAssetsModeResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class ChangeMultiAssetsModeExample {
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
     * Change Multi-Assets Mode (TRADE)
     *
     * <p>Change user&#39;s Multi-Assets mode (Multi-Assets Mode or Single-Asset Mode) on ***Every
     * symbol*** Weight(IP): 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void changeMultiAssetsModeExample() throws ApiException, IOException {
        ChangeMultiAssetsModeRequest changeMultiAssetsModeRequest =
                new ChangeMultiAssetsModeRequest();
        changeMultiAssetsModeRequest.multiAssetsMargin("true");
        ApiResponse<ChangeMultiAssetsModeResponse> response =
                getApi().changeMultiAssetsMode(changeMultiAssetsModeRequest);
        System.out.println(response.getData());
    }
}
