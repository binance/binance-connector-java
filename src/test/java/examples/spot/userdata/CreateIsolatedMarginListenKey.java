package examples.spot.userdata;

import java.util.LinkedHashMap;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class CreateIsolatedMarginListenKey {
    private CreateIsolatedMarginListenKey() {
    }

    public static void main(String[] args) {
        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BTCUSDT");

        String result = client.createUserData().createIsolatedMarginListenKey(parameters);
        System.out.println(result);
    }
}
