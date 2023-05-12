package examples.websocketstream;

import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.impl.WebSocketStreamClientImpl;
import com.binance.connector.client.utils.WebSocketCallback;

public final class TradeStreamWithAllCallbacks {
    private TradeStreamWithAllCallbacks() {
    }

    private static WebSocketCallback onOpenCallback;
    private static WebSocketCallback onMessageCallback;
    private static WebSocketCallback onClosingCallback;
    private static WebSocketCallback onFailureCallback;

    private static void connectToTradeStream(
        WebSocketStreamClient client,
        WebSocketCallback openCallback,
        WebSocketCallback messageCallback,
        WebSocketCallback closingCallback,
        WebSocketCallback failureCallback) {
        client.tradeStream("btcusdt", openCallback, messageCallback, closingCallback, failureCallback);
    }

    public static void main(String[] args) {
        WebSocketStreamClient client = new WebSocketStreamClientImpl();
        
        onOpenCallback = openEvent -> {
            System.out.println("Connection Starting...");
        };
        onMessageCallback = (message) -> {
            System.out.println(message);
        };

        onClosingCallback = closingEvent -> {
            System.out.println("Connection Closing...");
        };

        onFailureCallback = failureEvent -> {
            System.out.println("Connection Failed...");
            System.out.println("Retrying Connection...");
            connectToTradeStream(client, onOpenCallback, onMessageCallback, onClosingCallback, onFailureCallback);
        };
        connectToTradeStream(client, onOpenCallback, onMessageCallback, onClosingCallback, onFailureCallback);

        // Close connection for onClosingCallback example purpose
        client.closeAllConnections();


    }
}

