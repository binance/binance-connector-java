package examples.spot.margin;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class ExchangeSmallLiability {

    private ExchangeSmallLiability() {
    }

    public static void main(String[] args) {

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("assetNames", "BTC,ETH");

        String result = client.createMargin().exchangeSmallLiability(parameters);
        System.out.println(result);
    }
}
