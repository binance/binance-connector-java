package examples.margin;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CancelMarginOcoOrder {
    private static final Logger logger = LoggerFactory.getLogger(CancelMarginOcoOrder.class);
    public static void main(String[] args) {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        parameters.put("symbol","BTCUSDT");
        parameters.put("orderListId", "");

        String result = client.createMargin().cancelOcoOrder(parameters);
        logger.info(result);
    }
}
