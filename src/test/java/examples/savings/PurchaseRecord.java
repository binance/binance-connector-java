package examples.savings;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PurchaseRecord {
    private PurchaseRecord() {
    }

    private static final Logger logger = LoggerFactory.getLogger(PurchaseRecord.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("lendingType", "DAILY");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSavings().purchaseRecord(parameters);
        logger.info(result);
    }
}
