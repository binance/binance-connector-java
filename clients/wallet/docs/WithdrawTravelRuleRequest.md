

# WithdrawTravelRuleRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**coin** | **String** |  |  |
|**withdrawOrderId** | **String** | withdrawID defined by the client (i.e. client&#39;s internal withdrawID) |  [optional] |
|**network** | **String** | Withdrawal network |  [optional] |
|**address** | **String** | Withdrawal address |  |
|**addressTag** | **String** | Secondary address identifier for coins like XRP,XMR etc. |  [optional] |
|**amount** | **Double** | Amount |  |
|**transactionFeeFlag** | **Boolean** | When making internal transfer, &#x60;true&#x60; for returning the fee to the destination account; &#x60;false&#x60; for returning the fee back to the departure account. Default &#x60;false&#x60;. |  [optional] |
|**name** | **String** |  |  [optional] |
|**walletType** | **Long** | The wallet type for withdraw，0-spot wallet ，1-funding wallet. Default walletType is the current \&quot;selected wallet\&quot; under wallet-&gt;Fiat and Spot/Funding-&gt;Deposit |  [optional] |
|**recvWindow** | **Long** |  |  [optional] |
|**questionnaire** | **String** | JSON format questionnaire answers. |  |



