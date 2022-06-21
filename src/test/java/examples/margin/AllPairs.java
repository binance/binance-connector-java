package examples.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AllPairs {
    private AllPairs() {
    }

    private static final Logger logger = LoggerFactory.getLogger(AllPairs.class);
    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().allPairs();
        logger.info(result);
    }
}
