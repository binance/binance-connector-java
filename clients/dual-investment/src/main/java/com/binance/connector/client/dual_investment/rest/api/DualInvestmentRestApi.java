package com.binance.connector.client.dual_investment.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.dual_investment.rest.DualInvestmentRestApiUtil;
import com.binance.connector.client.dual_investment.rest.model.ChangeAutoCompoundStatusRequest;
import com.binance.connector.client.dual_investment.rest.model.ChangeAutoCompoundStatusResponse;
import com.binance.connector.client.dual_investment.rest.model.CheckDualInvestmentAccountsResponse;
import com.binance.connector.client.dual_investment.rest.model.GetDualInvestmentPositionsResponse;
import com.binance.connector.client.dual_investment.rest.model.GetDualInvestmentProductListResponse;
import com.binance.connector.client.dual_investment.rest.model.OptionType;
import com.binance.connector.client.dual_investment.rest.model.Status;
import com.binance.connector.client.dual_investment.rest.model.SubscribeDualInvestmentProductsRequest;
import com.binance.connector.client.dual_investment.rest.model.SubscribeDualInvestmentProductsResponse;

public class DualInvestmentRestApi {

    private final MarketDataApi marketDataApi;
    private final TradeApi tradeApi;

    public DualInvestmentRestApi(ClientConfiguration configuration) {
        this(DualInvestmentRestApiUtil.getDefaultClient(configuration));
    }

    public DualInvestmentRestApi(ApiClient apiClient) {
        this.marketDataApi = new MarketDataApi(apiClient);
        this.tradeApi = new TradeApi(apiClient);
    }

    /**
     * Get Dual Investment product list Get Dual Investment product list Weight(IP): 1
     *
     * @param optionType Input CALL or PUT (required)
     * @param exercisedCoin Target exercised asset, e.g.: if you subscribe to a high sell product
     *     (call option), you should input: &#x60;optionType: CALL&#x60;, &#x60;exercisedCoin:
     *     USDT&#x60;, &#x60;investCoin: BNB&#x60;; if you subscribe to a low buy product (put
     *     option), you should input: &#x60;optionType: PUT&#x60;, &#x60;exercisedCoin: BNB&#x60;,
     *     &#x60;investCoin: USDT&#x60; (required)
     * @param investCoin Asset used for subscribing, e.g.: if you subscribe to a high sell product
     *     (call option), you should input: &#x60;optionType: CALL&#x60;, &#x60;exercisedCoin:
     *     USDT&#x60;, &#x60;investCoin: BNB&#x60;; if you subscribe to a low buy product (put
     *     option), you should input: &#x60;optionType: PUT&#x60;, &#x60;exercisedCoin: BNB&#x60;,
     *     &#x60;investCoin: USDT&#x60; (required)
     * @param pageSize Number of records per page (optional)
     * @param pageIndex Page index (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;GetDualInvestmentProductListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Dual Investment product list </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-dual-investment/api/rest-api/market-data#get-dual-investment-product-list">Get
     *     Dual Investment product list Documentation</a>
     */
    public ApiResponse<GetDualInvestmentProductListResponse> getDualInvestmentProductList(
            OptionType optionType,
            String exercisedCoin,
            String investCoin,
            Long pageSize,
            Long pageIndex,
            Long recvWindow)
            throws ApiException {
        return marketDataApi.getDualInvestmentProductList(
                optionType, exercisedCoin, investCoin, pageSize, pageIndex, recvWindow);
    }

    /**
     * Change Auto-Compound status (USER_DATA) Change Auto-Compound status Weight(IP): 1 Security
     * Type: USER_DATA Notes: - 15:31 ~ 16:00 UTC+8: This function is disabled.
     *
     * @param changeAutoCompoundStatusRequest (required)
     * @return ApiResponse&lt;ChangeAutoCompoundStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Change Auto-Compound status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-dual-investment/api/rest-api/trade#change-auto-compound-status">Change
     *     Auto-Compound status (USER_DATA) Documentation</a>
     */
    public ApiResponse<ChangeAutoCompoundStatusResponse> changeAutoCompoundStatus(
            ChangeAutoCompoundStatusRequest changeAutoCompoundStatusRequest) throws ApiException {
        return tradeApi.changeAutoCompoundStatus(changeAutoCompoundStatusRequest);
    }

    /**
     * Check Dual Investment accounts (USER_DATA) Check Dual Investment accounts Weight(IP): 1
     * Security Type: USER_DATA
     *
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;CheckDualInvestmentAccountsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Check Dual Investment accounts </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-dual-investment/api/rest-api/trade#check-dual-investment-accounts">Check
     *     Dual Investment accounts (USER_DATA) Documentation</a>
     */
    public ApiResponse<CheckDualInvestmentAccountsResponse> checkDualInvestmentAccounts(
            Long recvWindow) throws ApiException {
        return tradeApi.checkDualInvestmentAccounts(recvWindow);
    }

    /**
     * Get Dual Investment positions (USER_DATA) Get Dual Investment positions (batch) Weight(IP): 1
     * Security Type: USER_DATA
     *
     * @param status &#x60;PENDING&#x60;: Products are purchasing, will give results later;
     *     &#x60;PURCHASE_SUCCESS&#x60;: purchase successfully; &#x60;SETTLED&#x60;: Products are
     *     finish settling; &#x60;PURCHASE_FAIL&#x60;: fail to purchase; &#x60;REFUNDING&#x60;:
     *     refund ongoing; &#x60;REFUND_SUCCESS&#x60;: refund to spot account successfully;
     *     &#x60;SETTLING&#x60;: Products are settling. If don&#39;t fill this field, will response
     *     all the position status. (optional)
     * @param pageSize Number of records per page (optional)
     * @param pageIndex Page index (optional)
     * @param recvWindow Request validity window in milliseconds (optional)
     * @return ApiResponse&lt;GetDualInvestmentPositionsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Dual Investment positions </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-dual-investment/api/rest-api/trade#get-dual-investment-positions">Get
     *     Dual Investment positions (USER_DATA) Documentation</a>
     */
    public ApiResponse<GetDualInvestmentPositionsResponse> getDualInvestmentPositions(
            Status status, Long pageSize, Long pageIndex, Long recvWindow) throws ApiException {
        return tradeApi.getDualInvestmentPositions(status, pageSize, pageIndex, recvWindow);
    }

    /**
     * Subscribe Dual Investment products (USER_DATA) Subscribe Dual Investment products Weight(IP):
     * 1 Security Type: USER_DATA Notes: - Failed messages: - Products are not available. This means
     * APR changed to a lower value, or the order is unavailable. - Failed. This means system or
     * network errors.
     *
     * @param subscribeDualInvestmentProductsRequest (required)
     * @return ApiResponse&lt;SubscribeDualInvestmentProductsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Subscribe Dual Investment products </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-dual-investment/api/rest-api/trade#subscribe-dual-investment-products">Subscribe
     *     Dual Investment products (USER_DATA) Documentation</a>
     */
    public ApiResponse<SubscribeDualInvestmentProductsResponse> subscribeDualInvestmentProducts(
            SubscribeDualInvestmentProductsRequest subscribeDualInvestmentProductsRequest)
            throws ApiException {
        return tradeApi.subscribeDualInvestmentProducts(subscribeDualInvestmentProductsRequest);
    }
}
