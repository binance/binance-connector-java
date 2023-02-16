package examples.spot.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class SubAccountDepositAddress {
    private SubAccountDepositAddress() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "");
        parameters.put("coin", "USDT");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().depositAddress(parameters);
        System.out.println(result);
    }
}
