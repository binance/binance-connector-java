

# TokenizedConvertHistoryResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**rows** | [**List&lt;TokenizedConvertHistoryResponseRowsInner&gt;**](TokenizedConvertHistoryResponseRowsInner.md) | Convert history rows on this page. Empty array if nothing matches. |  [optional] |
|**hasMore** | **Boolean** | &#x60;true&#x60; when more pages exist — pass &#x60;nextLastId&#x60; as &#x60;lastId&#x60; on the next request. |  [optional] |
|**nextLastId** | **Long** | Pass this value as &#x60;lastId&#x60; on the next request to get the following page. |  [optional] |



