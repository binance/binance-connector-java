package examples.spot.futures;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class FuturesTransfer {
    private FuturesTransfer() {
    }
    private static final double amount = 0.01;
    private static final int type = 2;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);
        parameters.put("type", type);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createFutures().futuresTransfer(parameters);
        System.out.println(result);
    }
}
