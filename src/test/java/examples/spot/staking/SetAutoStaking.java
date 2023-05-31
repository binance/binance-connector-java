package examples.spot.staking;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class SetAutoStaking {
    private SetAutoStaking() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("product", "STAKING");
        parameters.put("positionId", "1234");
        parameters.put("renewable", "false");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createStaking().setAutoStaking(parameters);
        System.out.println(result);
    }
}
