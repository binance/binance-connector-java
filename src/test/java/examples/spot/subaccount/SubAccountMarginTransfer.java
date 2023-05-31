package examples.spot.subaccount;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class SubAccountMarginTransfer {
    private SubAccountMarginTransfer() {
    }
    private static final double amount = 0.01;
    private static final int type = 2;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "");
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);
        parameters.put("type", type);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().marginTransfer(parameters);
        System.out.println(result);
    }
}
