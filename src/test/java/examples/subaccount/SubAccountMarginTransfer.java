package examples.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SubAccountMarginTransfer {
    private SubAccountMarginTransfer() {
    }
    private static final double amount = 0.01;
    private static final int type = 2;

    private static final Logger logger = LoggerFactory.getLogger(SubAccountMarginTransfer.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "");
        parameters.put("asset", "USDT");
        parameters.put("amount", amount);
        parameters.put("type", type);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().marginTransfer(parameters);
        logger.info(result);
    }
}
