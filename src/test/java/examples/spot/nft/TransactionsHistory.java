package examples.spot.nft;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

import java.util.LinkedHashMap;

public final class TransactionsHistory {
    private TransactionsHistory() {
    }
    private static final int orderType = 0;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("orderType", orderType);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createNFT().transactionsHistory(parameters);
        System.out.println(result);
    }
}
