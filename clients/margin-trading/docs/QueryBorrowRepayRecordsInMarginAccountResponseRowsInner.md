

# QueryBorrowRepayRecordsInMarginAccountResponseRowsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | AUTO,MANUAL for Cross Margin Borrow; MANUAL，AUTO，BNB_AUTO_REPAY，POINT_AUTO_REPAY for Cross Margin Repay; AUTO，MANUAL for Isolated Margin Borrow/Repay; |  [optional] |
|**isolatedSymbol** | **String** | isolated symbol, will not be returned for crossed margin |  [optional] |
|**amount** | **String** | Total amount borrowed/repaid |  [optional] |
|**asset** | **String** | asset. |  [optional] |
|**interest** | **String** | Interest repaid |  [optional] |
|**principal** | **String** | Principal repaid |  [optional] |
|**status** | **String** | one of PENDING (pending execution), CONFIRMED (successfully execution), FAILED (execution failed, nothing happened to your account); |  [optional] |
|**timestamp** | **Long** | timestamp. |  [optional] |
|**txId** | **Long** | tx Id. |  [optional] |



