package examples.spot.cryptoloans;

import java.util.LinkedHashMap;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class CustomizeMarginCall {

    private CustomizeMarginCall() {
    }

    private static final double marginCall = 0.7;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("marginCall", marginCall);
        parameters.put("collateralCoin", "BNB");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().customizeMarginCall(parameters);
        System.out.println(result);
    }
}