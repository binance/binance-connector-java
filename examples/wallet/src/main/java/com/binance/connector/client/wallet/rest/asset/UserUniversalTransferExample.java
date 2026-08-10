package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.OrderType;
import com.binance.connector.client.wallet.rest.model.UserUniversalTransferRequest;
import com.binance.connector.client.wallet.rest.model.UserUniversalTransferResponse;
import java.io.IOException;

/** API examples for AssetApi */
public class UserUniversalTransferExample {
    private WalletRestApi api;

    public WalletRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = WalletRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new WalletRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * User Universal Transfer (USER_DATA)
     *
     * <p>User universal transfer Weight(UID): 300 Security Type: USER_DATA Notes: - You need to
     * enable Permits Universal Transfer option for the API Key that requests this endpoint. -
     * &#x60;fromSymbol&#x60; must be sent when type is &#x60;ISOLATEDMARGIN_MARGIN&#x60; or
     * &#x60;ISOLATEDMARGIN_ISOLATEDMARGIN&#x60;. - &#x60;toSymbol&#x60; must be sent when type is
     * &#x60;MARGIN_ISOLATEDMARGIN&#x60; or &#x60;ISOLATEDMARGIN_ISOLATEDMARGIN&#x60;. - ENUM of
     * transfer types: - &#x60;MAIN_UMFUTURE&#x60;: Spot → USDⓈ-M Futures -
     * &#x60;MAIN_CMFUTURE&#x60;: Spot → COIN-M Futures - &#x60;MAIN_MARGIN&#x60;: Spot → Margin
     * (cross) - &#x60;UMFUTURE_MAIN&#x60;: USDⓈ-M Futures → Spot - &#x60;UMFUTURE_MARGIN&#x60;:
     * USDⓈ-M Futures → Margin (cross) - &#x60;CMFUTURE_MAIN&#x60;: COIN-M Futures → Spot -
     * &#x60;CMFUTURE_MARGIN&#x60;: COIN-M Futures → Margin (cross) - &#x60;MARGIN_MAIN&#x60;:
     * Margin (cross) → Spot - &#x60;MARGIN_UMFUTURE&#x60;: Margin (cross) → USDⓈ-M Futures -
     * &#x60;MARGIN_CMFUTURE&#x60;: Margin (cross) → COIN-M Futures -
     * &#x60;ISOLATEDMARGIN_MARGIN&#x60;: Isolated margin → Margin (cross) -
     * &#x60;MARGIN_ISOLATEDMARGIN&#x60;: Margin (cross) → Isolated margin -
     * &#x60;ISOLATEDMARGIN_ISOLATEDMARGIN&#x60;: Isolated margin → Isolated margin -
     * &#x60;MAIN_FUNDING&#x60;: Spot → Funding - &#x60;FUNDING_MAIN&#x60;: Funding → Spot -
     * &#x60;FUNDING_UMFUTURE&#x60;: Funding → USDⓈ-M Futures - &#x60;UMFUTURE_FUNDING&#x60;: USDⓈ-M
     * Futures → Funding - &#x60;MARGIN_FUNDING&#x60;: Margin (cross) → Funding -
     * &#x60;FUNDING_MARGIN&#x60;: Funding → Margin (cross) - &#x60;FUNDING_CMFUTURE&#x60;: Funding
     * → COIN-M Futures - &#x60;CMFUTURE_FUNDING&#x60;: COIN-M Futures → Funding -
     * &#x60;MAIN_OPTION&#x60;: Spot → Options - &#x60;OPTION_MAIN&#x60;: Options → Spot -
     * &#x60;UMFUTURE_OPTION&#x60;: USDⓈ-M Futures → Options - &#x60;OPTION_UMFUTURE&#x60;: Options
     * → USDⓈ-M Futures - &#x60;MARGIN_OPTION&#x60;: Margin (cross) → Options -
     * &#x60;OPTION_MARGIN&#x60;: Options → Margin (cross) - &#x60;FUNDING_OPTION&#x60;: Funding →
     * Options - &#x60;OPTION_FUNDING&#x60;: Options → Funding - &#x60;MAIN_PORTFOLIO_MARGIN&#x60;:
     * Spot → Portfolio Margin - &#x60;PORTFOLIO_MARGIN_MAIN&#x60;: Portfolio Margin → Spot
     *
     * @throws ApiException if the Api call fails
     */
    public void userUniversalTransferExample() throws ApiException, IOException {
        UserUniversalTransferRequest userUniversalTransferRequest =
                new UserUniversalTransferRequest();
        userUniversalTransferRequest.type(OrderType.DELEGATE);
        userUniversalTransferRequest.asset("BTC");
        userUniversalTransferRequest.amount(1.0d);
        ApiResponse<UserUniversalTransferResponse> response =
                getApi().userUniversalTransfer(userUniversalTransferRequest);
        System.out.println(response.getData());
    }
}
