package examples.market;

import com.binance.connector.client.impl.SpotClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ServerTime {
    private ServerTime() {
    }

    private static final Logger logger = LoggerFactory.getLogger(ServerTime.class);
    public static void main(String[] args) {

        SpotClientImpl client = new SpotClientImpl();
        String result = client.createMarket().time();
        logger.info(result);
    }
}
