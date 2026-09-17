package com.binance.connector.client.wallet.rest.travelrule;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.BrokerWithdrawRequest;
import com.binance.connector.client.wallet.rest.model.BrokerWithdrawResponse;
import java.io.IOException;

/** API examples for TravelRuleApi */
public class BrokerWithdrawExample {
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
     * Broker Withdraw (for brokers of local entities that require travel rule) (USER_DATA)
     *
     * <p>Submit a withdrawal request for brokers of local entities that required travel rule.
     * Weight(UID): 600 Security Type: USER_DATA Notes: - If &#x60;network&#x60; not send, return
     * with default network of the coin, but if the address could not match default network, the
     * withdraw will be rejected. - You can get &#x60;network&#x60; in &#x60;networkList&#x60; of a
     * coin in the response of &#x60;Get /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;. -
     * Questionnaire is different for each local entity, please refer to the &#x60;Withdraw
     * Questionnaire Contents&#x60; page. - If getting error like &#x60;Questionnaire format not
     * valid.&#x60; or &#x60;Questionnaire must not be blank&#x60;, please try to verify the format
     * of the questionnaire and use URL-encoded format. **StandardPii** **For Natural Person** -
     * &#x60;piiType&#x60; (INTEGER, Mandatory): Fix to 0: Natural Person - &#x60;latinNames&#x60;
     * (List&amp;lt;PiiName&amp;gt;, Mandatory): In case a person have complicated names or multiple
     * names, this parameter is a list - &#x60;localNames&#x60; (List&amp;lt;PiiName&amp;gt;,
     * Optional): In case a person have complicated names or multiple names, this parameter is a
     * list - &#x60;nationality&#x60; (STRING, Optional) - &#x60;residenceCountry&#x60; (STRING,
     * Mandatory) - &#x60;nationalIdentifier&#x60; (STRING, Optional) -
     * &#x60;nationalIdentifierType&#x60; (STRING, Optional) -
     * &#x60;nationalIdentifierIssueCountry&#x60; (STRING, Optional) - &#x60;dateOfBirth&#x60;
     * (STRING, Optional): yyyy-mm-dd. Not required but strongly recommended. Providing DOB could
     * greatly reduce false positive rate during risk checking process. - &#x60;placeOfBirth&#x60;
     * (STRING, Optional) - &#x60;address&#x60; (STRING, Optional) **For Legal Person** -
     * &#x60;piiType&#x60; (INTEGER, Mandatory): Fix to 1: Legal Person - &#x60;latinName&#x60;
     * (STRING, Mandatory): It&#39;s company name for Legal Person - &#x60;localName&#x60; (STRING,
     * Optional) - &#x60;registrationCountry&#x60; (STRING, Mandatory) -
     * &#x60;nationalIdentifier&#x60; (STRING, Optional) - &#x60;nationalIdentifierType&#x60;
     * (STRING, Optional) - &#x60;nationalIdentifierIssueCountry&#x60; (STRING, Optional) -
     * &#x60;registrationDate&#x60; (STRING, Optional): yyyy-mm-dd. Not required but strongly
     * recommended. - &#x60;address&#x60; (STRING, Optional) - &#x60;walletAddress&#x60; (STRING,
     * Optional) - &#x60;walletTag&#x60; (STRING, Optional) **PiiName** - &#x60;firstName&#x60;
     * (STRING, Mandatory): Mandatory for Natural person - &#x60;middleName&#x60; (STRING, Optional)
     * - &#x60;lastName&#x60; (STRING, Optional)
     *
     * @throws ApiException if the Api call fails
     */
    public void brokerWithdrawExample() throws ApiException, IOException {
        BrokerWithdrawRequest brokerWithdrawRequest = new BrokerWithdrawRequest();
        brokerWithdrawRequest.address("");
        brokerWithdrawRequest.coin("BTC");
        brokerWithdrawRequest.amount(1.0d);
        brokerWithdrawRequest.withdrawOrderId("1");
        brokerWithdrawRequest.questionnaire("");
        brokerWithdrawRequest.originatorPii("");
        ApiResponse<BrokerWithdrawResponse> response =
                getApi().brokerWithdraw(brokerWithdrawRequest);
        System.out.println(response.getData());
    }
}
