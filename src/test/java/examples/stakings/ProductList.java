package examples.stakings;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

public class ProductList {
    private static final Logger logger = LoggerFactory.getLogger(ProductList.class);
    public static void main(String[] args) {
        LinkedHashMap<String,Object> parameters = new LinkedHashMap<>();
        parameters.put("product", "STAKING");
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createStakings().productList(parameters);
        logger.info(result);
    }
}
