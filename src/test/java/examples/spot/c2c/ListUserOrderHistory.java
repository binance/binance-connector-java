package examples.spot.c2c;

import java.util.LinkedHashMap;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class ListUserOrderHistory {
    private ListUserOrderHistory() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("tradeType", "BUY");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createC2C().listUserOrderHistory(parameters);
        System.out.println(result);
    }
}
