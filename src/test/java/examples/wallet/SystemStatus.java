package examples.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SystemStatus {
    private SystemStatus() {
    }

    private static final Logger logger = LoggerFactory.getLogger(SystemStatus.class);
    public static void main(String[] args) {

        SpotClientImpl client = new SpotClientImpl();
        String result = client.createWallet().systemStatus();
        logger.info(result);
    }
}
