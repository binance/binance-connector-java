package examples.staking;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public final class SetAutoStaking {
    private SetAutoStaking() {
    }

    private static final Logger logger = LoggerFactory.getLogger(SetAutoStaking.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("product", "STAKING");
        parameters.put("positionId", "1234");
        parameters.put("renewable", "false");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createStaking().setAutoStaking(parameters);
        logger.info(result);
    }
}
