package com.binance.connector.client;

import com.binance.connector.client.impl.websocketapi.WebSocketApiAccount;
import com.binance.connector.client.impl.websocketapi.WebSocketApiGeneral;
import com.binance.connector.client.impl.websocketapi.WebSocketApiMarket;
import com.binance.connector.client.impl.websocketapi.WebSocketApiTrade;
import com.binance.connector.client.impl.websocketapi.WebSocketApiUserDataStream;
import com.binance.connector.client.utils.WebSocketCallback;

public interface WebSocketApiClient {
    void connect(WebSocketCallback onMessageCallback);
    void connect(WebSocketCallback onOpenCallback, WebSocketCallback onMessageCallback, WebSocketCallback onClosingCallback, WebSocketCallback onFailureCallback);
    void close();
    WebSocketApiGeneral general();
    WebSocketApiMarket market();
    WebSocketApiTrade trade();
    WebSocketApiAccount account();
    WebSocketApiUserDataStream userDataStream();
}
