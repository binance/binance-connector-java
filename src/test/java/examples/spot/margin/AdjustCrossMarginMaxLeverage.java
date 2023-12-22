package examples.spot.margin;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class AdjustCrossMarginMaxLeverage {

    private AdjustCrossMarginMaxLeverage() {
    }

    private static final Integer leverage = 3;

    public static void main(String[] args) {

        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("maxLeverage", leverage);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().adjustCrossMarginMaxLeverage(parameters);
        System.out.println(result);
    }
}
