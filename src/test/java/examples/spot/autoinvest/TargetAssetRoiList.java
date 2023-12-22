package examples.spot.autoinvest;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class TargetAssetRoiList {
    private TargetAssetRoiList() {
    }
    
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("targetAsset", "BTC");
        parameters.put("hisRoiType", "FIVE_YEAR");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createAutoInvest().targetAssetRoiList(parameters);
        System.out.println(result);
    }
}
