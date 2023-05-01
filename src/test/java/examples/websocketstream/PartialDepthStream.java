package examples.websocketstream;

import com.binance.connector.client.impl.WebSocketStreamClientImpl;

public final class PartialDepthStream {
    private PartialDepthStream() {
    }
    private static final int speed = 100;
    private static final int levels = 5;

    public static void main(String[] args) {
        WebSocketStreamClientImpl client = new WebSocketStreamClientImpl();
        client.partialDepthStream("btcusdt", levels, speed, ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
