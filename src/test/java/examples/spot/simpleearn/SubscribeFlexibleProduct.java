package examples.spot.simpleearn;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class SubscribeFlexibleProduct {
    private SubscribeFlexibleProduct() {
    }
    
    private static final double amount = 1.1;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("productId", "40607");
        parameters.put("amount", amount);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSimpleEarn().subscribeFlexibleProduct(parameters);
        System.out.println(result);
    }
}
