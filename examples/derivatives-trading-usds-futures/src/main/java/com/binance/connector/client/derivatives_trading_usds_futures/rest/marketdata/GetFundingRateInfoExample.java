package com.binance.connector.client.derivatives_trading_usds_futures.rest.marketdata;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetFundingRateInfoResponse;

/** API examples for MarketDataApi */
public class GetFundingRateInfoExample {
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
     * Get Funding Rate Info
     *
     * <p>Query funding rate info for symbols that had FundingRateCap/ FundingRateFloor /
     * fundingIntervalHours adjustment Weight: 0 share 500/5min/IP rate limit with GET
     * /fapi/v1/fundingRate
     *
     * @throws ApiException if the Api call fails
     */
    public void getFundingRateInfoExample() throws ApiException {
        ApiResponse<GetFundingRateInfoResponse> response = getApi().getFundingRateInfo();
        System.out.println(response.getData());
    }
}
