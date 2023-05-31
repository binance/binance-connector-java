package examples.websocketstream;

import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.impl.WebSocketStreamClientImpl;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosedCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosingCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketFailureCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketMessageCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketOpenCallback;

public final class TradeStreamWithAllCallbacks {
    private TradeStreamWithAllCallbacks() {
    }

    private static WebSocketOpenCallback onOpenCallback;
    private static WebSocketMessageCallback onMessageCallback;
    private static WebSocketClosingCallback onClosingCallback;
    private static WebSocketClosedCallback onClosedCallback;
    private static WebSocketFailureCallback onFailureCallback;

    public static void main(String[] args) throws InterruptedException {
        WebSocketStreamClient client = new WebSocketStreamClientImpl();
        final long sleepTime = 1000;
        
        onOpenCallback = openEvent -> {
            System.out.println("Open Connection: " + openEvent.toString());
        };

        onMessageCallback = (message) -> {
            System.out.println("Connection Message: " +  message);
        };

        onClosingCallback = (code, reason) -> {
            System.out.println("Closing Connection: code=" + code + ", reason=" + reason);
        };

        onClosedCallback = (code, reason) -> {
            System.out.println("Closed Connection: code=" + code + ", reason=" + reason);
        };

        onFailureCallback = (throwable, response) -> {
            System.out.println("Connection Failed: throwable=" + throwable.getMessage());
        };

        client.tradeStream("btcusdt", onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback);

        Thread.sleep(sleepTime);

        // Close connection for onClosingCallback and onClosedCallback examples purpose
        client.closeAllConnections();

    }
}

