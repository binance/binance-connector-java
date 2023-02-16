package examples.spot.userdata;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

public final class CreateListenKey {
    private CreateListenKey() {
    }

    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        String result = client.createUserData().createListenKey();
        System.out.println(result);
    }
}
