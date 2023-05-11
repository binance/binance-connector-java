package examples.websocketstream;

import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.impl.WebSocketStreamClientImpl;

public final class BookTicker {
    private BookTicker() {
    }

    public static void main(String[] args) {
        WebSocketStreamClient client = new WebSocketStreamClientImpl();
        client.bookTicker("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
