package com.binance.connector.client.sub_account.rest.managedsubaccount;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.QueryManagedSubAccountTransferLogMasterAccountInvestorResponse;
import com.binance.connector.client.sub_account.rest.model.TransferFunctionAccountType;
import java.io.IOException;

/** API examples for ManagedSubAccountApi */
public class QueryManagedSubAccountTransferLogMasterAccountInvestorExample {
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
     * Query Managed Sub Account Transfer Log For Investor Master Account (USER_DATA)
     *
     * <p>Query Managed Sub Account Transfer Log For Investor Master Account Investor can use this
     * api to query managed sub account transfer log. This endpoint is available for investor of
     * Managed Sub-Account. A Managed Sub-Account is an account type for investors who value
     * flexibility in asset allocation and account application, while delegating trades to a
     * professional trading team. Please refer to
     * [link](https://www.binance.com/en/support/faq/how-to-get-started-with-managed-sub-account-functions-and-frequently-asked-questions-0594748722704383a7c369046e489459)
     * Weight(IP): 1 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void queryManagedSubAccountTransferLogMasterAccountInvestorExample()
            throws ApiException, IOException {
        String email = "abc@test.com";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long page = 1L;
        Long limit = 1L;
        String transfers = "";
        TransferFunctionAccountType transferFunctionAccountType = TransferFunctionAccountType.SPOT;
        ApiResponse<QueryManagedSubAccountTransferLogMasterAccountInvestorResponse> response =
                getApi().queryManagedSubAccountTransferLogMasterAccountInvestor(
                                email,
                                startTime,
                                endTime,
                                page,
                                limit,
                                transfers,
                                transferFunctionAccountType);
        System.out.println(response.getData());
    }
}
