package examples.spot.convert;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

public final class ExchangeInfo {
    private ExchangeInfo() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        parameters.put("fromAsset", "BTC");
        parameters.put("toAsset", "USDT");

        SpotClient client = new SpotClientImpl();
        String result = client.createConvert().exchangeInfo(parameters);
        System.out.println(result);
    }
}
