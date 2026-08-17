

# TradingStatusStreamResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ELowerCase** | **String** | Event type, always &#x60;\&quot;tradingStatus\&quot;&#x60;. |  [optional] |
|**symbol** | **String** | Symbol (UPPERCASE ticker), e.g. &#x60;\&quot;AAPL\&quot;&#x60;. |  [optional] |
|**assetCode** | **String** | Internal asset code &#x60;EQ_{symbol}&#x60;; reference only. |  [optional] |
|**status** | **String** | Trading status. |  [optional] |
|**msg** | **String** | Reason code. |  [optional] |
|**time** | **Long** | Status-effective time (epoch milliseconds UTC). May be in the future. |  [optional] |
|**ZLowerCase** | **String** | Tape designation: &#x60;C&#x60; &#x3D; CTA (NYSE / AMEX), &#x60;N&#x60; &#x3D; UTP (Nasdaq). |  [optional] |
|**tradability** | **String** | Tradability after the status change: &#x60;BUY_SELL&#x60; / &#x60;BUY&#x60; / &#x60;SELL&#x60; / &#x60;NONE&#x60;. |  [optional] |



