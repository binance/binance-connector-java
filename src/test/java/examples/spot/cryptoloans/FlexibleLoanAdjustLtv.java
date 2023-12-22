package examples.spot.cryptoloans;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class FlexibleLoanAdjustLtv {
    private FlexibleLoanAdjustLtv() {
    }
    private static final double adjustmentAmount = 5.235;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("loanCoin", "BUSD");
        parameters.put("collateralCoin", "BNB");
        parameters.put("adjustmentAmount", adjustmentAmount);
        parameters.put("direction", "ADDITIONAL");

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().flexibleLoanAdjustLtv(parameters);
        System.out.println(result);
    }
}
