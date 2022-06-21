package examples.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BnbBurn {
    private BnbBurn() {
    }

    private static final Logger logger = LoggerFactory.getLogger(BnbBurn.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("spotBNBBurn", true);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createMargin().bnbBurn(parameters);
        logger.info(result);
    }
}
