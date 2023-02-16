package examples.spot.savings;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class PurchaseFlexibleProduct {
    private PurchaseFlexibleProduct() {
    }
    private static final double amount = 0.01;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("productId", "TKO001");
        parameters.put("amount", amount);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSavings().purchaseFlexibleProduct(parameters);
        System.out.println(result);
    }
}
