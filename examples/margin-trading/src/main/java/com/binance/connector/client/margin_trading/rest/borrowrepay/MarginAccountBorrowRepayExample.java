package com.binance.connector.client.margin_trading.rest.borrowrepay;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.margin_trading.rest.MarginTradingRestApiUtil;
import com.binance.connector.client.margin_trading.rest.api.MarginTradingRestApi;
import com.binance.connector.client.margin_trading.rest.model.IsIsolated;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountBorrowRepayRequest;
import com.binance.connector.client.margin_trading.rest.model.MarginAccountBorrowRepayResponse;
import com.binance.connector.client.margin_trading.rest.model.OrderType;
import java.io.IOException;

/** API examples for BorrowRepayApi */
public class MarginAccountBorrowRepayExample {
    private MarginTradingRestApi api;

    public MarginTradingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    MarginTradingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new MarginTradingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Margin account borrow/repay (USER_DATA)
     *
     * <p>Margin account borrow/repay Weight(UID): 1500 Security Type: USER_DATA Notes: -
     * &#x60;-3045 INSUFFICIENT_INVENTORY&#x60;: returned when system borrowable inventory is below
     * the requested amount, or when inventory is severely insufficient (all borrow requests
     * rejected regardless of size). Monitor system asset availability and adjust borrow strategy
     * accordingly. - &#x60;-3006 EXCEED_MAX_BORROWABLE&#x60;: borrow amount exceeds your current
     * max borrowable limit. Query &#x60;GET /sapi/v1/margin/maxBorrowable&#x60; and adjust the
     * request. - &#x60;-3012 ASSET_ADMIN_BAN_BORROW&#x60;: this asset does not currently support
     * borrowing. Query &#x60;GET /sapi/v1/margin/allAssets&#x60; for asset borrow availability. -
     * &#x60;-3015 REPAY_EXCEED_LIABILITY&#x60;: returned in two scenarios — (1) repay amount
     * exceeds your outstanding liability, or (2) the remaining unpaid debt after this repayment
     * would fall below Binance&#39;s minimum threshold. Adjust the repay amount accordingly. -
     * &#x60;-3007 HAS_PENDING_TRANSACTION&#x60;: a borrow/repay transaction is already in progress
     * on this account. Requests are processed in submission order across all assets, and an
     * in-flight request briefly blocks subsequent ones. Typical processing time is ~100ms; space
     * consecutive requests by at least 100ms. Auto-repay orders can also fail silently for this
     * reason — verify outstanding liability after an auto-repay executes.
     *
     * @throws ApiException if the Api call fails
     */
    public void marginAccountBorrowRepayExample() throws ApiException, IOException {
        MarginAccountBorrowRepayRequest marginAccountBorrowRepayRequest =
                new MarginAccountBorrowRepayRequest();
        marginAccountBorrowRepayRequest.asset("USDT");
        marginAccountBorrowRepayRequest.isIsolated(IsIsolated.TRUE);
        marginAccountBorrowRepayRequest.amount("1.0");
        marginAccountBorrowRepayRequest.type(OrderType.ROLL_IN);
        ApiResponse<MarginAccountBorrowRepayResponse> response =
                getApi().marginAccountBorrowRepay(marginAccountBorrowRepayRequest);
        System.out.println(response.getData());
    }
}
