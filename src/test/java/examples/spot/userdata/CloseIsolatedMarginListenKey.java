package examples.spot.userdata;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class CloseIsolatedMarginListenKey {
    private CloseIsolatedMarginListenKey() {
    }

    public static void main(String[] args) {
        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BTCUSDT");
        parameters.put("listenKey", "");

        String result = client.createUserData().closeIsolatedMarginListenKey(parameters);
        System.out.println(result);
    }
}
