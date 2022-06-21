package examples.bswap;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class RemoveLiquidityPreview {
    private RemoveLiquidityPreview() {
    }
    private static final long poolId = 2L;
    private static final double shareAmount = 10000;

    private static final Logger logger = LoggerFactory.getLogger(RemoveLiquidityPreview.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("poolId", poolId);
        parameters.put("type", "COMBINATION");
        parameters.put("quoteAsset", "USDT");
        parameters.put("shareAmount", shareAmount);


        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().removeLiquidityPreview(parameters);
        logger.info(result);
    }
}
