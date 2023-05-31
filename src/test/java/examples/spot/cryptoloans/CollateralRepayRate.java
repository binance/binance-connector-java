package examples.spot.cryptoloans;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class CollateralRepayRate {

    private CollateralRepayRate() {
    }

    private static final double repayAmount = 1000;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("loanCoin", "BUSD");
        parameters.put("collateralCoin", "BNB");
        parameters.put("repayAmount", repayAmount);
        
        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().collateralRepayRate(parameters);
        System.out.println(result);
    }
}