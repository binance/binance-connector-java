package examples.spot.margin;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class NewMarginOcoOrder {
    private NewMarginOcoOrder() {
    }
    private static final double quantity = 0.01;
    private static final double price = 95000;
    private static final double stopPrice = 98000;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        parameters.put("symbol", "BTCUSDT");
        parameters.put("side", "SELL");
        parameters.put("stopPrice", stopPrice);
        parameters.put("quantity", quantity);
        parameters.put("price", price);

        String result = client.createMargin().ocoOrder(parameters);
        System.out.println(result);
    }
}
