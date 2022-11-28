package examples.signature;

import com.binance.connector.client.exceptions.BinanceClientException;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.RsaSignatureGenerator;
import examples.PrivateConfig;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EncryptedRsa {
    private EncryptedRsa() {
    }

    private static final Logger logger = LoggerFactory.getLogger(Hmac.class);
    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        RsaSignatureGenerator signGenerator =  new RsaSignatureGenerator(PrivateConfig.TESTNET_PRIVATE_KEY_PATH, "password");
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.TESTNET_API_KEY, signGenerator, PrivateConfig.BASE_URL);

        try {
            String result = client.createTrade().account(parameters);
            logger.info(result);
        } catch (BinanceConnectorException e) {
            logger.error("fullErrMessage: {}", e.getMessage(), e);
        } catch (BinanceClientException e) {
            logger.error("fullErrMessage: {} \nerrMessage: {} \nerrCode: {} \nHTTPStatusCode: {}",
                    e.getMessage(), e.getErrMsg(), e.getErrorCode(), e.getHttpStatusCode(), e);
        }
    }
}
