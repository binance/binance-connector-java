package examples.spot.cryptoloans;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class LoanAssetsData {

    private LoanAssetsData() {
    }

    private static final long vipLevel = 1;
    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("loanCoin", "BUSD");
        parameters.put("vipLevel", vipLevel); 
        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().loanAssetsData(parameters);
        System.out.println(result);
    }
}
