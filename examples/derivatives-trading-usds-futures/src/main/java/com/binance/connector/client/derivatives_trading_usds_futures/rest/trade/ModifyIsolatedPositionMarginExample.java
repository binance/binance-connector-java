package com.binance.connector.client.derivatives_trading_usds_futures.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyIsolatedPositionMarginRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.ModifyIsolatedPositionMarginResponse;
import java.io.IOException;

/** API examples for TradeApi */
public class ModifyIsolatedPositionMarginExample {
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
     * Modify Isolated Position Margin (TRADE)
     *
     * <p>Modify Isolated Position Margin Weight(IP): 1 Security Type: TRADE Notes: - Only for
     * isolated symbol
     *
     * @throws ApiException if the Api call fails
     */
    public void modifyIsolatedPositionMarginExample() throws ApiException, IOException {
        ModifyIsolatedPositionMarginRequest modifyIsolatedPositionMarginRequest =
                new ModifyIsolatedPositionMarginRequest();
        modifyIsolatedPositionMarginRequest.symbol("BTCUSDT");
        modifyIsolatedPositionMarginRequest.amount(1.0d);
        modifyIsolatedPositionMarginRequest.type(1);
        ApiResponse<ModifyIsolatedPositionMarginResponse> response =
                getApi().modifyIsolatedPositionMargin(modifyIsolatedPositionMarginRequest);
        System.out.println(response.getData());
    }
}
