package examples.spot.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class GetMarginOrder {
    private GetMarginOrder() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().getOrder(parameters);
        System.out.println(result);
    }
}
