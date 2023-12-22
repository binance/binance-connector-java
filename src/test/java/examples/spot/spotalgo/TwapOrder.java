package examples.spot.spotalgo;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class TwapOrder {
    private TwapOrder() {
    }
    
    private static final double quantity = 1.1;
    private static final long duration = 300;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("symbol", "BNBUSDT");
        parameters.put("side", "SELL");
        parameters.put("quantity", quantity);
        parameters.put("duration", duration);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSpotAlgo().twapOrder(parameters);
        System.out.println(result);
    }
}
