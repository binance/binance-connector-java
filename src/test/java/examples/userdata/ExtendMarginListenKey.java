package examples.userdata;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ExtendMarginListenKey {
    private ExtendMarginListenKey() {
    }

    private static final Logger logger = LoggerFactory.getLogger(ExtendMarginListenKey.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("listenKey", "");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        String result = client.createUserData().extendMarginListenKey(parameters);
        logger.info(result);
    }
}
