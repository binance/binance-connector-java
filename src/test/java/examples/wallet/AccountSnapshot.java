package examples.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class AccountSnapshot {
    private AccountSnapshot() {
    }

    private static final Logger logger = LoggerFactory.getLogger(AccountSnapshot.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("type", "SPOT");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().accountSnapshot(parameters);
        logger.info(result);
    }
}
