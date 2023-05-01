package examples.websocketstream;

import com.binance.connector.client.impl.WebSocketStreamClientImpl;

public final class TradeStream {
    private TradeStream() {
    }

    public static void main(String[] args) {
        WebSocketStreamClientImpl client = new WebSocketStreamClientImpl();
        client.tradeStream("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
