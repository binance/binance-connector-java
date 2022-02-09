package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;
import com.binance.connector.client.utils.WebSocketCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TradeStreamWithAllCallbacks {

    private static final Logger logger = LoggerFactory.getLogger(TradeStreamWithAllCallbacks.class);

    private static volatile boolean isTradeStreamUp = false;
    private static WebSocketCallback onOpenCallback;
    private static WebSocketCallback onMessageCallback;
    private static WebSocketCallback onClosingCallback;
    private static WebSocketCallback onFailureCallback;

    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        onOpenCallback = openEvent -> {
            isTradeStreamUp = true;
        };
        onMessageCallback = (message) -> {
            System.out.println(message);
        };
        onClosingCallback = closingEvent -> {
            isTradeStreamUp = false;
            connectToTradeStream(client, onOpenCallback, onMessageCallback, onClosingCallback, onClosingCallback);
        };
        onFailureCallback = failureEvent -> {
            isTradeStreamUp = false;
            connectToTradeStream(client, onOpenCallback, onMessageCallback, onClosingCallback, onClosingCallback);
        };
        connectToTradeStream(client, onOpenCallback, onMessageCallback, onClosingCallback, onFailureCallback);
    }

    private static void connectToTradeStream(
            WebsocketClientImpl client,
            WebSocketCallback onOpenCallback,
            WebSocketCallback onMessageCallback,
            WebSocketCallback onClosingCallback,
            WebSocketCallback onFailureCallback) {
        client.tradeStream("btcusdt", onOpenCallback, onMessageCallback, onClosingCallback, onFailureCallback);
    }
}
