package examples.spot.wallet;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class DustTransfer {
    private DustTransfer() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        ArrayList<String> assets = new ArrayList<>();
        assets.add("CHR");
        assets.add("CTSI");
        parameters.put("asset", assets);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().dustTransfer(parameters);
        System.out.println(result);
    }
}
