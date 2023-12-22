package examples.spot.wallet;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class DelegationHistory {
    private DelegationHistory() {
    }

    private static final long startTime = 1695205406000L;
    private static final long endTime = 1695205396000L;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "alice@test.com");
        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().delegationHistory(parameters);
        System.out.println(result);
    }
}
