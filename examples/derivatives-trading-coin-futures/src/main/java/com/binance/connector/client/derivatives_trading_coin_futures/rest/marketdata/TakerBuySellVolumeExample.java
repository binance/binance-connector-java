package com.binance.connector.client.derivatives_trading_coin_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.DerivativesTradingCoinFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.api.DerivativesTradingCoinFuturesRestApi;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.ContractType;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.Period;
import com.binance.connector.client.derivatives_trading_coin_futures.rest.model.TakerBuySellVolumeResponse;
import java.io.IOException;

/** API examples for MarketDataApi */
public class TakerBuySellVolumeExample {
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
     * Taker Buy/Sell Volume
     *
     * <p>Taker Buy Volume: the total volume of buy orders filled by takers within the period. Taker
     * Sell Volume: the total volume of sell orders filled by takers within the period. Weight(IP):
     * 1 Notes: - If startTime and endTime are not sent, the most recent data is returned. - Only
     * the data of the latest 30 days is available.
     *
     * @throws ApiException if the Api call fails
     */
    public void takerBuySellVolumeExample() throws ApiException, IOException {
        String pair = "BTCUSD";
        ContractType contractType = ContractType.ALL;
        Period period = Period.PERIOD_5m;
        Long limit = 30L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        ApiResponse<TakerBuySellVolumeResponse> response =
                getApi().takerBuySellVolume(pair, contractType, period, limit, startTime, endTime);
        System.out.println(response.getData());
    }
}
