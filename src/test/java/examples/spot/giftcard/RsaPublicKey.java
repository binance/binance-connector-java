package examples.spot.giftcard;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

import java.util.LinkedHashMap;

public final class RsaPublicKey {
    private RsaPublicKey() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createGiftCard().rsaPublicKey(parameters);
        System.out.println(result);
    }
}
