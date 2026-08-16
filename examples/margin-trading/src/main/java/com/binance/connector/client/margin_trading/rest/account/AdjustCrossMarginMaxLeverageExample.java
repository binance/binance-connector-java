package com.binance.connector.client.margin_trading.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.AdjustCrossMarginMaxLeverageRequest;
import com.binance.connector.client.margin_trading.rest.model.AdjustCrossMarginMaxLeverageResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class AdjustCrossMarginMaxLeverageExample {
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
     * Adjust cross margin max leverage (USER_DATA)
     *
     * <p>Adjust cross margin max leverage Weight(UID): 3000, 1 times/min per IP Security Type:
     * USER_DATA Notes: - The margin level need higher than the initial risk ratio of adjusted
     * leverage, the initial risk ratio of 3x is 1.5 , the initial risk ratio of 5x is 1.25; The
     * detail conditions on how to switch between Cross Margin Classic and Cross Margin Pro can
     * refer to [the
     * FAQ](https://www.binance.com/en/support/faq/how-to-activate-the-cross-margin-pro-mode-on-binance-e27786da05e743a694b8c625b3bc475d).
     *
     * @throws ApiException if the Api call fails
     */
    public void adjustCrossMarginMaxLeverageExample() throws ApiException, IOException {
        AdjustCrossMarginMaxLeverageRequest adjustCrossMarginMaxLeverageRequest =
                new AdjustCrossMarginMaxLeverageRequest();
        adjustCrossMarginMaxLeverageRequest.maxLeverage(3L);
        ApiResponse<AdjustCrossMarginMaxLeverageResponse> response =
                getApi().adjustCrossMarginMaxLeverage(adjustCrossMarginMaxLeverageRequest);
        System.out.println(response.getData());
    }
}
