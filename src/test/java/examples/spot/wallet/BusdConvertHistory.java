package examples.spot.wallet;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class BusdConvertHistory {
    private BusdConvertHistory() {
    }


    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        final Long startTime = 118263400000L;
        final Long endTime = 118263407119L;
        final Integer size = 20;

        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);
        parameters.put("asset", "USDC");
        parameters.put("size", size);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().busdConvertHistory(parameters);
        System.out.println(result);
    }
}
