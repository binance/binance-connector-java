package examples.spot.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class CrossMarginTransfer {
    private CrossMarginTransfer() {
    }
    private static final double amount = 1;
    private static final int type = 2;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);
        parameters.put("type", type);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().crossMarginTransfer(parameters);
        System.out.println(result);
    }
}
