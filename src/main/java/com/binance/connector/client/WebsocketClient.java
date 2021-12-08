package com.binance.connector.client;

import com.binance.connector.client.utils.WebSocketCallback;
import java.util.ArrayList;

public interface WebsocketClient {
    int aggTradeStream(String symbol, WebSocketCallback callback);
    int tradeStream(String symbol, WebSocketCallback callback);
    int klineStream(String symbol, String interval, WebSocketCallback callback);
    int miniTickerStream(String symbol, WebSocketCallback callback);
    int allMiniTickerStream(WebSocketCallback callback);
    int symbolTicker(String symbol, WebSocketCallback callback);
    int allTickerStream(WebSocketCallback callback);
    int bookTicker(String symbol, WebSocketCallback callback);
    int allBookTickerStream(WebSocketCallback callback);
    int partialDepthStream(String symbol, int levels, int speed, WebSocketCallback callback);
    int diffDepthStream(String symbol, int speed, WebSocketCallback callback);
    int listenUserStream(String listenKey, WebSocketCallback callback);
    int combineStreams(ArrayList<String> streams, WebSocketCallback callback);
    void closeConnection(int streamId);
    void closeAllConnections();
}
