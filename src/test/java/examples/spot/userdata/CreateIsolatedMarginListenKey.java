package examples.spot.userdata;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class CreateIsolatedMarginListenKey {
    private CreateIsolatedMarginListenKey() {
    }

    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BTCUSDT");

        String result = client.createUserData().createIsolatedMarginListenKey(parameters);
        System.out.println(result);
    }
}
