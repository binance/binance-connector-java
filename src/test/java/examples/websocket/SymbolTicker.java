package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;

public final class SymbolTicker {
    private SymbolTicker() {
    }

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        client.symbolTicker("btcusdt", ((event) -> {
            System.out.println(event);
            client.closeAllConnections();
        }));
    }
}
