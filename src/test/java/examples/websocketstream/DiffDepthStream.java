package examples.websocketstream;

import com.binance.connector.client.impl.WebSocketStreamClientImpl;

public final class DiffDepthStream {
    private DiffDepthStream() {
    }
    private static final int speed = 100;

    public static void main(String[] args) {
        WebSocketStreamClientImpl client = new WebSocketStreamClientImpl();
        client.diffDepthStream("btcusdt", speed, ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
