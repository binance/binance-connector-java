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
     * <p>Move position between sub-master, master-sub, or sub-sub accounts when necessary * You
     * need to Enable Trading permission for the API Key which requests this endpoint. * This
     * function only support VIP level 7-9. * Only master account can use the function * Quantity
     * should be positive number only * The function support normal account, PM PRO and PM PRO SPAN.
     * * Only support for from account has positions * For all orders in the same orderArgs request,
     * if any symbol’s total close position quantity is bigger than the symbol’s current position
     * quantity, all batch orders in the same list will fail simultaneously. * Only support cross
     * margin mode * The price for move position is MarkPrice only. * Not support for MSA. * Not
     * support for the symbol under Reduce-Only. Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void movePositionForSubAccountExample() throws ApiException {
        MovePositionForSubAccountRequest movePositionForSubAccountRequest =
                new MovePositionForSubAccountRequest();
        movePositionForSubAccountRequest.fromUserEmail("");
        movePositionForSubAccountRequest.toUserEmail("");
        movePositionForSubAccountRequest.productType("");
        movePositionForSubAccountRequest.orderArgs(new OrderArgs());
        ApiResponse<MovePositionForSubAccountResponse> response =
                getApi().movePositionForSubAccount(movePositionForSubAccountRequest);
        System.out.println(response.getData());
    }
}
