package com.binance.connector.client.margin_trading.rest.transfer;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.QueryMaxTransferOutAmountResponse;

/** API examples for TransferApi */
public class QueryMaxTransferOutAmountExample {
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
     * Query Max Transfer-Out Amount (USER_DATA)
     *
     * <p>Query Max Transfer-Out Amount * If isolatedSymbol is not sent, crossed margin data will be
     * sent. Weight: 50(IP)
     *
     * @throws ApiException if the Api call fails
     */
    public void queryMaxTransferOutAmountExample() throws ApiException {
        String asset = "";
        String isolatedSymbol = "";
        Long recvWindow = 5000L;
        ApiResponse<QueryMaxTransferOutAmountResponse> response =
                getApi().queryMaxTransferOutAmount(asset, isolatedSymbol, recvWindow);
        System.out.println(response.getData());
    }
}
