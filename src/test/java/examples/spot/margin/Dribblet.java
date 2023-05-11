package examples.spot.margin;

import java.util.LinkedHashMap;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class Dribblet {
    private Dribblet() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().dribblet(parameters);
        System.out.println(result);
    }
}
