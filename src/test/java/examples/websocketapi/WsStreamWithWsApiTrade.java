package examples.websocketapi;

import org.json.JSONObject;

import com.binance.connector.client.WebSocketApiClient;
import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.WebSocketApiClientImpl;
import com.binance.connector.client.impl.WebSocketStreamClientImpl;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.websocketcallback.WebSocketMessageCallback;

import examples.PrivateConfig;

public final class WsStreamWithWsApiTrade {
    
    private WsStreamWithWsApiTrade() {
    }

    private static final double quantity = 0.01;
    private static final int waitTime = 5000;

    public static void main(String[] args) throws InterruptedException {

        // ws stream call
        WebSocketStreamClient streamClient = new WebSocketStreamClientImpl(DefaultUrls.TESTNET_WS_URL);

        WebSocketMessageCallback streamOnMsgCallback = (event) -> {
            System.out.println(event);
        };
        
        streamClient.tradeStream("BTCUSDT", streamOnMsgCallback);

        Thread.sleep(waitTime);

        // ws api call
        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(PrivateConfig.TESTNET_SECRET_KEY);
        WebSocketApiClient apiClient = new WebSocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);
        apiClient.connect(((event) -> {
            System.out.println(event);
        }));

        JSONObject params = new JSONObject();
        params.put("quantity", quantity);

        apiClient.trade().testNewOrder("BTCUSDT", "BUY", "MARKET", params);

        Thread.sleep(waitTime);
        
        // closing all connections
        streamClient.closeAllConnections();
        apiClient.close();
    }
}