package examples.spot.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class EnableIsolatedAccount {
    private EnableIsolatedAccount() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        parameters.put("symbol", "BNBUSDT");

        String result = client.createMargin().enableIsolatedAccount(parameters);
        System.out.println(result);
    }
}
