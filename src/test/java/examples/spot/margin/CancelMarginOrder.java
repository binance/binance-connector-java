package examples.spot.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class CancelMarginOrder {
    private CancelMarginOrder() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");
        parameters.put("orderId", "");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().cancelOrder(parameters);
        System.out.println(result);
    }
}
