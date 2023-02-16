package examples.spot.fiat;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class Orders {
    private Orders() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("transactionType", "0");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createFiat().orders(parameters);
        System.out.println(result);
    }
}
