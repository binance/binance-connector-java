package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.TradingScheduleResponse;

/** API examples for MarketDataApi */
public class TradingScheduleExample {
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
     * Trading Schedule
     *
     * <p>Trading session schedules for the underlying assets of TradFi Perps are provided for a
     * one-week period starting from the day prior to the query time, covering both the U.S. equity
     * and commodity markets. Equity market session types include \&quot;PRE_MARKET\&quot;,
     * \&quot;REGULAR\&quot;, \&quot;AFTER_MARKET\&quot;, \&quot;OVERNIGHT\&quot;, and
     * \&quot;NO_TRADING\&quot;, while commodity market session types include \&quot;REGULAR\&quot;
     * and \&quot;NO_TRADING\&quot;. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void tradingScheduleExample() throws ApiException {
        ApiResponse<TradingScheduleResponse> response = getApi().tradingSchedule();
        System.out.println(response.getData());
    }
}
