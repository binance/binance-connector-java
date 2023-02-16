package examples.spot.rebate;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

import java.util.LinkedHashMap;

public final class TaxQuery {
    private TaxQuery() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createRebate().taxQuery(parameters);
        System.out.println(result);
    }
}
