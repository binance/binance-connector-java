package examples.futures;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CollateralRepayLimit {
    private CollateralRepayLimit() {
    }

    private static final Logger logger = LoggerFactory.getLogger(CollateralRepayLimit.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("coin", "USDT");
        parameters.put("collateralCoin", "BUSD");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createFutures().collateralRepayLimit(parameters);
        logger.info(result);
    }
}
