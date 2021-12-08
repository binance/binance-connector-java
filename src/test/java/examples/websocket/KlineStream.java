package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KlineStream {
    private static final Logger logger = LoggerFactory.getLogger(KlineStream.class);
    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.klineStream("btcusdt", "1h",((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
