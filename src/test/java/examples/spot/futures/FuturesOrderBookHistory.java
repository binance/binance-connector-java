package examples.spot.futures;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class FuturesOrderBookHistory {
    private FuturesOrderBookHistory() {
    }
    private static final Long startTime = 17024585109000L;
    private static final Long endTime = 1702458517000L;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BTCUSDT");
        parameters.put("dataType", "T_DEPTH");
        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createFutures().futuresOrderBookHistory(parameters);
        System.out.println(result);
    }
}