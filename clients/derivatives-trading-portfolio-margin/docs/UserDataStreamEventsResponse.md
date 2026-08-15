

# UserDataStreamEventsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fs** | **String** | Event business unit. &#39;UM&#39; for USDS-M futures and &#39;CM&#39; for COIN-M futures |  [optional] |
|**E** | **Long** | Event Time |  [optional] |
|**T** | **Long** | Transaction Time |  [optional] |
|**ac** | [**AccountConfigUpdateAc**](AccountConfigUpdateAc.md) |  |  [optional] |
|**iLowerCase** | **String** | Account Alias, ignore for UM |  [optional] |
|**aLowerCase** | **String** | Asset |  [optional] |
|**ao** | [**AlgoOrderUpdateAo**](AlgoOrderUpdateAo.md) |  |  [optional] |
|**dLowerCase** | **Long** | Trailing Delta; This is only visible if the order was a trailing stop order. |  [optional] |
|**U** | **Long** | Time updateID |  [optional] |
|**so** | [**ConditionalOrderTradeUpdateSo**](ConditionalOrderTradeUpdateSo.md) |  |  [optional] |
|**sLowerCase** | **String** | Risk level: MARGIN_CALL, REDUCE_ONLY, FORCE_LIQUIDATION |  [optional] |
|**cLowerCase** | **String** | Client order ID |  [optional] |
|**S** | **String** | Side |  [optional] |
|**oLowerCase** | [**OrderTradeUpdateO**](OrderTradeUpdateO.md) |  |  [optional] |
|**fLowerCase** | **String** | Time in force |  [optional] |
|**qLowerCase** | **String** | Order quantity |  [optional] |
|**pLowerCase** | **String** | Principal |  [optional] |
|**P** | **String** | Stop price |  [optional] |
|**F** | **String** | Iceberg quantity; Will not be visible if not iceberg order |  [optional] |
|**gLowerCase** | **Long** | OrderListId |  [optional] |
|**C** | **String** | Original client order ID; Only visible on cancellation of order, the ID of the order being canceled. |  [optional] |
|**xLowerCase** | **String** | Current execution type |  [optional] |
|**X** | **String** | Current order status |  [optional] |
|**rLowerCase** | **String** | Order reject reason; Only visible if there is a rejection, will be an error code. |  [optional] |
|**lLowerCase** | **String** | Total Liability |  [optional] |
|**zLowerCase** | **String** | Cumulative filled quantity |  [optional] |
|**L** | **String** | Last executed price |  [optional] |
|**nLowerCase** | **String** | Commission amount |  [optional] |
|**N** | **String** | Commission asset; Only visible when there is a commission amount. |  [optional] |
|**tLowerCase** | **String** | Type |  [optional] |
|**vLowerCase** | **Long** | Prevented Match Id; This is only visible if the order expire due to STP trigger. |  [optional] |
|**I** | **Long** | updateId |  [optional] |
|**wLowerCase** | **Boolean** | Is the order on the book? |  [optional] |
|**mLowerCase** | **String** | Total maintenance margin in USD value |  [optional] |
|**O** | [**List&lt;OpenOrderLossOInner&gt;**](OpenOrderLossOInner.md) | Update Data |  [optional] |
|**Z** | **String** | Cumulative quote asset transacted quantity |  [optional] |
|**Y** | **String** | Last quote asset transacted quantity (i.e. lastPrice * lastQty) |  [optional] |
|**Q** | **String** | Quote Order Quantity; This is only visible if indicated in the order |  [optional] |
|**D** | **Long** | Trailing Time; This is only visible if the trailing stop order has been activated. |  [optional] |
|**jLowerCase** | **Long** | Strategy ID; This is only visible if the strategyId parameter was provided upon order placement |  [optional] |
|**J** | **Long** | Strategy Type; This is only visible if the strategyType parameter was provided upon order placement |  [optional] |
|**W** | **Long** | Working Time; This is only visible if the order has been placed on the book. |  [optional] |
|**V** | **String** | selfTradePreventionMode |  [optional] |
|**uLowerCase** | **String** | uniMMR level |  [optional] |
|**A** | **String** | Prevented Quantity; This is only visible if the order expired due to STP trigger. |  [optional] |
|**B** | [**List&lt;OutboundAccountPositionBInner&gt;**](OutboundAccountPositionBInner.md) | Balances Array |  [optional] |
|**cs** | **String** | Counter Symbol; This is only visible if the order expired due to STP trigger. |  [optional] |
|**pl** | **String** | Prevented Execution Quantity; This is only visible if the order expired due to STP trigger. |  [optional] |
|**pL** | **String** | Prevented Execution Price; This is only visible if the order expired due to STP trigger. |  [optional] |
|**pY** | **String** | Prevented Execution Quote Qty; This is only visible if the order expired due to STP trigger. |  [optional] |
|**eR** | **String** | Expiry Reason; This is only visible if the order has expired. |  [optional] |
|**eq** | **String** | Account equity in USD value |  [optional] |
|**ae** | **String** | Actual equity without collateral rate in USD value |  [optional] |



