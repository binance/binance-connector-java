package examples.spot.wallet;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class Withdraw {
    private Withdraw() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("coin", "BNBUSDT");
        parameters.put("address", "");
        parameters.put("amount", "0.001");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().withdraw(parameters);
        System.out.println(result);
    }
}
