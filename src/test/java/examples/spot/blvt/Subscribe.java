package examples.spot.blvt;

import java.util.LinkedHashMap;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class Subscribe {
    private Subscribe() {
    }
    private static final double cost = 0.01;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("tokenName", "BTCDOWN");
        parameters.put("cost", cost);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBlvt().subscribe(parameters);
        System.out.println(result);
    }
}
