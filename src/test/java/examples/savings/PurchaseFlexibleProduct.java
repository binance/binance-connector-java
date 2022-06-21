package examples.savings;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PurchaseFlexibleProduct {
    private PurchaseFlexibleProduct() {
    }
    private static final double amount = 0.01;

    private static final Logger logger = LoggerFactory.getLogger(PurchaseFlexibleProduct.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("productId", "TKO001");
        parameters.put("amount", amount);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSavings().purchaseFlexibleProduct(parameters);
        logger.info(result);
    }
}
