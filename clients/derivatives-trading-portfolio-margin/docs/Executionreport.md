

# ExecutionReport


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**E** | **Long** | Event time |  [optional] |
|**sLowerCase** | **String** | Symbol |  [optional] |
|**cLowerCase** | **String** | Client order ID |  [optional] |
|**S** | **String** | Side |  [optional] |
|**oLowerCase** | **String** | Order type |  [optional] |
|**fLowerCase** | **String** | Time in force |  [optional] |
|**qLowerCase** | **String** | Order quantity |  [optional] |
|**pLowerCase** | **String** | Order price |  [optional] |
|**P** | **String** | Stop price |  [optional] |
|**dLowerCase** | **Long** | Trailing Delta; This is only visible if the order was a trailing stop order. |  [optional] |
|**F** | **String** | Iceberg quantity; Will not be visible if not iceberg order |  [optional] |
|**gLowerCase** | **Long** | OrderListId |  [optional] |
|**C** | **String** | Original client order ID; Only visible on cancellation of order, the ID of the order being canceled. |  [optional] |
|**xLowerCase** | **String** | Current execution type |  [optional] |
|**X** | **String** | Current order status |  [optional] |
|**rLowerCase** | **String** | Order reject reason; Only visible if there is a rejection, will be an error code. |  [optional] |
|**iLowerCase** | **Long** | Order ID |  [optional] |
|**lLowerCase** | **String** | Last executed quantity |  [optional] |
|**zLowerCase** | **String** | Cumulative filled quantity |  [optional] |
|**L** | **String** | Last executed price |  [optional] |
|**nLowerCase** | **String** | Commission amount |  [optional] |
|**N** | **String** | Commission asset; Only visible when there is a commission amount. |  [optional] |
|**T** | **Long** | Transaction time |  [optional] |
|**tLowerCase** | **Long** | Trade ID |  [optional] |
|**vLowerCase** | **Long** | Prevented Match Id; This is only visible if the order expire due to STP trigger. |  [optional] |
|**I** | **Long** | updateId |  [optional] |
|**wLowerCase** | **Boolean** | Is the order on the book? |  [optional] |
|**mLowerCase** | **Boolean** | Is this trade the maker side? |  [optional] |
|**O** | **Long** | Order creation time |  [optional] |
|**Z** | **String** | Cumulative quote asset transacted quantity |  [optional] |
|**Y** | **String** | Last quote asset transacted quantity (i.e. lastPrice * lastQty) |  [optional] |
|**Q** | **String** | Quote Order Quantity; This is only visible if indicated in the order |  [optional] |
|**D** | **Long** | Trailing Time; This is only visible if the trailing stop order has been activated. |  [optional] |
|**jLowerCase** | **Long** | Strategy ID; This is only visible if the strategyId parameter was provided upon order placement |  [optional] |
|**J** | **Long** | Strategy Type; This is only visible if the strategyType parameter was provided upon order placement |  [optional] |
|**W** | **Long** | Working Time; This is only visible if the order has been placed on the book. |  [optional] |
|**V** | **String** | selfTradePreventionMode |  [optional] |
|**uLowerCase** | **Long** | TradeGroupId; This is only visible if the account is part of a trade group and the order expired due to STP trigger. |  [optional] |
|**U** | **Long** | CounterOrderId; This is only visible if the order expired due to STP trigger. |  [optional] |
|**A** | **String** | Prevented Quantity; This is only visible if the order expired due to STP trigger. |  [optional] |
|**B** | **String** | Last Prevented Quantity; This is only visible if the order expired due to STP trigger. |  [optional] |
|**cs** | **String** | Counter Symbol; This is only visible if the order expired due to STP trigger. |  [optional] |
|**pl** | **String** | Prevented Execution Quantity; This is only visible if the order expired due to STP trigger. |  [optional] |
|**pL** | **String** | Prevented Execution Price; This is only visible if the order expired due to STP trigger. |  [optional] |
|**pY** | **String** | Prevented Execution Quote Qty; This is only visible if the order expired due to STP trigger. |  [optional] |
|**eR** | **String** | Expiry Reason; This is only visible if the order has expired. |  [optional] |



