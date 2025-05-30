/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.Period;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.TopTraderLongShortRatioPositionsResponse;

/** API examples for MarketDataApi */
public class TopTraderLongShortRatioPositionsExample {
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
     * Top Trader Long/Short Ratio (Positions)
     *
     * <p>The proportion of net long and net short positions to total open positions of the top 20%
     * users with the highest margin balance. Long Position % &#x3D; Long positions of top traders /
     * Total open positions of top traders Short Position % &#x3D; Short positions of top traders /
     * Total open positions of top traders Long/Short Ratio (Positions) &#x3D; Long Position % /
     * Short Position % * If startTime and endTime are not sent, the most recent data is returned. *
     * Only the data of the latest 30 days is available. * IP rate limit 1000 requests/5min Weight:
     * 0
     *
     * @throws ApiException if the Api call fails
     */
    public void topTraderLongShortRatioPositionsExample() throws ApiException {
        String symbol = "";
        Period period = Period.PERIOD_5m;
        Long limit = 100L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        ApiResponse<TopTraderLongShortRatioPositionsResponse> response =
                getApi().topTraderLongShortRatioPositions(
                                symbol, period, limit, startTime, endTime);
        System.out.println(response.getData());
    }
}
