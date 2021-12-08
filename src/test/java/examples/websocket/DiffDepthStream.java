package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiffDepthStream {
    private static final Logger logger = LoggerFactory.getLogger(DiffDepthStream.class);
    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.diffDepthStream("btcusdt",100,((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
