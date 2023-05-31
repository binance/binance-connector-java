package examples.spot.mining;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class CancelHashrateResaleConfig {
    private CancelHashrateResaleConfig() {
    }
    private static final int configId = 123;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("configId", configId);
        parameters.put("userName", "");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMining().cancelHashrateResaleConfig(parameters);
        System.out.println(result);
    }
}
