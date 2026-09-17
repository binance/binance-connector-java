package com.binance.connector.client.w3w_prediction.rest.transfer;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.ApplyMmWithdrawRequest;
import com.binance.connector.client.w3w_prediction.rest.model.ApplyMmWithdrawResponse;
import java.io.IOException;

/** API examples for TransferApi */
public class ApplyMmWithdrawExample {
    private W3WPredictionRestApi api;

    public W3WPredictionRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    W3WPredictionRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new W3WPredictionRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Apply MM Withdraw (PREDICTION_TRADE)
     *
     * <p>Withdraw funds from the user&#39;s CEX account (SPOT/FUNDING) to their bound CeDeFi MPC
     * wallet address. Unlike &#x60;v1/capital/withdraw/apply&#x60;, the caller does NOT pass
     * &#x60;address&#x60;; the backend resolves the user&#39;s bound CeDeFi MPC wallet address by
     * &#x60;userId&#x60; and reuses the existing capital withdraw flow with that address as the
     * target. Weight(IP): 200 Security Type: PREDICTION_TRADE Notes: - Restricted to authorized
     * market makers. Requests from unauthorized accounts are rejected — contact BD to request
     * access. - walletType Validation: | Value | Behavior | | --------------- |
     * ------------------------------- | | &#x60;null&#x60; | Allowed — defaults to SPOT | |
     * &#x60;0&#x60; | Allowed — source &#x3D; SPOT | | &#x60;1&#x60; | Allowed — source &#x3D;
     * FUNDING | | Other (e.g. &#x60;99&#x60;) | Rejected — returns validation error | - \&quot;Note
     * on field naming: this endpoint uses &#x60;walletType&#x60; (INT &#x60;0&#x60;/&#x60;1&#x60;)
     * for the source CEX account, while Apply MM Deposit uses &#x60;accountType&#x60; (STRING
     * &#x60;SPOT&#x60;/&#x60;FUNDING&#x60;) for the target. The difference is intentional: withdraw
     * reuses the existing &#x60;v1/capital/withdraw/apply&#x60; flow, which inherits that
     * flow&#39;s integer &#x60;walletType&#x60; field.\&quot;
     *
     * @throws ApiException if the Api call fails
     */
    public void applyMmWithdrawExample() throws ApiException, IOException {
        ApplyMmWithdrawRequest applyMmWithdrawRequest = new ApplyMmWithdrawRequest();
        applyMmWithdrawRequest.coin("USDT");
        applyMmWithdrawRequest.network("BEP20");
        applyMmWithdrawRequest.amount("100.00");
        ApiResponse<ApplyMmWithdrawResponse> response =
                getApi().applyMmWithdraw(applyMmWithdrawRequest);
        System.out.println(response.getData());
    }
}
