

# PriceStreamResponseRatesInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**SLowerCase** | **String** | Symbol (UPPERCASE ticker), e.g. &#x60;\&quot;AAPL\&quot;&#x60;. |  [optional] |
|**ac** | **String** | Internal asset code, &#x60;EQ_{symbol}&#x60;. Reference only; do not use as a trading identifier. |  [optional] |
|**PLowerCase** | **String** | Latest price, trailing-zero stripped. |  [optional] |
|**TLowerCase** | **Long** | Price time (epoch milliseconds UTC); may be null. |  [optional] |
|**pc** | **String** | Previous day&#39;s RTH close price (reference); absent when unknown. |  [optional] |
|**tc** | **String** | Today&#39;s RTH close price; absent before After-Hours. |  [optional] |
|**mp** | **String** | Per-symbol market phase: &#x60;C&#x60; Closed, &#x60;ON&#x60; Overnight, &#x60;PRE&#x60; Pre-Market, &#x60;O&#x60; Market Open, &#x60;POST&#x60; Post-Market. |  [optional] |



