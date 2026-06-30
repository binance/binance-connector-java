package com.binance.connector.client.wallet.rest.capital;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.WithdrawRequest;
import com.binance.connector.client.wallet.rest.model.WithdrawResponse;

/** API examples for CapitalApi */
public class WithdrawExample {
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
     * Withdraw(USER_DATA)
     *
     * <p>Submit a withdraw request. * If &#x60;network&#x60; not send, return with default network
     * of the coin. * You can get &#x60;network&#x60; and &#x60;isDefault&#x60; in
     * &#x60;networkList&#x60; of a coin in the response of &#x60;Get /sapi/v1/capital/config/getall
     * (HMAC SHA256)&#x60;. * To check if travel rule is required, by using &#x60;GET
     * /sapi/v1/localentity/questionnaire-requirements&#x60; and if it returns anything other than
     * &#x60;NIL&#x60; you will need update SAPI to &#x60;POST
     * /sapi/v1/localentity/withdraw/apply&#x60; else you can continue &#x60;POST
     * /sapi/v1/capital/withdraw/apply&#x60;. Please note that if you are required to comply to
     * travel rule please refer to the Travel Rule SAPI. * For networks that do not support
     * memo/tag, submitting a withdrawal request with a non-empty &#x60;addressTag&#x60; will return
     * error &#x60;-4106 TAG_NOT_SUPPORTED_FOR_NETWORK&#x60;. Please omit the &#x60;addressTag&#x60;
     * field for such networks. You can check whether a network requires a tag via &#x60;GET
     * /sapi/v1/capital/config/getall&#x60;: * If &#x60;withdrawTag&#x60; &#x3D; &#x60;true&#x60; →
     * memo/tag is required. * If &#x60;withdrawTag&#x60; &#x3D; &#x60;false&#x60; → memo/tag is not
     * supported; omit &#x60;addressTag&#x60;. Weight: 900
     *
     * @throws ApiException if the Api call fails
     */
    public void withdrawExample() throws ApiException {
        WithdrawRequest withdrawRequest = new WithdrawRequest();
        withdrawRequest.coin("");
        withdrawRequest.address("");
        withdrawRequest.amount(1.0d);
        ApiResponse<WithdrawResponse> response = getApi().withdraw(withdrawRequest);
        System.out.println(response.getData());
    }
}
