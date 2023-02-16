package examples.spot.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class SubAccountUniversalTransfer {
    private SubAccountUniversalTransfer() {
    }
    private static final double amount = 0.01;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("fromAccountType", "SPOT");
        parameters.put("toAccountType", "USDT_FUTURE");
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().universalTransfer(parameters);
        System.out.println(result);
    }
}
