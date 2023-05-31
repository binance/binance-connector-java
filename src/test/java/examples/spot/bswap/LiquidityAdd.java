package examples.spot.bswap;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class LiquidityAdd {
    private LiquidityAdd() {
    }
    private static final long poolId = 32L;
    private static final double quantity = 0.1;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("poolId", poolId);
        parameters.put("asset", "USDT");
        parameters.put("quantity", quantity);


        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().liquidityAdd(parameters);
        System.out.println(result);
    }
}
