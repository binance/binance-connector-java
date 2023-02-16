package examples.spot.bswap;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class Swap {
    private Swap() {
    }
    private static final double quoteQty = 2;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("quoteAsset", "USDT");
        parameters.put("baseAsset", "BUSD");
        parameters.put("quoteQty", quoteQty);


        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().swap(parameters);
        System.out.println(result);
    }
}
