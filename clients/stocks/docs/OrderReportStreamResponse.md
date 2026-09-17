

# OrderReportStreamResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ELowerCase** | **String** | Event type, always &#x60;\&quot;orderReport\&quot;&#x60;. |  [optional] |
|**E** | **Long** | Event time (epoch milliseconds); server push time. |  [optional] |
|**XLowerCase** | **String** | Execution type: &#x60;\&quot;ORDER_UPDATE\&quot;&#x60; (still open) or &#x60;\&quot;ORDER_TERMINAL\&quot;&#x60; (reached terminal state). |  [optional] |
|**ILowerCase** | **String** | Order ID (UUID). |  [optional] |
|**ai** | **String** | Asset ID (internal identifier). |  [optional] |
|**BLowerCase** | **String** | Base asset — the internal asset code with an &#x60;EQ_&#x60; prefix (e.g. &#x60;\&quot;EQ_AAPL\&quot;&#x60;), not the bare ticker used in REST responses / order input. Strip the &#x60;EQ_&#x60; prefix to match a symbol used elsewhere. |  [optional] |
|**QLowerCase** | **String** | Quote currency, e.g. &#x60;\&quot;USD\&quot;&#x60;. |  [optional] |
|**S** | **String** | Order side: &#x60;\&quot;buy\&quot;&#x60; or &#x60;\&quot;sell\&quot;&#x60;. Note: lowercase, unlike REST responses. |  [optional] |
|**OLowerCase** | **String** | Order type: &#x60;\&quot;market\&quot;&#x60; / &#x60;\&quot;limit\&quot;&#x60; / &#x60;\&quot;stop\&quot;&#x60; / &#x60;\&quot;stop_limit\&quot;&#x60; / &#x60;\&quot;trailing_stop\&quot;&#x60;. Note: lowercase. |  [optional] |
|**PLowerCase** | **BigDecimal** | Limit price; null for market orders. |  [optional] |
|**Q** | **BigDecimal** | Order quantity (shares); &#x60;0&#x60; when the order was submitted as notional. |  [optional] |
|**N** | **BigDecimal** | Order notional; set when the order was submitted as notional (market buy), null when submitted as quantity. |  [optional] |
|**fq** | **BigDecimal** | Filled quantity. |  [optional] |
|**FN** | **BigDecimal** | Filled notional (&#x3D; filledQty × filledAvgPrice). |  [optional] |
|**tc** | **BigDecimal** | Total cost — cumulative buy-in cost including the commission fee. |  [optional] |
|**Z** | **BigDecimal** | Fill progress percentage (0–100, 2 dp). By notional: &#x60;FN / N × 100&#x60;. By qty: &#x60;fq / Q × 100&#x60;. |  [optional] |
|**NLowerCase** | **String** | Trading session label, e.g. &#x60;\&quot;Regular\&quot;&#x60;, &#x60;\&quot;24 Hours Trading\&quot;&#x60;. |  [optional] |
|**SLowerCase** | **String** | Order status, e.g. &#x60;\&quot;accepted\&quot;&#x60;, &#x60;\&quot;partially_filled\&quot;&#x60;, &#x60;\&quot;filled\&quot;&#x60;, &#x60;\&quot;canceled\&quot;&#x60;. Note: lowercase, unlike REST responses. |  [optional] |
|**T** | **Long** | Order create time (epoch milliseconds). |  [optional] |
|**U** | **Long** | Order update time (epoch milliseconds). |  [optional] |



