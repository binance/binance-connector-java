package com.binance.connector.client;

import com.binance.connector.client.impl.websocketapi.WebSocketApiAccount;
import com.binance.connector.client.impl.websocketapi.WebSocketApiGeneral;
import com.binance.connector.client.impl.websocketapi.WebSocketApiMarket;
import com.binance.connector.client.impl.websocketapi.WebSocketApiTrade;
import com.binance.connector.client.impl.websocketapi.WebSocketApiUserDataStream;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosedCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosingCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketFailureCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketMessageCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketOpenCallback;

public interface WebSocketApiClient {
    void connect(WebSocketMessageCallback onMessageCallback);
    void connect(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback);
    void close();
    WebSocketApiGeneral general();
    WebSocketApiMarket market();
    WebSocketApiTrade trade();
    WebSocketApiAccount account();
    WebSocketApiUserDataStream userDataStream();
}
