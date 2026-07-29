package com.binance.connector.client.fiat.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.fiat.rest.FiatRestApiUtil;
import com.binance.connector.client.fiat.rest.api.FiatRestApi;
import com.binance.connector.client.fiat.rest.model.ApiPaymentMethod;
import com.binance.connector.client.fiat.rest.model.FiatWithdrawRequest;
import com.binance.connector.client.fiat.rest.model.FiatWithdrawRequestAccountInfo;
import com.binance.connector.client.fiat.rest.model.FiatWithdrawResponse;
import java.io.IOException;

/** API examples for DefaultApi */
public class FiatWithdrawExample {
    private FiatRestApi api;

    public FiatRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = FiatRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new FiatRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Fiat Withdraw (TRADE)
     *
     * <p>Submit withdraw request, in this version, we support BRL,ARS,MXN withdrawal via
     * bank_transfer. You need to call this api first, and call query order detail api in a loop to
     * get the status of the order until this order is successful. Before calling this api, please
     * make sure you have already completed your KYC or KYB, and already activated your fiat service
     * on our website. Weight(UID): 45000 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void fiatWithdrawExample() throws ApiException, IOException {
        FiatWithdrawRequest fiatWithdrawRequest = new FiatWithdrawRequest();
        fiatWithdrawRequest.currency("BRL");
        fiatWithdrawRequest.apiPaymentMethod(ApiPaymentMethod.bank_transfer);
        fiatWithdrawRequest.amount(10L);
        fiatWithdrawRequest.accountInfo(new FiatWithdrawRequestAccountInfo());
        Long recvWindow = 5000L;
        ApiResponse<FiatWithdrawResponse> response =
                getApi().fiatWithdraw(fiatWithdrawRequest, recvWindow);
        System.out.println(response.getData());
    }
}
