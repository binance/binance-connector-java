package examples.spot.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class Borrow {
    private Borrow() {
    }
    private static final double amount = 1;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().borrow(parameters);
        System.out.println(result);
    }
}
