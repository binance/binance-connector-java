package examples.spot.wallet;

import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class BusdConvert {
    private BusdConvert() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        final BigDecimal amount = new BigDecimal(1);
        parameters.put("clientTranId", "118263407119");
        parameters.put("asset", "BUSD");
        parameters.put("amount", amount);
        parameters.put("targetAsset", "USDC");
        parameters.put("accountType", "MAIN");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().busdConvert(parameters);
        System.out.println(result);
    }
}
