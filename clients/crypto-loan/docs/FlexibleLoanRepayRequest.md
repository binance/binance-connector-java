

# FlexibleLoanRepayRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**loanCoin** | **String** |  |  |
|**collateralCoin** | **String** |  |  |
|**repayAmount** | **Double** |  |  |
|**collateralReturn** | **Boolean** | TRUE: Return extra collateral to spot account; FALSE: Keep extra collateral in the order and lower LTV. |  [optional] |
|**fullRepayment** | **Boolean** | TRUE: Full repayment; FALSE: Partial repayment based on loan amount |  [optional] |
|**repaymentType** | **RepaymentType** |  |  [optional] |
|**recvWindow** | **Long** | Request validity window in milliseconds |  [optional] |



