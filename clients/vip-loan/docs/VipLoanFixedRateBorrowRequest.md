

# VipLoanFixedRateBorrowRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**supplyRequest** | **String** | Supply request string, positional encoding (no key). Multiple entries separated by &#x60;;&#x60;, fields separated by &#x60;:&#x60;, order: &#x60;&lt;requestId&gt;:&lt;interestRate&gt;:&lt;amount&gt;&#x60;. Example: &#x60;1212:0.12:100;3434:0.13:50&#x60; |  |
|**borrowCoin** | **String** | Borrow coin |  |
|**loanTerm** | **Long** | Loan term in days |  |
|**borrowUid** | **Long** | Borrow receiving account UID |  |
|**collateralCoin** | **String** | Collateral coin(s), multiple separated by &#x60;,&#x60;. Only coin names, no amount (VIP loan collateral amount &#x3D; entire spot account balance) |  |
|**collateralAccountId** | **String** | Collateral account ID(s), multiple separated by &#x60;,&#x60; |  |
|**autoRepay** | **Boolean** | Default: &#x60;true&#x60;. &#x60;true&#x60;: auto repay at expiration; &#x60;false&#x60;: auto-convert to flexible (floating rate) at expiration |  [optional] |
|**recvWindow** | **Long** | The value cannot be greater than &#x60;60000&#x60; |  [optional] |



