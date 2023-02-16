package examples.spot.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class IsolatedAccount {
    private IsolatedAccount() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbols", "BNBUSDT,BTCUSDT");
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().isolatedAccount(parameters);
        System.out.println(result);
    }
}
