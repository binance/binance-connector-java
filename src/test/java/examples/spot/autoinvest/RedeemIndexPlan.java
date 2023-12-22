package examples.spot.autoinvest;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class RedeemIndexPlan {
    private RedeemIndexPlan() {
    }
    
    private static final long indexId = 123456;
    private static final Integer redemptionPercentage = 10;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("indexId", indexId);
        parameters.put("redemptionPercentage", redemptionPercentage);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createAutoInvest().redeemIndexPlan(parameters);
        System.out.println(result);
    }
}
