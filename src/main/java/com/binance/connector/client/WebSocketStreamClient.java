package com.binance.connector.client;

import java.util.ArrayList;

import com.binance.connector.client.utils.WebSocketCallback;

public interface WebSocketStreamClient {
    int aggTradeStream(String symbol, WebSocketCallback callback);
    int aggTradeStream(String symbol, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int tradeStream(String symbol, WebSocketCallback callback);
    int tradeStream(String symbol, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int klineStream(String symbol, String interval, WebSocketCallback callback);
    int klineStream(String symbol, String interval, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int miniTickerStream(String symbol, WebSocketCallback callback);
    int miniTickerStream(String symbol, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int allMiniTickerStream(WebSocketCallback callback);
    int allMiniTickerStream(WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int symbolTicker(String symbol, WebSocketCallback callback);
    int symbolTicker(String symbol, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int allTickerStream(WebSocketCallback callback);
    int allTickerStream(WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int rollingWindowTicker(String symbol, String windowSize, WebSocketCallback callback);
    int rollingWindowTicker(String symbol, String windowSize, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int allRollingWindowTicker(String windowSize, WebSocketCallback callback);
    int allRollingWindowTicker(String windowSize, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int bookTicker(String symbol, WebSocketCallback callback);
    int bookTicker(String symbol, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int partialDepthStream(String symbol, int levels, int speed, WebSocketCallback callback);
    int partialDepthStream(String symbol, int levels, int speed, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int diffDepthStream(String symbol, int speed, WebSocketCallback callback);
    int diffDepthStream(String symbol, int speed, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int listenUserStream(String listenKey, WebSocketCallback callback);
    int listenUserStream(String listenKey, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    int combineStreams(ArrayList<String> streams, WebSocketCallback callback);
    int combineStreams(ArrayList<String> streams, WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    void closeConnection(int streamId);
    void closeAllConnections();
}
