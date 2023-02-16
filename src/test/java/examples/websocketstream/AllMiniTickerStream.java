package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class AllMiniTickerStream {
    private AllMiniTickerStream() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        client.allMiniTickerStream(((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
