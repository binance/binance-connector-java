package com.binance.connector.client.pay.rest.defaultpkg;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.pay.rest.PayRestApiUtil;
import com.binance.connector.client.pay.rest.api.PayRestApi;
import com.binance.connector.client.pay.rest.model.GetPayTradeHistoryResponse;
import java.io.IOException;

/** API examples for DefaultApi */
public class GetPayTradeHistoryExample {
    private PayRestApi api;

    public PayRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = PayRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new PayRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Pay Trade History
     *
     * <p>Get Pay Trade History Weight(UID): 3000 Notes: - If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are not sent, the recent 90 days&#39; data will be returned. - The max
     * interval between &#x60;startTime&#x60; and &#x60;endTime&#x60; is 90 days. - Support for
     * querying orders within the last 18 months. - &#x60;payerInfo&#x60; and
     * &#x60;receiverInfo&#x60; return different fields in different &#x60;orderType&#x60; values: -
     * C2C sender: &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name,
     * binanceId/accountId/email/countryCode/phoneNumber/mobileCode&#x60; (based on user input). -
     * C2C receiver: &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;. -
     * CRYPTO_BOX sender: &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name&#x60;
     * (always &#x60;\&quot;Crypto Box\&quot;&#x60;). - CRYPTO_BOX receiver:
     * &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;. - PAY sender:
     * &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name&#x60;. - PAY receiver:
     * &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId, name&#x60;. - PAY_REFUND
     * sender: &#x60;payerInfo&#x3D;binanceId, name&#x60;; &#x60;receiverInfo&#x3D;name,
     * accountId&#x60;. - PAY_REFUND receiver: &#x60;payerInfo&#x3D;name&#x60;;
     * &#x60;receiverInfo&#x3D;binanceId&#x60;. - PAYOUT sender: &#x60;payerInfo&#x3D;binanceId,
     * name&#x60;; &#x60;receiverInfo&#x3D;name, accountId&#x60;. - PAYOUT receiver:
     * &#x60;payerInfo&#x3D;name&#x60;; &#x60;receiverInfo&#x3D;binanceId&#x60;. - CRYPTO_BOX_RF
     * receiver: &#x60;payerInfo&#x3D;name&#x60; (always &#x60;\&quot;Crypto Box\&quot;&#x60;);
     * &#x60;receiverInfo&#x3D;binanceId&#x60;. - REMITTANCE sender:
     * &#x60;payerInfo&#x3D;binanceId&#x60;; &#x60;receiverInfo&#x3D;name, institutionName,
     * cardNumber, digitalWalletId&#x60;.
     *
     * @throws ApiException if the Api call fails
     */
    public void getPayTradeHistoryExample() throws ApiException, IOException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long limit = 100L;
        Long recvWindow = 5000L;
        ApiResponse<GetPayTradeHistoryResponse> response =
                getApi().getPayTradeHistory(startTime, endTime, limit, recvWindow);
        System.out.println(response.getData());
    }
}
