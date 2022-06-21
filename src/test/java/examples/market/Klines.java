package examples.market;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Klines {
    private Klines() {
    }

    private static final Logger logger = LoggerFactory.getLogger(Klines.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        parameters.put("symbol", "BNBUSDT");
        parameters.put("interval", "1m");

        String result = client.createMarket().klines(parameters);
        logger.info(result);
    }
}
