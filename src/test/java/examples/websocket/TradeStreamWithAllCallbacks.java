package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;
import com.binance.connector.client.utils.WebSocketClosingCallback;
import com.binance.connector.client.utils.WebSocketFailureCallback;
import com.binance.connector.client.utils.WebSocketMessageCallback;
import com.binance.connector.client.utils.WebSocketOpenCallback;

public final class TradeStreamWithAllCallbacks {
    private TradeStreamWithAllCallbacks() {
    }

    private static WebSocketOpenCallback onOpenCallback;
    private static WebSocketMessageCallback onMessageCallback;
    private static WebSocketClosingCallback onClosingCallback;
    private static WebSocketFailureCallback onFailureCallback;

    private static void connectToTradeStream(
        WebsocketClientImpl client,
        WebSocketOpenCallback openCallback,
        WebSocketMessageCallback messageCallback,
        WebSocketClosingCallback closingCallback,
        WebSocketFailureCallback failureCallback) {
        client.tradeStream("btcusdt", openCallback, messageCallback, closingCallback, failureCallback);
    }

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();

        onOpenCallback = openEvent -> {
            System.out.println("Connection Starting...");
        };

        onMessageCallback = (message) -> {
            System.out.println(message);
        };

        onClosingCallback = (code,reason) -> {
            System.out.println("Connection Closing...");
        };

        onFailureCallback = (throwable,response) -> {
            System.out.println("Connection Failed...");
            System.out.println("Retrying Connection...");
            connectToTradeStream(client, onOpenCallback, onMessageCallback, onClosingCallback, onFailureCallback);
        };
        connectToTradeStream(client, onOpenCallback, onMessageCallback, onClosingCallback, onFailureCallback);

        // Close connection for onClosingCallback example purpose
        client.closeAllConnections();


    }
}

