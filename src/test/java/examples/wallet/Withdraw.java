package examples.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class Withdraw {
    private Withdraw() {
    }

    private static final Logger logger = LoggerFactory.getLogger(Withdraw.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("coin", "BNBUSDT");
        parameters.put("address", "");
        parameters.put("amount", "0.001");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().withdraw(parameters);
        logger.info(result);
    }
}
