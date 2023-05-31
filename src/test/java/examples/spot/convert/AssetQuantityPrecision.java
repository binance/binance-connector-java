package examples.spot.convert;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class AssetQuantityPrecision {
    private AssetQuantityPrecision() {
    }

    public static void main(String[] args) {
        
        Map<String, Object> parameters = new LinkedHashMap<>();

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createConvert().assetQuantityPrecision(parameters);
        System.out.println(result);
    }
}
