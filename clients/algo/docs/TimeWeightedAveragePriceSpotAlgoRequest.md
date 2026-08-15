

# TimeWeightedAveragePriceSpotAlgoRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Trading symbol eg. BTCUSDT |  |
|**side** | **Side** |  |  |
|**quantity** | **Double** | Quantity of base asset; Maximum notional per order is 200k, 2mm or 10mm, depending on symbol. Please reduce your size if you order is above the maximum notional per order. |  |
|**duration** | **Long** | Duration for TWAP orders in seconds |  |
|**clientAlgoId** | **String** | A unique id among Algo orders (length should be 32 characters)， If it is not sent, we will give default value |  [optional] |
|**limitPrice** | **Double** | Limit price of the order; If it is not sent, will place order by market price by default |  [optional] |



