package examples.spot.userdata;

import java.util.LinkedHashMap;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class CloseMarginListenKey {
    private CloseMarginListenKey() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("listenKey", "");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        String result = client.createUserData().closeMarginListenKey(parameters);
        System.out.println(result);
    }
}
