package examples.spot.market;

import java.util.LinkedHashMap;

import com.binance.connector.client.impl.SpotClientImpl;

public final class AveragePrice {
    private AveragePrice() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl();

        parameters.put("symbol", "BNBUSDT");
        String result = client.createMarket().averagePrice(parameters);
        System.out.println(result);
    }
}
