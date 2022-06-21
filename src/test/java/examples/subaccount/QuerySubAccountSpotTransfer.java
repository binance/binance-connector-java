package examples.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class QuerySubAccountSpotTransfer {
    private QuerySubAccountSpotTransfer() {
    }

    private static final Logger logger = LoggerFactory.getLogger(QuerySubAccountSpotTransfer.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().spotTransferHistory(parameters);
        logger.info(result);
    }
}
