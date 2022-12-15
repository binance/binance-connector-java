package examples.cryptoloans;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public final class CustomizeMarginCall {

    private CustomizeMarginCall() {
    }

    private static final double marginCall = 0.7;

    private static final Logger logger = LoggerFactory.getLogger(CustomizeMarginCall.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("marginCall", marginCall);
        parameters.put("collateralCoin", "BNB");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().customizeMarginCall(parameters);
        logger.info(result);
    }
}