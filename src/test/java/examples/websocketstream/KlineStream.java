package examples.websocketstream;

import com.binance.connector.client.impl.WebSocketStreamClientImpl;

public final class KlineStream {
    private KlineStream() {
    }

    public static void main(String[] args) {
        WebSocketStreamClientImpl client = new WebSocketStreamClientImpl();
        client.klineStream("btcusdt", "1h", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
