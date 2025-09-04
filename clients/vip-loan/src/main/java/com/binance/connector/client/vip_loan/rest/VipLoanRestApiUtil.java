package com.binance.connector.client.vip_loan.rest;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.configuration.ClientConfiguration;

public class VipLoanRestApiUtil {
    private static final String BASE_URL = "https://api.binance.com";
    private static final boolean HAS_TIME_UNIT = false;

    public static ClientConfiguration getClientConfiguration() {
        ClientConfiguration clientConfiguration = new ClientConfiguration();
        if (!HAS_TIME_UNIT) {
            clientConfiguration.setTimeUnit(null);
        }
        clientConfiguration.setUrl(BASE_URL);
        return clientConfiguration;
    }

    public static ApiClient getDefaultClient(ClientConfiguration configuration) {
        ApiClient apiClient = new ApiClient(configuration);
        apiClient.setJson(JSON.getGson());

        return apiClient;
    }
}
