package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.MovePositionForSubAccountRequest;
import com.binance.connector.client.sub_account.rest.model.MovePositionForSubAccountResponse;
import com.binance.connector.client.sub_account.rest.model.OrderArgs;
import com.binance.connector.client.sub_account.rest.model.ProductType;
import java.io.IOException;

/** API examples for AssetManagementApi */
public class MovePositionForSubAccountExample {
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
     * Move Position for Sub-account (For Master Account) (USER_DATA)
     *
     * <p>Move position between sub-master, master-sub, or sub-sub accounts when necessary
     * Weight(IP): 1 Security Type: USER_DATA Notes: - You need to enable the &#x60;Trading&#x60;
     * permission for the API key used to call this endpoint. - This function is only available for
     * VIP levels 7-9. - Only master accounts can call this endpoint. - &#x60;quantity&#x60; must be
     * a positive number. - Supported account types: normal account, PM PRO, PM PRO SPAN, and PM
     * Retail. - The source account must have positions. - For orders in the same
     * &#x60;orderArgs&#x60; request, if any symbol&#39;s total close position quantity exceeds
     * current position quantity, all orders in that batch fail. - Only cross margin mode is
     * supported. - The move position price supports &#x60;MARK_PRICE&#x60; only. - MSA is not
     * supported. - Symbols configured with &#x60;Reduce-Only&#x60; are not supported.
     *
     * @throws ApiException if the Api call fails
     */
    public void movePositionForSubAccountExample() throws ApiException, IOException {
        MovePositionForSubAccountRequest movePositionForSubAccountRequest =
                new MovePositionForSubAccountRequest();
        movePositionForSubAccountRequest.fromUserEmail("testFrom@google.com");
        movePositionForSubAccountRequest.toUserEmail("testTo@google.com");
        movePositionForSubAccountRequest.productType(ProductType.UM);
        movePositionForSubAccountRequest.orderArgs(new OrderArgs());
        ApiResponse<MovePositionForSubAccountResponse> response =
                getApi().movePositionForSubAccount(movePositionForSubAccountRequest);
        System.out.println(response.getData());
    }
}
