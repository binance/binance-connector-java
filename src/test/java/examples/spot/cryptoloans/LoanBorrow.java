package examples.spot.cryptoloans;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class LoanBorrow {
    private LoanBorrow() {
    }

    private static final int loanTerm = 7;
    private static final double loanAmount = 100.5;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("loanCoin", "BUSD");
        parameters.put("collateralCoin", "BNB");
        parameters.put("loanAmount", loanAmount);
        parameters.put("loanTerm", loanTerm);
        

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().loanBorrow(parameters);
        System.out.println(result);
    }
}
