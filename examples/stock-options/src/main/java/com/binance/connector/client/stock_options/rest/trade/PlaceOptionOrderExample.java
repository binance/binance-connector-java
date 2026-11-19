package com.binance.connector.client.stock_options.rest.trade;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.stock_options.rest.StockOptionsRestApiUtil;
import com.binance.connector.client.stock_options.rest.api.StockOptionsRestApi;
import com.binance.connector.client.stock_options.rest.model.PlaceOptionOrderResponse;
import com.binance.connector.client.stock_options.rest.model.PositionIntent;
import com.binance.connector.client.stock_options.rest.model.Side;
import com.binance.connector.client.stock_options.rest.model.TimeInForce;
import com.binance.connector.client.stock_options.rest.model.WalletType;
import java.io.IOException;

/** API examples for TradeApi */
public class PlaceOptionOrderExample {
    private StockOptionsRestApi api;

    public StockOptionsRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    StockOptionsRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StockOptionsRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Place Option Order (TRADE)
     *
     * <p>Place an option limit order. The server calculates the amount to lock based on
     * &#x60;positionIntent&#x60; and the contract type: buy to open locks the premium plus fees;
     * sell to open locks the underlying shares for a covered call, or the strike-equivalent cash
     * for a cash-secured put. Fees are calculated by the server; callers do not pass payment
     * details. **&#x60;positionIntent&#x60;**: may be omitted, in which case it is derived from
     * &#x60;side&#x60;: &#x60;BUY&#x60; → &#x60;BUY_TO_OPEN&#x60;, &#x60;SELL&#x60; →
     * &#x60;SELL_TO_CLOSE&#x60;. The derivation is unreliable in two cases, and an order without
     * &#x60;positionIntent&#x60; is rejected (parameter error): a &#x60;BUY&#x60; while you hold a
     * **short** position in the contract (it may be meant as &#x60;BUY_TO_CLOSE&#x60;), and a
     * &#x60;SELL&#x60; while you hold **no long** position in the contract (it can only be
     * &#x60;SELL_TO_OPEN&#x60;). Therefore always pass it for the short side
     * (&#x60;SELL_TO_OPEN&#x60; / &#x60;BUY_TO_CLOSE&#x60;). When passed, it must match
     * &#x60;side&#x60; (&#x60;BUY_*&#x60; with &#x60;BUY&#x60;, &#x60;SELL_*&#x60; with
     * &#x60;SELL&#x60;), otherwise the order is rejected. Only &#x60;LIMIT&#x60; orders with
     * &#x60;timeInForce &#x3D; DAY&#x60; are supported, and &#x60;quantity&#x60; must be a whole
     * number of contracts. Resubmitting with the **same** &#x60;clientOrderId&#x60; is idempotent:
     * if the original order was accepted or is still processing, the original order is returned
     * (&#x60;S&#x60; / &#x60;P&#x60;); if the original order failed, &#x60;497401&#x60; is
     * returned. If the request returns &#x60;497001&#x60;, &#x60;497301&#x60; or a broker-rejection
     * error code after the order has already been submitted to the broker, the order may still be
     * processing. Retry with the **same** &#x60;clientOrderId&#x60; (a replay then returns
     * &#x60;P&#x60;) or query Option Order Detail by &#x60;clientOrderId&#x60; for the final
     * status. Do not retry with a new &#x60;clientOrderId&#x60;. Rate limit: 200 requests / min
     * (UID). Weight: 1 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void placeOptionOrderExample() throws ApiException, IOException {
        String symbol = "NVDA260930C00100000";
        Side side = Side.BUY;
        String quantity = "1";
        String price = "1.5";
        String quoteAsset = "USDC";
        PositionIntent positionIntent = PositionIntent.BUY_TO_OPEN;
        TimeInForce timeInForce = TimeInForce.DAY;
        WalletType walletType = WalletType.CARD;
        String clientOrderId = "web_2c9c92b74f1e4a7c8f3b9e1a2d3c4b5a";
        Long recvWindow = 5000L;
        ApiResponse<PlaceOptionOrderResponse> response =
                getApi().placeOptionOrder(
                                symbol,
                                side,
                                quantity,
                                price,
                                quoteAsset,
                                positionIntent,
                                timeInForce,
                                walletType,
                                clientOrderId,
                                recvWindow);
        System.out.println(response.getData());
    }
}
