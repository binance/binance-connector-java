/*
 * Binance Convert REST API
 * OpenAPI Specification for the Binance Convert REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.convert.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.Pair;
import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.exception.ConstraintViolationException;
import com.binance.connector.client.convert.rest.model.ListAllConvertPairsResponse;
import com.binance.connector.client.convert.rest.model.QueryOrderQuantityPrecisionPerAssetResponse;
import com.google.gson.reflect.TypeToken;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.*;
import jakarta.validation.executable.ExecutableValidator;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

public class MarketDataApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    private static final String USER_AGENT =
            String.format(
                    "binance-convert/1.2.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());
    private static final boolean HAS_TIME_UNIT = false;

    public MarketDataApi(ClientConfiguration clientConfiguration) {
        this(new ApiClient(clientConfiguration));
    }

    public MarketDataApi(ApiClient apiClient) {
        apiClient.setUserAgent(USER_AGENT);
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for listAllConvertPairs
     *
     * @param fromAsset User spends coin (optional)
     * @param toAsset User receives coin (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List All Convert Pairs </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/convert/market-data/List-All-Convert-Pairs">List
     *     All Convert Pairs Documentation</a>
     */
    private okhttp3.Call listAllConvertPairsCall(String fromAsset, String toAsset)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sapi/v1/convert/exchangeInfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fromAsset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fromAsset", fromAsset));
        }

        if (toAsset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("toAsset", toAsset));
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/x-www-form-urlencoded"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        List<String> localVarAuthNames = new ArrayList<>();
        localVarAuthNames.addAll(Arrays.asList(new String[] {}));
        if (HAS_TIME_UNIT) {
            localVarAuthNames.add("timeUnit");
        }
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames.toArray(new String[0]));
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listAllConvertPairsValidateBeforeCall(String fromAsset, String toAsset)
            throws ApiException {
        try {
            Validator validator =
                    Validation.byDefaultProvider()
                            .configure()
                            .messageInterpolator(new ParameterMessageInterpolator())
                            .buildValidatorFactory()
                            .getValidator();
            ExecutableValidator executableValidator = validator.forExecutables();

            Object[] parameterValues = {fromAsset, toAsset};
            Method method =
                    this.getClass().getMethod("listAllConvertPairs", String.class, String.class);
            Set<ConstraintViolation<MarketDataApi>> violations =
                    executableValidator.validateParameters(this, method, parameterValues);

            if (violations.size() == 0) {
                return listAllConvertPairsCall(fromAsset, toAsset);
            } else {
                throw new ConstraintViolationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }

    /**
     * List All Convert Pairs Query for all convertible token pairs and the tokens’ respective
     * upper/lower limits * User needs to supply either or both of the input parameter * If not
     * defined for both fromAsset and toAsset, only partial token pairs will be returned Weight:
     * 3000(IP)
     *
     * @param fromAsset User spends coin (optional)
     * @param toAsset User receives coin (optional)
     * @return ApiResponse&lt;ListAllConvertPairsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> List All Convert Pairs </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/convert/market-data/List-All-Convert-Pairs">List
     *     All Convert Pairs Documentation</a>
     */
    public ApiResponse<ListAllConvertPairsResponse> listAllConvertPairs(
            String fromAsset, String toAsset) throws ApiException {
        okhttp3.Call localVarCall = listAllConvertPairsValidateBeforeCall(fromAsset, toAsset);
        java.lang.reflect.Type localVarReturnType =
                new TypeToken<ListAllConvertPairsResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Build call for queryOrderQuantityPrecisionPerAsset
     *
     * @param recvWindow The value cannot be greater than 60000 (optional)
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> order quantity precision per asset </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/convert/market-data/Query-order-quantity-precision-per-asset">Query
     *     order quantity precision per asset(USER_DATA) Documentation</a>
     */
    private okhttp3.Call queryOrderQuantityPrecisionPerAssetCall(Long recvWindow)
            throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {};

        // Determine Base Path to Use
        if (localCustomBaseUrl != null) {
            basePath = localCustomBaseUrl;
        } else if (localBasePaths.length > 0) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/sapi/v1/convert/assetInfo";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (recvWindow != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("recvWindow", recvWindow));
        }

        final String[] localVarAccepts = {"application/json"};
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {"application/x-www-form-urlencoded"};
        final String localVarContentType =
                localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }
        List<String> localVarAuthNames = new ArrayList<>();
        localVarAuthNames.addAll(
                Arrays.asList(
                        new String[] {
                            "binanceSignature",
                        }));
        if (HAS_TIME_UNIT) {
            localVarAuthNames.add("timeUnit");
        }
        return localVarApiClient.buildCall(
                basePath,
                localVarPath,
                "GET",
                localVarQueryParams,
                localVarCollectionQueryParams,
                localVarPostBody,
                localVarHeaderParams,
                localVarCookieParams,
                localVarFormParams,
                localVarAuthNames.toArray(new String[0]));
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryOrderQuantityPrecisionPerAssetValidateBeforeCall(Long recvWindow)
            throws ApiException {
        try {
            Validator validator =
                    Validation.byDefaultProvider()
                            .configure()
                            .messageInterpolator(new ParameterMessageInterpolator())
                            .buildValidatorFactory()
                            .getValidator();
            ExecutableValidator executableValidator = validator.forExecutables();

            Object[] parameterValues = {recvWindow};
            Method method =
                    this.getClass().getMethod("queryOrderQuantityPrecisionPerAsset", Long.class);
            Set<ConstraintViolation<MarketDataApi>> violations =
                    executableValidator.validateParameters(this, method, parameterValues);

            if (violations.size() == 0) {
                return queryOrderQuantityPrecisionPerAssetCall(recvWindow);
            } else {
                throw new ConstraintViolationException((Set) violations);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }

    /**
     * Query order quantity precision per asset(USER_DATA) Query for supported asset’s precision
     * information Weight: 100(IP)
     *
     * @param recvWindow The value cannot be greater than 60000 (optional)
     * @return ApiResponse&lt;QueryOrderQuantityPrecisionPerAssetResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> order quantity precision per asset </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/convert/market-data/Query-order-quantity-precision-per-asset">Query
     *     order quantity precision per asset(USER_DATA) Documentation</a>
     */
    public ApiResponse<QueryOrderQuantityPrecisionPerAssetResponse>
            queryOrderQuantityPrecisionPerAsset(Long recvWindow) throws ApiException {
        okhttp3.Call localVarCall =
                queryOrderQuantityPrecisionPerAssetValidateBeforeCall(recvWindow);
        java.lang.reflect.Type localVarReturnType =
                new TypeToken<QueryOrderQuantityPrecisionPerAssetResponse>() {}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }
}
