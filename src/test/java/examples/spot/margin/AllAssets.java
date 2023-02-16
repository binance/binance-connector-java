package examples.spot.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

public final class AllAssets {
    private AllAssets() {
    }

    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().allAssets();
        System.out.println(result);
    }
}
