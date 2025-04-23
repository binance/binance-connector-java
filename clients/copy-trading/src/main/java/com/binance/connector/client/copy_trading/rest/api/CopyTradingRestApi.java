package com.binance.connector.client.copy_trading.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.copy_trading.rest.CopyTradingRestApiUtil;
import com.binance.connector.client.copy_trading.rest.model.GetFuturesLeadTraderStatusResponse;
import com.binance.connector.client.copy_trading.rest.model.GetFuturesLeadTradingSymbolWhitelistResponse;

public class CopyTradingRestApi {

    private final FutureCopyTradingApi futureCopyTradingApi;

    public CopyTradingRestApi(ClientConfiguration configuration) {
        this(CopyTradingRestApiUtil.getDefaultClient(configuration));
    }

    public CopyTradingRestApi(ApiClient apiClient) {
        this.futureCopyTradingApi = new FutureCopyTradingApi(apiClient);
    }

    /**
     * Get Futures Lead Trader Status(TRADE) Get Futures Lead Trader Status Weight: 20
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFuturesLeadTraderStatusResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Futures Lead Trader Status </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/copy_trading/future-copy-trading/Get-Futures-Lead-Trader-Status">Get
     *     Futures Lead Trader Status(TRADE) Documentation</a>
     */
    public ApiResponse<GetFuturesLeadTraderStatusResponse> getFuturesLeadTraderStatus(
            Long recvWindow) throws ApiException {
        return futureCopyTradingApi.getFuturesLeadTraderStatus(recvWindow);
    }

    /**
     * Get Futures Lead Trading Symbol Whitelist(USER_DATA) Get Futures Lead Trading Symbol
     * Whitelist Weight: 20
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;GetFuturesLeadTradingSymbolWhitelistResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Get Futures Lead Trading Symbol Whitelist </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/docs/copy_trading/future-copy-trading/Get-Futures-Lead-Trading-Symbol-Whitelist">Get
     *     Futures Lead Trading Symbol Whitelist(USER_DATA) Documentation</a>
     */
    public ApiResponse<GetFuturesLeadTradingSymbolWhitelistResponse>
            getFuturesLeadTradingSymbolWhitelist(Long recvWindow) throws ApiException {
        return futureCopyTradingApi.getFuturesLeadTradingSymbolWhitelist(recvWindow);
    }
}
