# Error Handling

```java
    try {
        ApiResponse<AccountCommissionResponse> response = getApi().listPredictionCategories();
        System.out.println(response.getData());
    } catch (ApiException exception) {
        // get http code
        int httpCode = exception.getCode();
        // get error message
        String message = exception.getMessage();
        // headers are in lowercase
        List<String> retryafter = exception.getResponseHeaders().get("retry-after");
        System.out.println(retryafter);
    }
```