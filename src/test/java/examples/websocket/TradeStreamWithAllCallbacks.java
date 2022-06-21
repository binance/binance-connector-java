package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;
import com.binance.connector.client.utils.WebSocketCallback;

public final class TradeStreamWithAllCallbacks {
    private TradeStreamWithAllCallbacks() {
    }

    private static WebSocketCallback onOpenCallback;
    private static WebSocketCallback onMessageCallback;
    private static WebSocketCallback onClosingCallback;
    private static WebSocketCallback onFailureCallback;

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        onOpenCallback = openEvent -> {
        };
        onMessageCallback = (message) -> {
            System.out.println(message);
            client.closeAllConnections();
        };
        onClosingCallback = closingEvent -> {
        };
        onFailureCallback = failureEvent -> {
            connectToTradeStream(client, onOpenCallback, onMessageCallback, onClosingCallback, onClosingCallback);
        };
        connectToTradeStream(client, onOpenCallback, onMessageCallback, onClosingCallback, onFailureCallback);
    }

    private static void connectToTradeStream(
            WebsocketClientImpl client,
            WebSocketCallback openCallback,
            WebSocketCallback messageCallback,
            WebSocketCallback closingCallback,
            WebSocketCallback failureCallback) {
        client.tradeStream("btcusdt", openCallback, messageCallback, closingCallback, failureCallback);
    }
}
