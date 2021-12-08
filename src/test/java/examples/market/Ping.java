package examples.market;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ping {
    private static final Logger logger = LoggerFactory.getLogger(Ping.class);
    public static void main(String[] args) {

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMarket().ping();
        logger.info(result);
    }
}
