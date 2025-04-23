package com.binance.connector.client.common.websocket.dtos;

import java.lang.reflect.Type;

public class ApiRequestWrapperDTO<T extends BaseRequestDTO, U> extends RequestWrapperDTO<T, U> {
    private transient boolean signed = true;
    private transient boolean apiKeyOnly = false;

    public boolean isApiKeyOnly() {
        return apiKeyOnly;
    }

    public boolean isSigned() {
        return signed;
    }

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    public ApiRequestWrapperDTO(String id, T params, String method, boolean signed) {
        super(id, params, method);
        this.signed = signed;
    }

    public T getParams() {
        return params;
    }

    private ApiRequestWrapperDTO(Builder<T, U> builder) {
        id = builder.id;
        params = builder.params;
        method = builder.method;
        responseType = builder.responseType;
        signed = builder.signed;
        apiKeyOnly = builder.apiKeyOnly;
    }

    public static final class Builder<T extends BaseRequestDTO, U> {
        private String id;
        private T params;
        private String method;
        private Type responseType;
        private boolean signed = true;
        private boolean apiKeyOnly = false;

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

        public Builder<T, U> signed(Boolean val) {
            signed = val;
            return this;
        }

        public Builder<T, U> apiKeyOnly(Boolean val) {
            apiKeyOnly = val;
            return this;
        }

        public ApiRequestWrapperDTO<T, U> build() {
            return new ApiRequestWrapperDTO<>(this);
        }
    }
}
