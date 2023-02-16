package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class MiniTickerStream {
    private MiniTickerStream() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        client.miniTickerStream("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
