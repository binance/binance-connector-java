package com.binance.connector.client.derivatives_trading_coin_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.Period;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.TopTraderLongShortRatioPositionsResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class TopTraderLongShortRatioPositionsExample {
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
     * Top Trader Long/Short Position Ratio
     *
     * <p>The proportion of net long and net short positions to total open positions of the top 20%
     * users with the highest margin balance. Long Position % &#x3D; Long positions of top traders /
     * Total open positions of top traders Short Position % &#x3D; Short positions of top traders /
     * Total open positions of top traders Long/Short Ratio (Positions) &#x3D; Long Position % /
     * Short Position % Weight(IP): 1 Security Type: Positions Notes: - If startTime and endTime are
     * not sent, the most recent data is returned. - Only the data of the latest 30 days is
     * available.
     *
     * @throws ApiException if the Api call fails
     */
    public void topTraderLongShortRatioPositionsExample() throws ApiException, IOException {
        String pair = "BTCUSD";
        Period period = Period.PERIOD_5m;
        Long limit = 30L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        ApiResponse<TopTraderLongShortRatioPositionsResponse> response =
                getApi().topTraderLongShortRatioPositions(pair, period, limit, startTime, endTime);
        System.out.println(response.getData());
    }
}
