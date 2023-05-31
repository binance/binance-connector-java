package examples.spot.subaccount;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class ManagedSubAccountSnapshot {
    private ManagedSubAccountSnapshot() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "");
        parameters.put("type", "SPOT");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().managedSubAccountSnapshot(parameters);
        System.out.println(result);
    }
}
