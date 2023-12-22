package examples.spot.margin;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class SmallLiabilityExchangeHistory {
    private SmallLiabilityExchangeHistory() {
    }

    private static final int current = 3;
    private static final int size = 3;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("current", current);
        parameters.put("size", size);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().smallLiabilityExchangeHistory(parameters);
        System.out.println(result);
    }
}
