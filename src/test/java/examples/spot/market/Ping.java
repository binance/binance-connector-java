package examples.spot.market;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class Ping {
    private Ping() {
    }

    public static void main(String[] args) {

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMarket().ping();
        System.out.println(result);
    }
}
