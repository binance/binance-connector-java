package examples.cryptoloans;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public final class LoanIncome {
    private LoanIncome() {
    }

    private static final Logger logger = LoggerFactory.getLogger(LoanIncome.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("asset", "BNB");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().loanIncome(parameters);
        logger.info(result);
    }
}
