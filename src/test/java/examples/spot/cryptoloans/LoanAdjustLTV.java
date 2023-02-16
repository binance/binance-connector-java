package examples.spot.cryptoloans;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

import java.util.LinkedHashMap;

public final class LoanAdjustLTV {

    private LoanAdjustLTV() {
    }

    private static final long orderId = 100000001;
    private static final double amount = 0.01;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("orderId", orderId);
        parameters.put("amount", amount);
        
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().loanAdjustLTV(parameters);
        System.out.println(result);
    }
}