package examples.spot.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class DustTransfer {
    private DustTransfer() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        ArrayList<String> assets = new ArrayList<>();
        assets.add("CHR");
        assets.add("CTSI");
        parameters.put("asset", assets);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().dustTransfer(parameters);
        System.out.println(result);
    }
}
