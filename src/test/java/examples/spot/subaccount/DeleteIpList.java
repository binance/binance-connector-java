package examples.spot.subaccount;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class DeleteIpList {
    private DeleteIpList() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "");
        parameters.put("subAccountApiKey", "");
        parameters.put("ipAddress", "");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().deleteIpList(parameters);
        System.out.println(result);
    }
}
