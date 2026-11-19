

# OrderReportV2StreamResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eLowerCase** | **String** | Event type, always &#x60;\&quot;orderReportV2\&quot;&#x60;. |  [optional] |
|**E** | **Long** | Push time (ms). |  [optional] |
|**xLowerCase** | **String** | &#x60;ORDER_UPDATE&#x60;: the order is open (new, accepted by the broker, partially filled, cancel pending, etc.). &#x60;ORDER_TERMINAL&#x60;: the order reached a terminal state and will not be pushed again. |  [optional] |
|**iLowerCase** | **String** | Order ID. REST field &#x60;orderId&#x60;. |  [optional] |
|**ci** | **String** | Client order ID. REST field &#x60;clientOrderId&#x60;. |  [optional] |
|**ai** | **String** | Broker-side asset ID. Not needed by callers. |  [optional] |
|**bLowerCase** | **String** | Internal asset code (e.g. &#x60;EQ_SPCX&#x60;). Not needed by callers; read the underlying from &#x60;u&#x60;. May be &#x60;null&#x60; for expiration-day auto-liquidation orders. |  [optional] |
|**qLowerCase** | **String** | Quote asset; &#x60;USDC&#x60; for options. REST field &#x60;quoteAsset&#x60;. May be &#x60;null&#x60; for expiration-day auto-liquidation orders. |  [optional] |
|**S** | **String** | Side: &#x60;\&quot;buy\&quot;&#x60; / &#x60;\&quot;sell\&quot;&#x60;. Note: lowercase, unlike REST &#x60;side&#x60;. |  [optional] |
|**oLowerCase** | **String** | Order type, lowercase: &#x60;\&quot;limit\&quot;&#x60; for user orders; &#x60;\&quot;market\&quot;&#x60; for expiration-day auto-liquidation orders by the broker. REST &#x60;orderType&#x60; is uppercase. |  [optional] |
|**pLowerCase** | **BigDecimal** | Limit price (premium per share). REST field &#x60;limitPrice&#x60;. May be &#x60;null&#x60; for expiration-day auto-liquidation orders. |  [optional] |
|**Q** | **BigDecimal** | Order quantity (contracts). REST field &#x60;qty&#x60;. |  [optional] |
|**N** | **BigDecimal** | Order notional. Always &#x60;null&#x60; for options. |  [optional] |
|**fq** | **BigDecimal** | Cumulative filled quantity (contracts). REST field &#x60;filledQty&#x60;. |  [optional] |
|**FN** | **BigDecimal** | Cumulative filled amount (USD) &#x3D; average fill price × filled contracts × multiplier. REST field &#x60;filledNotional&#x60;. |  [optional] |
|**tc** | **BigDecimal** | Amount locked from the wallet at placement: premium plus fees for buy to open and buy to close (covered call); for buy to close (cash-secured put), only the shortfall after the collateral is released (usually &#x60;0&#x60;); the collateral for sell to open (shares for a covered call, cash for a cash-secured put); &#x60;0&#x60; for sell to close. REST field &#x60;totalCost&#x60;. May be &#x60;null&#x60; for expiration-day auto-liquidation orders. |  [optional] |
|**Z** | **BigDecimal** | Fill progress percentage (0–100, 2 dp) &#x3D; &#x60;fq&#x60; / &#x60;Q&#x60; × 100. REST field &#x60;filledPercent&#x60;. |  [optional] |
|**nLowerCase** | **String** | Trading session; always &#x60;RTH&#x60; for options. |  [optional] |
|**sLowerCase** | **String** | Order status, lowercase. With &#x60;ORDER_UPDATE&#x60;: &#x60;new&#x60; / &#x60;pending_new&#x60; / &#x60;accepted&#x60; / &#x60;partially_filled&#x60; / &#x60;pending_cancel&#x60; / &#x60;pending_replace&#x60;. With &#x60;ORDER_TERMINAL&#x60;: &#x60;filled&#x60; / &#x60;canceled&#x60; / &#x60;expired&#x60; / &#x60;rejected&#x60; / &#x60;replaced&#x60;. REST field &#x60;status&#x60; is uppercase. |  [optional] |
|**T** | **Long** | Order creation time (ms). REST field &#x60;createdAt&#x60;. |  [optional] |
|**U** | **Long** | Order last update time (ms). REST field &#x60;updatedAt&#x60;. |  [optional] |
|**ac** | **String** | Asset class: &#x60;us_option&#x60; (US stock options) / &#x60;us_equity&#x60; (US stocks). |  [optional] |
|**os** | **String** | OCC contract symbol. REST field &#x60;symbol&#x60;. |  [optional] |
|**uLowerCase** | **String** | Underlying US-equity ticker. REST field &#x60;underlyingSymbol&#x60;. May be &#x60;null&#x60; for expiration-day auto-liquidation orders. |  [optional] |
|**rs** | **String** | OCC root; differs from &#x60;u&#x60; for contracts adjusted by a corporate action. REST field &#x60;rootSymbol&#x60;. |  [optional] |
|**ct** | **String** | &#x60;CALL&#x60; / &#x60;PUT&#x60;. REST field &#x60;contractType&#x60;. May be &#x60;null&#x60; for expiration-day auto-liquidation orders. |  [optional] |
|**sp** | **BigDecimal** | Strike price. REST field &#x60;strikePrice&#x60;. May be &#x60;null&#x60; for expiration-day auto-liquidation orders. |  [optional] |
|**ed** | **Long** | Expiration date as the millisecond timestamp of 12:00 ET on the expiration day, same as REST &#x60;expirationDate&#x60;. May be &#x60;null&#x60; for expiration-day auto-liquidation orders. |  [optional] |
|**mLowerCase** | **BigDecimal** | Contract multiplier. REST field &#x60;multiplier&#x60;. |  [optional] |
|**pi** | **String** | Position intent, lowercase: &#x60;buy_to_open&#x60; / &#x60;sell_to_close&#x60; / &#x60;sell_to_open&#x60; / &#x60;buy_to_close&#x60;. REST field &#x60;positionIntent&#x60; is uppercase. |  [optional] |



