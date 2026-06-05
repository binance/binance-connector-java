package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.PositionInformationV3Response;

/** API examples for TradeApi */
public class PositionInformationV3Example {
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
     * Position Information V3 (USER_DATA)
     *
     * <p>Get current position information(only symbol that has position or open orders will be
     * returned). Please use with user data stream &#x60;ACCOUNT_UPDATE&#x60; to meet your
     * timeliness and accuracy needs. Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void positionInformationV3Example() throws ApiException {
        String symbol = "";
        Long recvWindow = 5000L;
        ApiResponse<PositionInformationV3Response> response =
                getApi().positionInformationV3(symbol, recvWindow);
        System.out.println(response.getData());
    }
}
