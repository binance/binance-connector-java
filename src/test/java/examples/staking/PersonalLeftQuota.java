package examples.staking;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public final class PersonalLeftQuota {
    private PersonalLeftQuota() {
    }

    private static final Logger logger = LoggerFactory.getLogger(PersonalLeftQuota.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("product", "STAKING");
        parameters.put("productId", "Bnb*21*WL");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createStaking().personalLeftQuota(parameters);
        logger.info(result);
    }
}
