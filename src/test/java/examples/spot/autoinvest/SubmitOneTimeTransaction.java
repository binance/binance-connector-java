package examples.spot.autoinvest;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class SubmitOneTimeTransaction {
    private SubmitOneTimeTransaction() {
    }
    
    private static final double subscriptionAmount = 10.1;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("sourceType", "MAIN_SITE");
        parameters.put("subscriptionAmount", subscriptionAmount);
        parameters.put("sourceAsset", "USDT");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createAutoInvest().submitOneTimeTransaction(parameters);
        System.out.println(result);
    }
}
