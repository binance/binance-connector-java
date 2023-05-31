package examples.spot.bswap;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class LiquidityRemove {
    private LiquidityRemove() {
    }
    private static final long poolId = 32L;
    private static final double shareAmount = 0.1;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("poolId", poolId);
        parameters.put("type", "COMBINATION");
        parameters.put("shareAmount", shareAmount);


        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().liquidityRemove(parameters);
        System.out.println(result);
    }
}
