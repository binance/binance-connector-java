package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;

public final class PartialDepthStream {
    private PartialDepthStream() {
    }
    private static final int speed = 100;
    private static final int levels = 5;

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.partialDepthStream("btcusdt", levels, speed, ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
