package examples.spot.market;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class Depth {
    private Depth() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        parameters.put("symbol", "BNBUSDT");
        String result = client.createMarket().depth(parameters);
        System.out.println(result);
    }
}
