package examples.futures;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CalcAdjustLevel {
    private CalcAdjustLevel() {
    }
    private static final double amount = 2;

    private static final Logger logger = LoggerFactory.getLogger(CalcAdjustLevel.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("loanCoin", "USDT");
        parameters.put("collateralCoin", "BUSD");
        parameters.put("amount", amount);
        parameters.put("direction", "ADDITIONAL");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createFutures().calcAdjustLevel(parameters);
        logger.info(result);
    }
}
