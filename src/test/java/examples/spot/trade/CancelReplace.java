package examples.spot.trade;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.exceptions.BinanceClientException;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class CancelReplace {
    private CancelReplace() {
    }
    private static final double quantity = 0.01;
    private static final double price = 30000;
    private static final long cancelOrderId = 1234567;

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        SpotClient client = new SpotClientImpl(PrivateConfig.TESTNET_API_KEY, PrivateConfig.TESTNET_SECRET_KEY, PrivateConfig.BASE_URL);

        parameters.put("symbol", "BTCUSDT");
        parameters.put("side", "SELL");
        parameters.put("type", "LIMIT");
        parameters.put("cancelReplaceMode", "STOP_ON_FAILURE");
        parameters.put("timeInForce", "GTC");
        parameters.put("quantity", quantity);
        parameters.put("price", price);
        parameters.put("cancelOrderId", cancelOrderId);

        try {
            String result = client.createTrade().cancelReplace(parameters);
            System.out.println(result);
        } catch (BinanceConnectorException e) {
            System.err.println((String) String.format("fullErrMessage: %s", e.getMessage()));
        } catch (BinanceClientException e) {
            System.err.println((String) String.format("fullErrMessage: %s \nerrMessage: %s \nerrCode: %d \nHTTPStatusCode: %d",
                    e.getMessage(), e.getErrMsg(), e.getErrorCode(), e.getHttpStatusCode()));
        }
    }
}
