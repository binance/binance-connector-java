

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
|**sp** | **String** | Stop Price. Please ignore with TRAILING_STOP_MARKET order |  [optional] |
|**xLowerCase** | **String** | Execution Type |  [optional] |
|**X** | **String** | Order Status |  [optional] |
|**iLowerCase** | **Long** | Order Id |  [optional] |
|**M** | **String** | modifyId, only pushed for AMENDMENT (order modification) events when a modifyId was provided in the request |  [optional] |
|**lLowerCase** | **String** | Order Last Filled Quantity |  [optional] |
|**zLowerCase** | **String** | Order Filled Accumulated Quantity |  [optional] |
|**L** | **String** | Last Filled Price |  [optional] |
|**ma** | **String** | Margin Asset |  [optional] |
|**N** | **String** | Commission Asset |  [optional] |
|**nLowerCase** | **String** | Commission |  [optional] |
|**T** | **Long** | Order Trade Time |  [optional] |
|**tLowerCase** | **Long** | Trade Id |  [optional] |
|**rp** | **String** | Realized Profit of the trade |  [optional] |
|**bLowerCase** | **String** | Bid quantity of base asset |  [optional] |
|**aLowerCase** | **String** | Ask quantity of base asset |  [optional] |
|**mLowerCase** | **Boolean** | Is this trade the maker side? |  [optional] |
|**R** | **Boolean** | Is this reduce only |  [optional] |
|**wt** | **String** | Stop Price Working Type |  [optional] |
|**ot** | **String** | Original Order Type |  [optional] |
|**ps** | **String** | Position Side |  [optional] |
|**cp** | **Boolean** | If Close-All, pushed with conditional order |  [optional] |
|**AP** | **String** | Activation Price, only pushed with TRAILING_STOP_MARKET order |  [optional] |
|**cr** | **String** | Callback Rate, only pushed with TRAILING_STOP_MARKET order |  [optional] |
|**pP** | **Boolean** | If conditional order trigger is protected |  [optional] |
|**V** | **String** | STP mode |  [optional] |
|**pm** | **String** | Price match mode |  [optional] |
|**er** | **String** | Expiry Reason |  [optional] |



