package examples.spot.mining;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class HashrateResaleDetail {
    private HashrateResaleDetail() {
    }
    private static final int configId = 123;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("configId", configId);
        parameters.put("userName", "");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMining().hashrateResaleDetail(parameters);
        System.out.println(result);
    }
}
