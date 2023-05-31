package examples.spot.nft;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class TransactionsHistory {
    private TransactionsHistory() {
    }
    private static final int orderType = 0;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("orderType", orderType);

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createNFT().transactionsHistory(parameters);
        System.out.println(result);
    }
}
