package examples.bswap;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LiquidityAdd {
    private static final Logger logger = LoggerFactory.getLogger(LiquidityAdd.class);
    public static void main(String[] args) {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("poolId", 32L);
        parameters.put("asset", "USDT");
        parameters.put("quantity", 0.1);


        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().liquidityAdd(parameters);
        logger.info(result);
    }
}
