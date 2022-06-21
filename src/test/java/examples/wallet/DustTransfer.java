package examples.wallet;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class DustTransfer {
    private DustTransfer() {
    }

    private static final Logger logger = LoggerFactory.getLogger(DustTransfer.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        ArrayList<String> assets = new ArrayList<>();
        assets.add("CHR");
        assets.add("CTSI");
        parameters.put("asset", assets);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createWallet().dustTransfer(parameters);
        logger.info(result);
    }
}
