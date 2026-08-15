

# UserDataStreamEventsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**E** | **Long** | Event Time |  [optional] |
|**aLowerCase** | **String** | Asset |  [optional] |
|**dLowerCase** | **String** | Delta |  [optional] |
|**T** | **Long** | Transaction Time |  [optional] |
|**sLowerCase** | **String** | Symbol |  [optional] |
|**cLowerCase** | **String** | Contingency Type |  [optional] |
|**S** | **String** | Side |  [optional] |
|**oLowerCase** | **String** | Order type |  [optional] |
|**fLowerCase** | **String** | Time in force |  [optional] |
|**qLowerCase** | **String** | Order quantity |  [optional] |
|**pLowerCase** | **String** | Order price |  [optional] |
|**P** | **String** | Stop price |  [optional] |
|**F** | **String** | Iceberg quantity |  [optional] |
|**gLowerCase** | **Long** | OrderListId |  [optional] |
|**C** | **String** | List Client Order ID |  [optional] |
|**xLowerCase** | **String** | Current execution type |  [optional] |
|**X** | **String** | Current order status |  [optional] |
|**rLowerCase** | **String** | List Reject Reason |  [optional] |
|**iLowerCase** | **Long** | Order ID |  [optional] |
|**lLowerCase** | **String** | List Status Type |  [optional] |
|**zLowerCase** | **String** | Cumulative filled quantity |  [optional] |
|**L** | **String** | List Order Status |  [optional] |
|**nLowerCase** | **String** | Commission amount |  [optional] |
|**N** | **String** | Commission asset |  [optional] |
|**tLowerCase** | **Long** | Trade ID |  [optional] |
|**vLowerCase** | **Long** | Prevented Match Id; This is only visible if the order expired due to STP |  [optional] |
|**I** | **Long** | Execution Id |  [optional] |
|**wLowerCase** | **Boolean** | Is the order on the book? |  [optional] |
|**mLowerCase** | **Boolean** | Is this trade the maker side? |  [optional] |
|**M** | **Boolean** | Ignore |  [optional] |
|**O** | [**List&lt;ListStatusOInner&gt;**](ListStatusOInner.md) | An array of objects |  [optional] |
|**Z** | **String** | Cumulative quote asset transacted quantity |  [optional] |
|**Y** | **String** | Last quote asset transacted quantity (i.e. lastPrice * lastQty) |  [optional] |
|**Q** | **String** | Quote Order Quantity |  [optional] |
|**W** | **Long** | Working Time; This is only visible if the order has been placed on the book. |  [optional] |
|**V** | **String** | SelfTradePreventionMode |  [optional] |
|**D** | **Long** | Trailing Time |  [optional] |
|**jLowerCase** | **Long** | Strategy Id |  [optional] |
|**J** | **Long** | Strategy Type |  [optional] |
|**A** | **String** | Prevented Quantity |  [optional] |
|**B** | [**List&lt;OutboundAccountPositionBInner&gt;**](OutboundAccountPositionBInner.md) | Balances Array |  [optional] |
|**uLowerCase** | **Long** | Time of last account update |  [optional] |
|**U** | **Long** | Counter Order Id |  [optional] |
|**cs** | **String** | Counter Symbol |  [optional] |
|**pl** | **String** | Prevented Execution Quantity |  [optional] |
|**pL** | **String** | Prevented Execution Price |  [optional] |
|**pY** | **String** | Prevented Execution Quote Qty |  [optional] |
|**bLowerCase** | **String** | Match Type |  [optional] |
|**kLowerCase** | **String** | Working Floor |  [optional] |
|**uS** | **Boolean** | UsedSor |  [optional] |
|**gP** | **String** | Pegged Price Type |  [optional] |
|**gOT** | **String** | Pegged Offset Type |  [optional] |
|**gOV** | **Long** | Pegged Offset Value |  [optional] |
|**gp** | **String** | Pegged Price |  [optional] |
|**eR** | **String** | Expiry Reason. Appears when the order has expired. |  [optional] |



