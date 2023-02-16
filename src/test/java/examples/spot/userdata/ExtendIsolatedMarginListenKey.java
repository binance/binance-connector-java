package examples.spot.userdata;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class ExtendIsolatedMarginListenKey {
    private ExtendIsolatedMarginListenKey() {
    }

    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BTCUSDT");
        parameters.put("listenKey", "");

        String result = client.createUserData().extendIsolatedMarginListenKey(parameters);
        System.out.println(result);
    }
}
