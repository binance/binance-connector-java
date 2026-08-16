

# VipLoanFixedRateBorrowResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**borrowCoin** | **String** | Echo of input parameter |  [optional] |
|**borrowAmount** | **String** | Actual total borrow amount (aggregated when multiple supplyRequest) |  [optional] |
|**actualReceivedAmount** | **String** | Actual received amount |  [optional] |
|**collateralCoin** | **String** | Echo of input parameter, comma-separated |  [optional] |
|**collateralAccountId** | **String** | Echo of input parameter, comma-separated |  [optional] |
|**borrowInterestRate** | **String** | Actual borrow interest rate (weighted average when multiple) |  [optional] |
|**duration** | **String** | &#x60;{loanTerm}Days&#x60;, e.g. \&quot;30Days\&quot; |  [optional] |
|**autoRepay** | **Boolean** | Echo of input parameter |  [optional] |
|**orderId** | **Long** | Order ID |  [optional] |
|**status** | **String** | &#x60;Succeeds&#x60; / &#x60;Failed&#x60; / &#x60;Processing&#x60; |  [optional] |



