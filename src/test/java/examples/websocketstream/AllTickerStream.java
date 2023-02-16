package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class AllTickerStream {
    private AllTickerStream() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        client.allTickerStream(((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
