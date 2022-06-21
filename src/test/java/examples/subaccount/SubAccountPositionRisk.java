package examples.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SubAccountPositionRisk {
    private SubAccountPositionRisk() {
    }

    private static final Logger logger = LoggerFactory.getLogger(SubAccountPositionRisk.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "another_virtual@q6c1dsmxnoemail.com");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().futuresPositionRisk(parameters);
        logger.info(result);
    }
}
