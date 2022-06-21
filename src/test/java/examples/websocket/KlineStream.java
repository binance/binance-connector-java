package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;

public final class KlineStream {
    private KlineStream() {
    }

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.klineStream("btcusdt", "1h", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
