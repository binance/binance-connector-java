

# VipLoanBorrowRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**loanAccountId** | **Long** |  |  |
|**loanCoin** | **String** |  |  |
|**loanAmount** | **Double** |  |  |
|**collateralAccountId** | **String** | Collateral account ID(s). Multiple split by &#x60;,&#x60; |  |
|**collateralCoin** | **String** |  |  |
|**isFlexibleRate** | **Boolean** | TRUE: flexible rate; FALSE: fixed rate |  |
|**loanTerm** | **Long** | Mandatory for fixed rate. Optional for flexible rate. e.g. 30/60 days |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |



