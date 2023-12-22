package examples.spot.autoinvest;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class UserIndexPlans {
    private UserIndexPlans() {
    }
    
    private static final long indexId = 1234;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("indexId", indexId);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createAutoInvest().userIndexPlans(parameters);
        System.out.println(result);
    }
}
