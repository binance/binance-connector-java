package examples.savings;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PurchaseProject {
    private PurchaseProject() {
    }
    private static final long lot = 1L;

    private static final Logger logger = LoggerFactory.getLogger(PurchaseProject.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("projectId", "TKO001");
        parameters.put("lot", lot);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSavings().purchaseProject(parameters);
        logger.info(result);
    }
}
