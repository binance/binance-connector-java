package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetSmallLiabilityExchangeHistoryResponse;

/** API examples for TradeApi */
public class GetSmallLiabilityExchangeHistoryExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Small Liability Exchange History (USER_DATA)
     *
     * <p>Get Small liability Exchange History Weight: 100(UID)
     *
     * @throws ApiException if the Api call fails
     */
    public void getSmallLiabilityExchangeHistoryExample() throws ApiException {
        Long current = 1L;
        Long size = 10L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<GetSmallLiabilityExchangeHistoryResponse> response =
                getApi().getSmallLiabilityExchangeHistory(
                                current, size, startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
