package examples.spot.blvt;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class Subscribe {
    private Subscribe() {
    }
    private static final double cost = 0.01;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("tokenName", "BTCDOWN");
        parameters.put("cost", cost);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBlvt().subscribe(parameters);
        System.out.println(result);
    }
}
