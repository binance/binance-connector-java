package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.AssetIndexResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class AssetIndexExample {
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
     * Multi-Assets Mode Asset Index
     *
     * <p>Asset index price. &gt; **CM-UM Integration (Effective 2026-06-30):** Renamed from
     * *Multi-Assets Mode Asset Index*. The response now additionally pushes COIN-M settlement-asset
     * price index entries (e.g., &#x60;BTCUSD&#x60;, &#x60;ETHUSD&#x60;, &#x60;BNBUSD&#x60;). The
     * endpoint path &#x60;/fapi/v1/assetIndex&#x60; is unchanged. Weight: **1** for a single
     * symbol; **10** when the symbol parameter is omitted
     *
     * @throws ApiException if the Api call fails
     */
    public void assetIndexExample() throws ApiException, IOException {
        String symbol = "ADAUSD";
        ApiResponse<AssetIndexResponse> response = getApi().assetIndex(symbol);
        System.out.println(response.getData());
    }
}
