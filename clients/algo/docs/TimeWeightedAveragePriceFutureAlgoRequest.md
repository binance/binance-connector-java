

# TimeWeightedAveragePriceFutureAlgoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Trading symbol eg. BTCUSDT |  |
|**side** | **Side** |  |  |
|**positionSide** | **PositionSide** |  |  [optional] |
|**quantity** | **Double** | Quantity of base asset; The notional (&#x60;quantity&#x60; * &#x60;mark price(base asset)&#x60;) must be more than the equivalent of 1,000 USDT, and the maximum notional varies by symbol: up to 50,000,000 USDT for BTCUSDT perpetual, up to 25,000,000 USDT for ETHUSDT perpetual, and up to 5,000,000 USDT for other symbols |  |
|**duration** | **Long** | Duration for TWAP orders in seconds |  |
|**clientAlgoId** | **String** | A unique id among Algo orders (length should be 32 characters)， If it is not sent, we will give default value |  [optional] |
|**reduceOnly** | **Boolean** | \&quot;true\&quot; or \&quot;false\&quot;. Default \&quot;false\&quot;; Cannot be sent in Hedge Mode; Cannot be sent when you open a position |  [optional] |
|**limitPrice** | **Double** | Limit price of the order; If it is not sent, will place order by market price by default |  [optional] |
|**recvWindow** | **Long** | Request validity window in milliseconds |  [optional] |



