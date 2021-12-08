package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PartialDepthStream {
    private static final Logger logger = LoggerFactory.getLogger(PartialDepthStream.class);
    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.partialDepthStream("btcusdt",5, 100,((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
