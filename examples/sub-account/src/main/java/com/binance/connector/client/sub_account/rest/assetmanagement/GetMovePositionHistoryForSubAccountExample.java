/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.sub_account.rest.assetmanagement;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.sub_account.rest.SubAccountRestApiUtil;
import com.binance.connector.client.sub_account.rest.api.SubAccountRestApi;
import com.binance.connector.client.sub_account.rest.model.GetMovePositionHistoryForSubAccountResponse;

/** API examples for AssetManagementApi */
public class GetMovePositionHistoryForSubAccountExample {
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
     * Get Move Position History for Sub-account (For Master Account) (USER_DATA)
     *
     * <p>Query move position history * If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent,
     * return records of the last 90 days by default with 1000 maximum limits * If
     * &#x60;startTime&#x60; is sent and &#x60;endTime&#x60; is not sent, return records of
     * [max(startTime, now-90d), now]. * If &#x60;startTime&#x60; is not sent and
     * &#x60;endTime&#x60; is sent, return records of [max(now,endTime-90d), endTime]. Weight: 150
     *
     * @throws ApiException if the Api call fails
     */
    public void getMovePositionHistoryForSubAccountExample() throws ApiException {
        String symbol = "";
        Long page = 0L;
        Long row = 0L;
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long recvWindow = 5000L;
        ApiResponse<GetMovePositionHistoryForSubAccountResponse> response =
                getApi().getMovePositionHistoryForSubAccount(
                                symbol, page, row, startTime, endTime, recvWindow);
        System.out.println(response.getData());
    }
}
