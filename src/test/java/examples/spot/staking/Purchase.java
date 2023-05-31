package examples.spot.staking;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class Purchase {
    private Purchase() {
    }
    private static final double amount = 0.01;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("product", "STAKING");
        parameters.put("productId", "Bnb*21*WL");
        parameters.put("amount", amount);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createStaking().purchase(parameters);
        System.out.println(result);
    }
}
