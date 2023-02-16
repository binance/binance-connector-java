package examples.websocketapi;

import com.binance.connector.client.impl.WebsocketApiClientImpl;
import com.binance.connector.client.impl.WebsocketStreamClientImpl;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.utils.HmacSignatureGenerator;
import com.binance.connector.client.utils.WebSocketCallback;

import examples.PrivateConfig;
import org.json.JSONObject;

public final class WsStreamWithWsApiTrade {
    
    private WsStreamWithWsApiTrade() {
    }

    private static final double quantity = 0.01;
    private static final int waitTime = 5000;

    public static void main(String[] args) throws InterruptedException {

        // ws stream call
        WebsocketStreamClientImpl streamClient = new WebsocketStreamClientImpl(DefaultUrls.TESTNET_WSS_URL);

        WebSocketCallback streamOnMsgCallback = (event) -> {
            System.out.println(event);
        };
        
        streamClient.tradeStream("BTCUSDT", streamOnMsgCallback);

        Thread.sleep(waitTime);

        // ws api call
        HmacSignatureGenerator signatureGenerator = new HmacSignatureGenerator(PrivateConfig.TESTNET_SECRET_KEY);
        WebsocketApiClientImpl apiClient = new WebsocketApiClientImpl(PrivateConfig.TESTNET_API_KEY, signatureGenerator, DefaultUrls.TESTNET_WS_API_URL);
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