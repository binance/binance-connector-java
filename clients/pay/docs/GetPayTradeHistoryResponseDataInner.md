

# GetPayTradeHistoryResponseDataInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderType** | **String** | Order type. Enum: PAY, PAY_REFUND, C2C, CRYPTO_BOX, CRYPTO_BOX_RF, C2C_HOLDING, C2C_HOLDING_RF, PAYOUT, REMITTANCE. |  [optional] |
|**transactionId** | **String** | Transaction ID. |  [optional] |
|**transactionTime** | **Long** | Trade timestamp. |  [optional] |
|**amount** | **String** | Order amount (up to 8 decimal places). Positive means income; negative means expenditure. |  [optional] |
|**currency** | **String** | Order asset. |  [optional] |
|**walletType** | **Long** | Main wallet type: 1&#x3D;funding wallet, 2&#x3D;spot wallet, 3&#x3D;fiat wallet, 4 or 6&#x3D;card payment, 5&#x3D;earn wallet. |  [optional] |
|**walletTypes** | **List&lt;Long&gt;** | Array format of wallet types. Multiple values may appear for combined payments. |  [optional] |
|**fundsDetail** | [**List&lt;GetPayTradeHistoryResponseDataInnerFundsDetailInner&gt;**](GetPayTradeHistoryResponseDataInnerFundsDetailInner.md) | Funds usage details. |  [optional] |
|**payerInfo** | [**GetPayTradeHistoryResponseDataInnerPayerInfo**](GetPayTradeHistoryResponseDataInnerPayerInfo.md) |  |  [optional] |
|**receiverInfo** | [**GetPayTradeHistoryResponseDataInnerReceiverInfo**](GetPayTradeHistoryResponseDataInnerReceiverInfo.md) |  |  [optional] |



