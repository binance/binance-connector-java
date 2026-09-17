package com.binance.connector.client.w3w_prediction.rest.transfer;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.AccountType;
import com.binance.connector.client.w3w_prediction.rest.model.ApplyMmDepositRequest;
import com.binance.connector.client.w3w_prediction.rest.model.ApplyMmDepositResponse;
import java.io.IOException;

/** API examples for TransferApi */
public class ApplyMmDepositExample {
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
     * Apply MM Deposit (PREDICTION_TRADE)
     *
     * <p>Move funds from the user&#39;s bound CeDeFi MPC wallet to their CEX account (SPOT/FUNDING)
     * via a contract escrow + credit flow. The maker wallet is resolved server-side by
     * &#x60;userId&#x60;; the caller does not pass wallet or signature. Weight(IP): 200 Security
     * Type: PREDICTION_TRADE Notes: - Restricted to authorized market makers. Requests from
     * unauthorized accounts are rejected — contact BD to request access. - \&quot;Note on
     * &#x60;fromToken&#x60; / &#x60;toToken&#x60;: typically the same symbol (e.g. both
     * &#x60;USDT&#x60;). When they differ, the backend may attempt a swap, but cross-symbol
     * conversion is not guaranteed for all pairs — prefer using the same symbol.\&quot;
     *
     * @throws ApiException if the Api call fails
     */
    public void applyMmDepositExample() throws ApiException, IOException {
        ApplyMmDepositRequest applyMmDepositRequest = new ApplyMmDepositRequest();
        applyMmDepositRequest.fromToken("USDT");
        applyMmDepositRequest.fromTokenAmount("1000000000000000000");
        applyMmDepositRequest.toToken("USDT");
        applyMmDepositRequest.accountType(AccountType.SPOT);
        ApiResponse<ApplyMmDepositResponse> response =
                getApi().applyMmDeposit(applyMmDepositRequest);
        System.out.println(response.getData());
    }
}
