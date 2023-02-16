package examples.spot.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class Repay {
    private Repay() {
    }
    private static final double amount = 1;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().repay(parameters);
        System.out.println(result);
    }
}
