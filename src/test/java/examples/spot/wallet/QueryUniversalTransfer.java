package examples.spot.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class QueryUniversalTransfer {
    private QueryUniversalTransfer() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("type", "MAIN_MARGIN");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().queryUniversalTransfer(parameters);
        System.out.println(result);
    }
}
