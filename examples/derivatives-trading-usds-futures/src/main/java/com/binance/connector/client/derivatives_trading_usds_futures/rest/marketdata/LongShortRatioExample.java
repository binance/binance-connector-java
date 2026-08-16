package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.LongShortRatioResponse;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Period;
import java.io.IOException;

/** API examples for MarketDataApi */
public class LongShortRatioExample {
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
     * Long/Short Ratio
     *
     * <p>Query symbol Long/Short Ratio Weight(IP): 0 Notes: - If startTime and endTime are not
     * sent, the most recent data is returned. - Only the data of the latest 30 days is available. -
     * IP rate limit 1000 requests/5min
     *
     * @throws ApiException if the Api call fails
     */
    public void longShortRatioExample() throws ApiException, IOException {
        String symbol = "BTCUSDT";
        Period period = Period.PERIOD_5m;
        Long limit = 50L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        ApiResponse<LongShortRatioResponse> response =
                getApi().longShortRatio(symbol, period, limit, startTime, endTime);
        System.out.println(response.getData());
    }
}
