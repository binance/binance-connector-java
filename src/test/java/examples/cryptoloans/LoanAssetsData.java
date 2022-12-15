package examples.cryptoloans;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public final class LoanAssetsData {

    private LoanAssetsData() {
    }

    private static final Logger logger = LoggerFactory.getLogger(LoanAssetsData.class);

    private static final long vipLevel = 1;
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("loanCoin", "BUSD");
        parameters.put("vipLevel", vipLevel); 
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createCryptoLoans().loanAssetsData(parameters);
        logger.info(result);
    }
}
