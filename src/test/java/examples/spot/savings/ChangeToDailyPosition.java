package examples.spot.savings;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class ChangeToDailyPosition {
    private ChangeToDailyPosition() {
    }
    private static final long lot = 1L;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("projectId", "TKO001");
        parameters.put("lot", lot);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSavings().changeToDailyPosition(parameters);
        System.out.println(result);
    }
}
