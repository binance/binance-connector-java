package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class SymbolTicker {
    private SymbolTicker() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        client.symbolTicker("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
