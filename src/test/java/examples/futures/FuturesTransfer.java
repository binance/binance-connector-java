package examples.futures;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FuturesTransfer {
    private FuturesTransfer() {
    }
    private static final double amount = 0.01;
    private static final int type = 2;

    private static final Logger logger = LoggerFactory.getLogger(FuturesTransfer.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);
        parameters.put("type", type);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createFutures().futuresTransfer(parameters);
        logger.info(result);
    }
}
