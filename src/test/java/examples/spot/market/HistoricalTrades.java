package examples.spot.market;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class HistoricalTrades {
    private HistoricalTrades() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, null);

        parameters.put("symbol", "BTCUSDT");
        parameters.put("limit", "10");
        String result = client.createMarket().historicalTrades(parameters);
        System.out.println(result);
    }
}
