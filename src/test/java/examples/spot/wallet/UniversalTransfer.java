package examples.spot.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class UniversalTransfer {
    private UniversalTransfer() {
    }
    private static final double amount = 0.001;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("type", "MAIN_MARGIN");
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().universalTransfer(parameters);
        System.out.println(result);
    }
}
