package com.binance.connector.client;

import java.util.ArrayList;

import com.binance.connector.client.utils.websocketcallback.WebSocketClosedCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosingCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketFailureCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketMessageCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketOpenCallback;

public interface WebSocketStreamClient {
    int aggTradeStream(String symbol, WebSocketMessageCallback callback);
    int aggTradeStream(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int tradeStream(String symbol, WebSocketMessageCallback callback);
    int tradeStream(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int klineStream(String symbol, String interval, WebSocketMessageCallback callback);
    int klineStream(String symbol, String interval, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int miniTickerStream(String symbol, WebSocketMessageCallback callback);
    int miniTickerStream(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int allMiniTickerStream(WebSocketMessageCallback callback);
    int allMiniTickerStream(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int symbolTicker(String symbol, WebSocketMessageCallback callback);
    int symbolTicker(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int allTickerStream(WebSocketMessageCallback callback);
    int allTickerStream(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int rollingWindowTicker(String symbol, String windowSize, WebSocketMessageCallback callback);
    int rollingWindowTicker(String symbol, String windowSize, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int allRollingWindowTicker(String windowSize, WebSocketMessageCallback callback);
    int allRollingWindowTicker(String windowSize, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int bookTicker(String symbol, WebSocketMessageCallback callback);
    int bookTicker(String symbol, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int allBookTickerStream(WebSocketMessageCallback callback);
    int allBookTickerStream(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int partialDepthStream(String symbol, int levels, int speed, WebSocketMessageCallback callback);
    int partialDepthStream(String symbol, int levels, int speed, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int diffDepthStream(String symbol, int speed, WebSocketMessageCallback callback);
    int diffDepthStream(String symbol, int speed, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int listenUserStream(String listenKey, WebSocketMessageCallback callback);
    int listenUserStream(String listenKey, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    int combineStreams(ArrayList<String> streams, WebSocketMessageCallback callback);
    int combineStreams(ArrayList<String> streams, WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    void closeConnection(int streamId);
    void closeAllConnections();
}
