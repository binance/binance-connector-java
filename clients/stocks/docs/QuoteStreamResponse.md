

# QuoteStreamResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ELowerCase** | **String** | Event type, always &#x60;\&quot;quote\&quot;&#x60;. |  [optional] |
|**E** | **Long** | Event time — epoch milliseconds when the server pushed the message. |  [optional] |
|**SLowerCase** | **String** | Symbol (UPPERCASE ticker), e.g. &#x60;\&quot;AAPL\&quot;&#x60;. |  [optional] |
|**bp** | **String** | Best bid price. |  [optional] |
|**ap** | **String** | Best ask price. |  [optional] |
|**bs** | **Integer** | Best bid size (shares). |  [optional] |
|**as** | **Integer** | Best ask size (shares). |  [optional] |
|**T** | **Long** | Source quote timestamp (epoch milliseconds); may be null. |  [optional] |



