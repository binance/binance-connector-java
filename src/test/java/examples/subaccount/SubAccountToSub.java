package examples.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubAccountToSub {
    private static final Logger logger = LoggerFactory.getLogger(SubAccountToSub.class);
    public static void main(String[] args) {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("toEmail", "");
        parameters.put("asset", "USDT");
        parameters.put("amount", 0.01);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().subAccountToSubAccount(parameters);
        logger.info(result);
    }
}
