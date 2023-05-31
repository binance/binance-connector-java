package examples.spot.convert;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class TradeFlow {
    private TradeFlow() {
    }
    private static final long startTime = 1234567L;
    private static final long endTime = 12345678L;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createConvert().tradeFlow(parameters);
        System.out.println(result);
    }
}
