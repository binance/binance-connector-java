package examples.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class BusdConvert {
    private BusdConvert() {
    }

    private static final Logger logger = LoggerFactory.getLogger(BusdConvert.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        final BigDecimal amount = new BigDecimal(1);
        parameters.put("clientTranId", "118263407119");
        parameters.put("asset", "BUSD");
        parameters.put("amount", amount);
        parameters.put("targetAsset", "USDC");
        parameters.put("accountType", "MAIN");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().busdConvert(parameters);
        logger.info(result);
    }
}
