package examples.spot.viploans;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class Borrow {
    private Borrow() {
    }

    private static final long loanAccountId = 12345678;
    private static final double loanAmount = 100.55;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("loanAccountId", loanAccountId);
        parameters.put("loanAmount", loanAmount);
        parameters.put("loanCoin", "BUSD");
        parameters.put("collateralAccountId", "87654321");
        parameters.put("collateralCoin", "BUSD");
        parameters.put("isFlexibleRate", true);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createVIPLoans().borrow(parameters);
        System.out.println(result);
    }
}
