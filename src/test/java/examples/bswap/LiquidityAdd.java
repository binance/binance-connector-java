package examples.bswap;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LiquidityAdd {
    private LiquidityAdd() {
    }
    private static final long poolId = 32L;
    private static final double quantity = 0.1;

    private static final Logger logger = LoggerFactory.getLogger(LiquidityAdd.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("poolId", poolId);
        parameters.put("asset", "USDT");
        parameters.put("quantity", quantity);


        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().liquidityAdd(parameters);
        logger.info(result);
    }
}
