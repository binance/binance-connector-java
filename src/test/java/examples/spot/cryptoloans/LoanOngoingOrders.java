package examples.spot.cryptoloans;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

import java.util.LinkedHashMap;

public final class LoanOngoingOrders {

    private LoanOngoingOrders() {
    }

    private static final long orderId = 100000001;
    
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("orderId", orderId);
        parameters.put("loanCoin", "BUSD");
        
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().loanOngoingOrders(parameters);
        System.out.println(result);
    }
}
