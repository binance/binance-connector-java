package examples.spot.mining;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class HashrateResaleRequest {
    private HashrateResaleRequest() {
    }
    private static final long startDate = 1607659086000L;
    private static final long endDate = 1617659086000L;
    private static final long hashRate = 100000000L;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("userName", "test");
        parameters.put("algo", "sha256");
        parameters.put("endDate", endDate);
        parameters.put("startDate", startDate);
        parameters.put("toPoolUser", "S19pro");
        parameters.put("hashRate", hashRate);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMining().hashrateResaleRequest(parameters);
        System.out.println(result);
    }
}
