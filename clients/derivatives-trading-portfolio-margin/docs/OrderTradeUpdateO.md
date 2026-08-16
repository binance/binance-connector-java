

# OrderTradeUpdateO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sLowerCase** | **String** | Symbol |  [optional] |
|**cLowerCase** | **String** | Client Order Id |  [optional] |
|**S** | **String** | Side |  [optional] |
|**oLowerCase** | **String** | Order Type |  [optional] |
|**fLowerCase** | **String** | Time in Force |  [optional] |
|**qLowerCase** | **String** | Original Quantity |  [optional] |
|**pLowerCase** | **String** | Original Price |  [optional] |
|**ap** | **String** | Average Price |  [optional] |
|**sp** | **String** | Ignore |  [optional] |
|**xLowerCase** | **String** | Execution Type |  [optional] |
|**X** | **String** | Order Status |  [optional] |
|**iLowerCase** | **Long** | Order Id |  [optional] |
|**M** | **String** | modifyId, only pushed for AMENDMENT (order modification) events when a modifyId was provided in the request |  [optional] |
|**lLowerCase** | **String** | Order Last Filled Quantity |  [optional] |
|**zLowerCase** | **String** | Order Filled Accumulated Quantity |  [optional] |
|**L** | **String** | Last Filled Price |  [optional] |
|**N** | **String** | Commission Asset, will not push if no commission |  [optional] |
|**nLowerCase** | **String** | Commission, will not push if no commission |  [optional] |
|**T** | **Long** | Order Trade Time |  [optional] |
|**tLowerCase** | **Long** | Trade Id |  [optional] |
|**bLowerCase** | **String** | Bids Notional |  [optional] |
|**aLowerCase** | **String** | Ask Notional |  [optional] |
|**mLowerCase** | **Boolean** | Is this trade the maker side? |  [optional] |
|**R** | **Boolean** | Is this reduce only |  [optional] |
|**ps** | **String** | Position Side |  [optional] |
|**rp** | **String** | Realized Profit of the trade |  [optional] |
|**st** | **String** | Strategy type, only pushed with conditional order triggered |  [optional] |
|**si** | **Long** | StrategyId, only pushed with conditional order triggered |  [optional] |
|**V** | **String** | STP mode |  [optional] |
|**gtd** | **Long** | TIF GTD order auto cancel time |  [optional] |



