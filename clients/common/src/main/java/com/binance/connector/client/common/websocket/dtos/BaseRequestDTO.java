package com.binance.connector.client.common.websocket.dtos;

public class BaseRequestDTO {
    // For request
    private String apiKey;
    private String timestamp;
    private String signature;

    public BaseRequestDTO() {}

    public BaseRequestDTO(String apiKey, String timestamp, String signature) {
        this.apiKey = apiKey;
        this.timestamp = timestamp;
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String toUrlQueryString() {
        return "timestamp=" + getTimestamp();
    }

    @Override
    public String toString() {
        return "apiKey=" + apiKey + "&timestamp=" + timestamp;
    }

    private BaseRequestDTO(Builder builder) {
        apiKey = builder.apiKey;
        timestamp = builder.timestamp;
        signature = builder.signature;
    }

    public static final class Builder {
        private String apiKey;
        private String timestamp;
        private String signature;

        public Builder() {}

        public Builder apiKey(String val) {
            apiKey = val;
            return this;
        }

        public Builder timestamp(String val) {
            timestamp = val;
            return this;
        }

        public Builder signature(String val) {
            signature = val;
            return this;
        }

        public BaseRequestDTO build() {
            return new BaseRequestDTO(this);
        }
    }
}
