package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.FromAccountType;
import com.binance.connector.client.sub_account.rest.model.ToAccountType;
import com.binance.connector.client.sub_account.rest.model.UniversalTransferRequest;
import com.binance.connector.client.sub_account.rest.model.UniversalTransferResponse;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class UniversalTransferExample {
    private SubAccountRestApi api;

    public SubAccountRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    SubAccountRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SubAccountRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Universal Transfer (For Master Account) (USER_DATA)
     *
     * <p>Universal Transfer Weight(IP): 1 Weight(UID): 360 Security Type: USER_DATA Notes: - You
     * need to enable the &#x60;internal transfer&#x60; option for the API key used to call this
     * endpoint. - If &#x60;fromEmail&#x60; is not sent, transfer out from the master account by
     * default. - If &#x60;toEmail&#x60; is not sent, transfer into the master account by default. -
     * When &#x60;fromAccountType&#x60; and &#x60;toAccountType&#x60; are the same, at least one of
     * &#x60;fromEmail&#x60; or &#x60;toEmail&#x60; must be sent. - Supported transfer scenarios: -
     * &#x60;SPOT&#x60; -&gt; &#x60;SPOT&#x60; / &#x60;USDT_FUTURE&#x60; / &#x60;COIN_FUTURE&#x60;
     * (master or sub-account). - &#x60;SPOT&#x60; / &#x60;USDT_FUTURE&#x60; /
     * &#x60;COIN_FUTURE&#x60; -&gt; &#x60;SPOT&#x60; (master or sub-account). - Master account
     * &#x60;SPOT&#x60; -&gt; sub-account &#x60;MARGIN(Cross)&#x60; / &#x60;ISOLATED_MARGIN&#x60;. -
     * Sub-account &#x60;MARGIN(Cross)&#x60; / &#x60;ISOLATED_MARGIN&#x60; -&gt; master account
     * &#x60;SPOT&#x60;. - Sub-account &#x60;MARGIN(Cross)&#x60; -&gt; sub-account
     * &#x60;MARGIN(Cross)&#x60;. - &#x60;ALPHA&#x60; -&gt; &#x60;ALPHA&#x60; (master or
     * sub-account).
     *
     * @throws ApiException if the Api call fails
     */
    public void universalTransferExample() throws ApiException, IOException {
        UniversalTransferRequest universalTransferRequest = new UniversalTransferRequest();
        universalTransferRequest.fromAccountType(FromAccountType.SPOT);
        universalTransferRequest.toAccountType(ToAccountType.SPOT);
        universalTransferRequest.asset("BTC");
        universalTransferRequest.amount(1.0d);
        ApiResponse<UniversalTransferResponse> response =
                getApi().universalTransfer(universalTransferRequest);
        System.out.println(response.getData());
    }
}
