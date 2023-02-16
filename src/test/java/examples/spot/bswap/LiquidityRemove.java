package examples.spot.bswap;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class LiquidityRemove {
    private LiquidityRemove() {
    }
    private static final long poolId = 32L;
    private static final double shareAmount = 0.1;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("poolId", poolId);
        parameters.put("type", "COMBINATION");
        parameters.put("shareAmount", shareAmount);


        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().liquidityRemove(parameters);
        System.out.println(result);
    }
}
