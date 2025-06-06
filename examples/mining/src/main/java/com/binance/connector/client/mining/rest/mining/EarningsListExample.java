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

package com.binance.connector.client.mining.rest.mining;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.mining.rest.MiningRestApiUtil;
import com.binance.connector.client.mining.rest.api.MiningRestApi;
import com.binance.connector.client.mining.rest.model.EarningsListResponse;

/** API examples for MiningApi */
public class EarningsListExample {
    private MiningRestApi api;

    public MiningRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = MiningRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MiningRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Earnings List(USER_DATA)
     *
     * <p>Query Earnings List Weight: 5
     *
     * @throws ApiException if the Api call fails
     */
    public void earningsListExample() throws ApiException {
        String algo = "";
        String userName = "";
        String coin = "";
        Long startDate = 0L;
        Long endDate = 0L;
        Long pageIndex = 1L;
        Long pageSize = 0L;
        Long recvWindow = 5000L;
        ApiResponse<EarningsListResponse> response =
                getApi().earningsList(
                                algo,
                                userName,
                                coin,
                                startDate,
                                endDate,
                                pageIndex,
                                pageSize,
                                recvWindow);
        System.out.println(response.getData());
    }
}
