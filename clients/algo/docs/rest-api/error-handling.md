# Error Handling

```java
    String symbol = "BNBUSDT";
    try {
        ApiResponse<AccountCommissionResponse> response = getApi().accountCommission(symbol);
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
```28.8
