package com.binance.connector.client.margin_trading.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetForceLiquidationRecordResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class GetForceLiquidationRecordExample {
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
     * Get Force Liquidation Record (USER_DATA)
     *
     * <p>Get Force Liquidation Record Weight(IP): 1 Security Type: USER_DATA Notes: - Response in
     * descending order
     *
     * @throws ApiException if the Api call fails
     */
    public void getForceLiquidationRecordExample() throws ApiException, IOException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        String isolatedSymbol = "BTCUSDT";
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetForceLiquidationRecordResponse> response =
                getApi().getForceLiquidationRecord(
                                startTime, endTime, isolatedSymbol, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
