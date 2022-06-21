package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;

public final class MiniTickerStream {
    private MiniTickerStream() {
    }

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.miniTickerStream("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
