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

package com.binance.connector.client.auto_invest.rest.trade;

import com.binance.connector.client.auto_invest.rest.AutoInvestRestApiUtil;
import com.binance.connector.client.auto_invest.rest.api.AutoInvestRestApi;
import com.binance.connector.client.auto_invest.rest.model.IndexLinkedPlanRebalanceDetailsResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;

/** API examples for TradeApi */
public class IndexLinkedPlanRebalanceDetailsExample {
    private AutoInvestRestApi api;

    public AutoInvestRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    AutoInvestRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new AutoInvestRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Index Linked Plan Rebalance Details(USER_DATA)
     *
     * <p>Get the history of Index Linked Plan Redemption transactions * Max 30 day difference
     * between &#x60;startTime&#x60; and &#x60;endTime&#x60; * If no &#x60;startTime&#x60; and
     * &#x60;endTime&#x60;, default to show past 30 day records Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void indexLinkedPlanRebalanceDetailsExample() throws ApiException {
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long size = 8L;
        Long recvWindow = 5000L;
        ApiResponse<IndexLinkedPlanRebalanceDetailsResponse> response =
                getApi().indexLinkedPlanRebalanceDetails(
                                startTime, endTime, current, size, recvWindow);
        System.out.println(response.getData());
    }
}
