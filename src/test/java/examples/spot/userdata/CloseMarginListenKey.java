package examples.spot.userdata;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class CloseMarginListenKey {
    private CloseMarginListenKey() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("listenKey", "");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        String result = client.createUserData().closeMarginListenKey(parameters);
        System.out.println(result);
    }
}
