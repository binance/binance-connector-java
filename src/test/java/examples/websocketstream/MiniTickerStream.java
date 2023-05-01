package examples.websocketstream;

import com.binance.connector.client.impl.WebSocketStreamClientImpl;

public final class MiniTickerStream {
    private MiniTickerStream() {
    }

    public static void main(String[] args) {
        WebSocketStreamClientImpl client = new WebSocketStreamClientImpl();
        client.miniTickerStream("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
