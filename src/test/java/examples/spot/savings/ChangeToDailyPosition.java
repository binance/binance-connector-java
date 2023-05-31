package examples.spot.savings;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class ChangeToDailyPosition {
    private ChangeToDailyPosition() {
    }
    private static final long lot = 1L;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("projectId", "TKO001");
        parameters.put("lot", lot);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSavings().changeToDailyPosition(parameters);
        System.out.println(result);
    }
}
