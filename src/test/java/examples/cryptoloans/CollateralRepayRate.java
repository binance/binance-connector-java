package examples.cryptoloans;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public final class CollateralRepayRate {

    private CollateralRepayRate() {
    }

    private static final Logger logger = LoggerFactory.getLogger(CollateralRepayRate.class);
    private static final double repayAmount = 1000;
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("loanCoin", "BUSD");
        parameters.put("collateralCoin", "BNB");
        parameters.put("repayAmount", repayAmount);
        
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().collateralRepayRate(parameters);
        logger.info(result);
    }
}