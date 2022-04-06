package examples.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public class ManagedSubAccountSnapshot {
    private static final Logger logger = LoggerFactory.getLogger(ManagedSubAccountSnapshot.class);
    public static void main(String[] args) {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "");
        parameters.put("type", "SPOT");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().managedSubAccountSnapshot(parameters);
        logger.info(result);
    }
}
