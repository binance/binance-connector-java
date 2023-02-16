package examples.spot.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class BusdConvertHistory {
    private BusdConvertHistory() {
    }


    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        final Long startTime = 118263400000L;
        final Long endTime = 118263407119L;
        final Integer size = 20;

        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);
        parameters.put("asset", "USDC");
        parameters.put("size", size);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().busdConvertHistory(parameters);
        System.out.println(result);
    }
}
