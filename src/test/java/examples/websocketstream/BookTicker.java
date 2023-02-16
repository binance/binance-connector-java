package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class BookTicker {
    private BookTicker() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        client.bookTicker("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
