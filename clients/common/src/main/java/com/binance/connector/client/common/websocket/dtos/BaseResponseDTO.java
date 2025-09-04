package com.binance.connector.client.common.websocket.dtos;

public class BaseResponseDTO<T> {
    protected String id;
    protected Integer status;
    protected T result;
    protected ErrorResponseDTO error;

    public ErrorResponseDTO getError() {
        return error;
    }

    public void setError(ErrorResponseDTO error) {
        this.error = error;
    }

    public BaseResponseDTO() {}

    private BaseResponseDTO(Builder<T> builder) {
        id = builder.id;
        status = builder.status;
        result = builder.result;
        error = builder.error;
    }

    public String getId() {
        return id;
    }

    public Integer getStatus() {
        return status;
    }

    public T getResult() {
        return result;
    }

    public static final class Builder<T> {
        private String id;
        private Integer status;
        private T result;
        private ErrorResponseDTO error;

        public Builder() {}

        public Builder id(String val) {
            id = val;
            return this;
        }

        public Builder status(Integer val) {
            status = val;
            return this;
        }

        public Builder result(T val) {
            result = val;
            return this;
        }

        public Builder error(ErrorResponseDTO val) {
            error = val;
            return this;
        }

        public BaseResponseDTO build() {
            return new BaseResponseDTO(this);
        }
    }
}
