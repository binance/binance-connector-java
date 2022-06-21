package examples.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EnableFastWithdraw {
    private EnableFastWithdraw() {
    }

    private static final Logger logger = LoggerFactory.getLogger(EnableFastWithdraw.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().enableFastWithdraw(parameters);
        logger.info(result);
    }
}
