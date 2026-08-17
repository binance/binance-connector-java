

# KlineStreamResponseK

Candlestick payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**TLowerCase** | **Long** | Open time (epoch milliseconds). |  [optional] |
|**ct** | **Long** | Close time (epoch milliseconds). For fixed intervals: &#x60;openTime + duration − 1ms&#x60;. For &#x60;1M&#x60;: last day of month at 23:59:59.999 UTC. |  [optional] |
|**SLowerCase** | **String** | Symbol (UPPERCASE ticker). |  [optional] |
|**ILowerCase** | **String** | Interval — &#x60;\&quot;5m\&quot;&#x60; / &#x60;\&quot;1h\&quot;&#x60; / &#x60;\&quot;1d\&quot;&#x60; / &#x60;\&quot;1w\&quot;&#x60; / &#x60;\&quot;1M\&quot;&#x60;. |  [optional] |
|**OLowerCase** | **String** | Open price. |  [optional] |
|**CLowerCase** | **String** | Close price (latest print within the interval). |  [optional] |
|**HLowerCase** | **String** | High price. |  [optional] |
|**LLowerCase** | **String** | Low price. |  [optional] |
|**VLowerCase** | **String** | Volume (shares), default &#x60;\&quot;0\&quot;&#x60;. |  [optional] |
|**NLowerCase** | **Integer** | Trade count; absent when upstream did not populate. |  [optional] |
|**XLowerCase** | **Boolean** | Candle is closed — &#x60;true&#x60; once the interval has ended. |  [optional] |
|**vw** | **String** | VWAP (volume-weighted average price); absent when upstream did not populate. |  [optional] |



