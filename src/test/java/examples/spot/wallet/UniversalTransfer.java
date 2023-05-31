package examples.spot.wallet;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class UniversalTransfer {
    private UniversalTransfer() {
    }
    private static final double amount = 0.001;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("type", "MAIN_MARGIN");
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().universalTransfer(parameters);
        System.out.println(result);
    }
}
