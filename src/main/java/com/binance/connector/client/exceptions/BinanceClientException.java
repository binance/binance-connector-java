package com.binance.connector.client.exceptions;

public class BinanceClientException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final int ERROR_CODE_0 = 0;
    private final int httpStatusCode;
    private final int errorCode;
    private String errMsg;
    private int retryAfter;

    public BinanceClientException(String fullErrMsg, int httpStatusCode) {
        super(fullErrMsg);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = ERROR_CODE_0;
    }

    public BinanceClientException(String fullErrMsg, String errMsg, int httpStatusCode, int errorCode) {
        super(fullErrMsg);
        this.httpStatusCode = httpStatusCode;
        this.errorCode = errorCode;
        this.errMsg =  errMsg;
    }
    
    public BinanceClientException(String fullErrMsg, String errMsg, int httpStatusCode, int errorCode, int retryAfter) {
        this(fullErrMsg, errMsg, httpStatusCode, errorCode);
        this.retryAfter = retryAfter;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
    
    public int getRetryAfter() {
    	return retryAfter;
    }
}
