

# NewMarginOrderResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**symbol** | **String** | Trade symbol, if existing. |  [optional] |
|**orderId** | **Long** | Normal orderID after trigger if appliable, only have when the strategy is triggered |  [optional] |
|**clientOrderId** | **String** | Client Order ID. |  [optional] |
|**transactTime** | **Long** | Transact Time. |  [optional] |
|**price** | **String** | Price. |  [optional] |
|**origQty** | **String** | Orig Qty. |  [optional] |
|**executedQty** | **String** | Executed Qty. |  [optional] |
|**cummulativeQuoteQty** | **String** | Cummulative Quote Qty. |  [optional] |
|**status** | **String** | Enum：completed，processing |  [optional] |
|**timeInForce** | **String** | Time In Force. |  [optional] |
|**type** | **String** | Normal order type after trigger if appliable |  [optional] |
|**side** | **String** | Side. |  [optional] |
|**marginBuyBorrowAmount** | **String** | will not return if no margin trade happens |  [optional] |
|**marginBuyBorrowAsset** | **String** | will not return if no margin trade happens |  [optional] |
|**fills** | [**List&lt;NewMarginOrderResponseFillsInner&gt;**](NewMarginOrderResponseFillsInner.md) | Fills. |  [optional] |



