package examples.spot.savings;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class RedeemFlexibleProduct {
    private RedeemFlexibleProduct() {
    }
    private static final double amount = 0.01;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("productId", "TKO001");
        parameters.put("amount", amount);
        parameters.put("type", "FAST");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSavings().redeemFlexibleProduct(parameters);
        System.out.println(result);
    }
}
