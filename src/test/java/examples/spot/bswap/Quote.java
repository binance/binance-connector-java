package examples.spot.bswap;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class Quote {
    private Quote() {
    }
    private static final double quoteQty = 10000;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("quoteAsset", "USDT");
        parameters.put("baseAsset", "BUSD");
        parameters.put("quoteQty", quoteQty);


        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().quote(parameters);
        System.out.println(result);
    }
}
