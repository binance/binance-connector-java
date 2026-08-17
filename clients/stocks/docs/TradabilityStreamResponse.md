

# TradabilityStreamResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ELowerCase** | **String** | Event type, always &#x60;\&quot;tradability\&quot;&#x60;. |  [optional] |
|**symbol** | **String** | Symbol (UPPERCASE ticker). |  [optional] |
|**assetCode** | **String** | Internal asset code &#x60;EQ_{symbol}&#x60;; reference only. May be null for symbols not yet in the symbol dictionary. |  [optional] |
|**tradability** | **String** | The new tradability value. &#x60;OFFMARKET&#x60; and &#x60;DELISTING&#x60; are protected states — trading-status events will not transition a symbol out of them. |  [optional] |
|**TLowerCase** | **Long** | Push time (epoch milliseconds UTC). |  [optional] |



