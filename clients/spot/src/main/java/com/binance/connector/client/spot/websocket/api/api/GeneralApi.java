/*
 * Binance Spot WebSocket API
 * OpenAPI Specifications for the Binance Spot WebSocket API  API documents:   - [Github web-socket-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/web-socket-api.md)   - [General API information for web-socket-api on website](https://developers.binance.com/docs/binance-spot-api-docs/web-socket-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.websocket.api.api;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.exception.ConstraintViolationException;
import com.binance.connector.client.common.websocket.adapter.ConnectionInterface;
import com.binance.connector.client.common.websocket.dtos.ApiRequestWrapperDTO;
import com.binance.connector.client.common.websocket.dtos.BaseRequestDTO;
import com.binance.connector.client.spot.websocket.api.model.ExchangeInfoRequest;
import com.binance.connector.client.spot.websocket.api.model.ExchangeInfoResponse;
import com.binance.connector.client.spot.websocket.api.model.PingResponse;
import com.binance.connector.client.spot.websocket.api.model.TimeResponse;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.*;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import org.hibernate.validator.messageinterpolation.ParameterMessageInterpolator;

public class GeneralApi {
    private ConnectionInterface connection;

    public GeneralApi() {}

    public GeneralApi(ConnectionInterface connection) {
        this.connection = connection;
    }

    /**
     * WebSocket Exchange information Query current exchange trading rules, rate limits, and symbol
     * information. Weight: 20
     *
     * @param exchangeInfoRequest (optional)
     * @return ExchangeInfoResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Exchange information </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/general-requests#exchange-information">WebSocket
     *     Exchange information Documentation</a>
     */
    public CompletableFuture<ExchangeInfoResponse> exchangeInfo(
            ExchangeInfoRequest exchangeInfoRequest) throws ApiException {
        exchangeInfoValidateBeforeCall(exchangeInfoRequest);
        String methodName = "/exchangeInfo".substring(1);
        ApiRequestWrapperDTO<ExchangeInfoRequest, ExchangeInfoResponse> build =
                new ApiRequestWrapperDTO.Builder<ExchangeInfoRequest, ExchangeInfoResponse>()
                        .id(getRequestID())
                        .method(methodName)
                        .params(exchangeInfoRequest)
                        .responseType(ExchangeInfoResponse.class)
                        .signed(false)
                        .build();

        try {
            connection.send(build);
        } catch (InterruptedException e) {
            throw new ApiException(e);
        }
        return build.getResponseCallback();
    }

    @SuppressWarnings("rawtypes")
    private void exchangeInfoValidateBeforeCall(ExchangeInfoRequest exchangeInfoRequest)
            throws ApiException {
        try {
            Validator validator =
                    Validation.byDefaultProvider()
                            .configure()
                            .messageInterpolator(new ParameterMessageInterpolator())
                            .buildValidatorFactory()
                            .getValidator();

            Set<ConstraintViolation<ExchangeInfoRequest>> violations =
                    validator.validate(exchangeInfoRequest);

            if (!violations.isEmpty()) {
                throw new ConstraintViolationException(violations);
            }
        } catch (SecurityException e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }

    /**
     * WebSocket Test connectivity Test connectivity to the WebSocket API. Weight: 1
     *
     * @return PingResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Test connectivity </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/general-requests#test-connectivity">WebSocket
     *     Test connectivity Documentation</a>
     */
    public CompletableFuture<PingResponse> ping() throws ApiException {
        pingValidateBeforeCall();
        String methodName = "/ping".substring(1);
        ApiRequestWrapperDTO<BaseRequestDTO, PingResponse> build =
                new ApiRequestWrapperDTO.Builder<BaseRequestDTO, PingResponse>()
                        .id(getRequestID())
                        .method(methodName)
                        .params(new BaseRequestDTO())
                        .responseType(PingResponse.class)
                        .signed(false)
                        .build();

        try {
            connection.send(build);
        } catch (InterruptedException e) {
            throw new ApiException(e);
        }
        return build.getResponseCallback();
    }

    @SuppressWarnings("rawtypes")
    private void pingValidateBeforeCall() throws ApiException {}

    /**
     * WebSocket Check server time Test connectivity to the WebSocket API and get the current server
     * time. Weight: 1
     *
     * @return TimeResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check server time </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/general-requests#check-server-time">WebSocket
     *     Check server time Documentation</a>
     */
    public CompletableFuture<TimeResponse> time() throws ApiException {
        timeValidateBeforeCall();
        String methodName = "/time".substring(1);
        ApiRequestWrapperDTO<BaseRequestDTO, TimeResponse> build =
                new ApiRequestWrapperDTO.Builder<BaseRequestDTO, TimeResponse>()
                        .id(getRequestID())
                        .method(methodName)
                        .params(new BaseRequestDTO())
                        .responseType(TimeResponse.class)
                        .signed(false)
                        .build();

        try {
            connection.send(build);
        } catch (InterruptedException e) {
            throw new ApiException(e);
        }
        return build.getResponseCallback();
    }

    @SuppressWarnings("rawtypes")
    private void timeValidateBeforeCall() throws ApiException {}

    public String getRequestID() {
        return UUID.randomUUID().toString();
    }
}
