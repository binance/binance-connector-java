package examples.spot.market;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

public final class Trades {
    private Trades() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        SpotClient client = new SpotClientImpl();

        parameters.put("symbol", "BNBUSDT");
        String result = client.createMarket().trades(parameters);
        System.out.println(result);
    }
}
