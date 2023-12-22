package examples.spot.wallet;


import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class GetBusdAutoConvertions {
    private GetBusdAutoConvertions() {
    }

    public static void main(String[] args) {
        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().getBusdAutoConvertions();
        System.out.println(result);
    }
}
