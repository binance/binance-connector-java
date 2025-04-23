package com.binance.connector.client.common.websocket.dtos;

import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

public class RequestWrapperDTO<T, U> {
    protected String id;
    protected T params;
    protected String method;
    protected transient Type responseType;
    protected transient CompletableFuture<U> responseCallback = new CompletableFuture<>();

    public RequestWrapperDTO() {}

    public RequestWrapperDTO(String id, T params, String method) {
        this.id = id;
        this.params = params;
        this.method = method;
    }

    public String getId() {
        return id;
    }

    public T getParams() {
        return params;
    }

    public String getMethod() {
        return method;
    }

    public Type getResponseType() {
        return responseType;
    }

    public void setResponseType(Type responseType) {
        this.responseType = responseType;
    }

    private RequestWrapperDTO(Builder<T, U> builder) {
        id = builder.id;
        params = builder.params;
        method = builder.method;
        responseType = builder.responseType;
    }

    public CompletableFuture<U> getResponseCallback() {
        return responseCallback;
    }

    public static final class Builder<T, U> {
        private String id;
        private T params;
        private String method;
        private Type responseType;

        public Builder() {}

        public Builder<T, U> id(String val) {
            id = val;
            return this;
        }

        public Builder<T, U> params(T val) {
            params = val;
            return this;
        }

        public Builder<T, U> method(String val) {
            method = val;
            return this;
        }

        public Builder<T, U> responseType(Type val) {
            responseType = val;
            return this;
        }

        public RequestWrapperDTO<T, U> build() {
            return new RequestWrapperDTO<>(this);
        }
    }
}
