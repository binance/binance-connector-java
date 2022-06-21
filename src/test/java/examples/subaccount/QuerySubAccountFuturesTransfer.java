package examples.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class QuerySubAccountFuturesTransfer {
    private QuerySubAccountFuturesTransfer() {
    }
    private static final int futuresType = 1;

    private static final Logger logger = LoggerFactory.getLogger(QuerySubAccountFuturesTransfer.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "");
        parameters.put("futuresType", futuresType);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().getFuturesInternalTransfer(parameters);
        logger.info(result);
    }
}
