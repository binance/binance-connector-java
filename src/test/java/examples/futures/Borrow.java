package examples.futures;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Borrow {
    private static final Logger logger = LoggerFactory.getLogger(Borrow.class);
    public static void main(String[] args) {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("coin", "USDT");
        parameters.put("amount", 0.01);
        parameters.put("collateralCoin", "BUSD");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createFutures().borrow(parameters);
        logger.info(result);
    }
}
