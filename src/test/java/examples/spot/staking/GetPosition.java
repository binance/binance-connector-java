package examples.spot.staking;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class GetPosition {
    private GetPosition() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("product", "STAKING");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createStaking().getPosition(parameters);
        System.out.println(result);
    }
}
