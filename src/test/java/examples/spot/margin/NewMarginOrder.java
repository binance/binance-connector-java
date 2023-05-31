package examples.spot.margin;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class NewMarginOrder {
    private NewMarginOrder() {
    }
    private static final double quantity = 0.1;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");
        parameters.put("side", "SELL");
        parameters.put("type", "MARKET");
        parameters.put("quantity", quantity);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().newOrder(parameters);
        System.out.println(result);
    }
}
