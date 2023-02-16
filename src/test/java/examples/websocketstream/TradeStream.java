package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class TradeStream {
    private TradeStream() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        client.tradeStream("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
