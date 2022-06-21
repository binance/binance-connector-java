package examples.convert;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public final class TradeFlow {
    private TradeFlow() {
    }
    private static final long startTime = 1234567L;
    private static final long endTime = 12345678L;

    private static final Logger logger = LoggerFactory.getLogger(TradeFlow.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        parameters.put("startTime", startTime);
        parameters.put("endTime", endTime);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createConvert().tradeFlow(parameters);
        logger.info(result);
    }
}
