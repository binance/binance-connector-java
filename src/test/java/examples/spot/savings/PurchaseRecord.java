package examples.spot.savings;

import java.util.LinkedHashMap;

import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class PurchaseRecord {
    private PurchaseRecord() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("lendingType", "DAILY");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSavings().purchaseRecord(parameters);
        System.out.println(result);
    }
}
