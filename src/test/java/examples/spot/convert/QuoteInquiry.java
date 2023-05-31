package examples.spot.convert;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class QuoteInquiry {
    private QuoteInquiry() {
    }
    private static final double amount = 0.001;

    public static void main(String[] args) {

        Map<String, Object> parameters = new LinkedHashMap<>();

        parameters.put("fromAsset", "BTC");
        parameters.put("toAsset", "USDT");
        parameters.put("fromAmount", amount);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createConvert().quoteInquiry(parameters);
        System.out.println(result);
    }
}
