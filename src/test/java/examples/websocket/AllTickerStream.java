package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AllTickerStream {
    private static final Logger logger = LoggerFactory.getLogger(AllTickerStream.class);
    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.allTickerStream(((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
