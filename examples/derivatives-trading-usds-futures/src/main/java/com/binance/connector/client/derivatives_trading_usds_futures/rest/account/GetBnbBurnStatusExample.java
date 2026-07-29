package com.binance.connector.client.derivatives_trading_usds_futures.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.DerivativesTradingUsdsFuturesRestApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.api.DerivativesTradingUsdsFuturesRestApi;
import com.binance.connector.client.derivatives_trading_usds_futures.rest.model.GetBnbBurnStatusResponse;
import java.io.IOException;

/** API examples for AccountApi */
public class GetBnbBurnStatusExample {
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
     * Get BNB Burn Status (USER_DATA)
     *
     * <p>Get user&#39;s BNB Fee Discount (Fee Discount On or Fee Discount Off ) Weight(IP): 30
     * Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getBnbBurnStatusExample() throws ApiException, IOException {
        Long recvWindow = 5000L;
        ApiResponse<GetBnbBurnStatusResponse> response = getApi().getBnbBurnStatus(recvWindow);
        System.out.println(response.getData());
    }
}
