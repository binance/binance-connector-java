package examples.spot.autoinvest;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class OneTimeTransactionStatus {
    private OneTimeTransactionStatus() {
    }
    
    private static final long transactionId = 12345;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("transactionId", transactionId);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createAutoInvest().oneTimeTransactionStatus(parameters);
        System.out.println(result);
    }
}
