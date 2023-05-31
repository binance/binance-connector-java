package examples.spot.signature;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.exceptions.BinanceClientException;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.utils.signaturegenerator.RsaSignatureGenerator;

import examples.PrivateConfig;

public final class EncryptedRsa {
    private EncryptedRsa() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        RsaSignatureGenerator signGenerator =  new RsaSignatureGenerator(PrivateConfig.TESTNET_PRIVATE_KEY_PATH, "password");
        SpotClient client = new SpotClientImpl(PrivateConfig.TESTNET_API_KEY, signGenerator, PrivateConfig.BASE_URL);

        try {
            String result = client.createTrade().account(parameters);
            System.out.println(result);
        } catch (BinanceConnectorException e) {
            System.err.println((String) String.format("fullErrMessage: %s", e.getMessage()));
        } catch (BinanceClientException e) {
            System.err.println((String) String.format("fullErrMessage: %s \nerrMessage: %s \nerrCode: %d \nHTTPStatusCode: %d",
                    e.getMessage(), e.getErrMsg(), e.getErrorCode(), e.getHttpStatusCode()));
        }
    }
}
