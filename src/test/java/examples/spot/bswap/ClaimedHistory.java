package examples.spot.bswap;

import java.util.LinkedHashMap;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class ClaimedHistory {
    private ClaimedHistory() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().claimedHistory(parameters);
        System.out.println(result);
    }
}
