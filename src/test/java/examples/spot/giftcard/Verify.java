package examples.spot.giftcard;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

import java.util.LinkedHashMap;

public final class Verify {
    private Verify() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("referenceNo", "");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createGiftCard().verify(parameters);
        System.out.println(result);
    }
}
