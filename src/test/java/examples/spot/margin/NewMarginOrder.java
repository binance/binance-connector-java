package examples.spot.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class NewMarginOrder {
    private NewMarginOrder() {
    }
    private static final double quantity = 0.1;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");
        parameters.put("side", "SELL");
        parameters.put("type", "MARKET");
        parameters.put("quantity", quantity);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().newOrder(parameters);
        System.out.println(result);
    }
}
