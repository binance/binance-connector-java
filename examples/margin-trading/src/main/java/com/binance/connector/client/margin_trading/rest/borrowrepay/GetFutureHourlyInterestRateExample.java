package com.binance.connector.client.margin_trading.rest.borrowrepay;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.GetFutureHourlyInterestRateResponse;
import com.binance.connector.client.margin_trading.rest.model.IsIsolated;
import java.io.IOException;

/** API examples for BorrowRepayApi */
public class GetFutureHourlyInterestRateExample {
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
     * Get future hourly interest rate (USER_DATA)
     *
     * <p>Get future hourly interest rate Weight(IP): 100 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getFutureHourlyInterestRateExample() throws ApiException, IOException {
        String assets = "BTC,ETH";
        IsIsolated isIsolated = IsIsolated.TRUE;
        ApiResponse<GetFutureHourlyInterestRateResponse> response =
                getApi().getFutureHourlyInterestRate(assets, isIsolated);
        System.out.println(response.getData());
    }
}
