package examples.spot.bswap;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class AddLiquidityPreview {
    private AddLiquidityPreview() {
    }
    private static final long poolId = 2L;
    private static final double quoteQty = 10000;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("poolId", poolId);
        parameters.put("type", "COMBINATION");
        parameters.put("quoteAsset", "USDT");
        parameters.put("quoteQty", quoteQty);


        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().addLiquidityPreview(parameters);
        System.out.println(result);
    }
}
