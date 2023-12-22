package examples.spot.spotalgo;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class GetSubOrders {
    private GetSubOrders() {
    }
    
    private static final long algoId = 14511;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("algoId", algoId);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSpotAlgo().getSubOrders(parameters);
        System.out.println(result);
    }
}
