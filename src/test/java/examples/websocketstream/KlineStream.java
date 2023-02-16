package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class KlineStream {
    private KlineStream() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        client.klineStream("btcusdt", "1h", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
