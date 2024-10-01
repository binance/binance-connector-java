package examples.spot.margin;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class BorrowRepay {
    private BorrowRepay() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "BNB");
        parameters.put("isIsolated", "FALSE");
        parameters.put("symbol", "BNBUSDT");
        parameters.put("amount", "1");
        parameters.put("type", "BORROW");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().borrowRepay(parameters);
        System.out.println(result);
    }
}
