package examples.spot.margin;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class IsolatedTransfer {
    private IsolatedTransfer() {
    }
    private static final double amount = 1;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        parameters.put("symbol", "BNBUSDT");
        parameters.put("asset", "USDT");
        parameters.put("transFrom", "SPOT");
        parameters.put("transTo", "ISOLATED_MARGIN");
        parameters.put("amount", amount);

        String result = client.createMargin().isolatedTransfer(parameters);
        System.out.println(result);
    }
}
