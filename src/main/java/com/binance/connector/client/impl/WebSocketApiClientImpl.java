package com.binance.connector.client.impl;

import com.binance.connector.client.WebSocketApiClient;
import com.binance.connector.client.enums.Category;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.websocketapi.WebSocketApiAccount;
import com.binance.connector.client.impl.websocketapi.WebSocketApiAuth;
import com.binance.connector.client.impl.websocketapi.WebSocketApiGeneral;
import com.binance.connector.client.impl.websocketapi.WebSocketApiMarket;
import com.binance.connector.client.impl.websocketapi.WebSocketApiTrade;
import com.binance.connector.client.impl.websocketapi.WebSocketApiUserDataStream;
import com.binance.connector.client.utils.RequestBuilder;
import com.binance.connector.client.utils.WebSocketConnection;
import com.binance.connector.client.utils.httpclient.WebSocketApiHttpClientSingleton;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;
import com.binance.connector.client.utils.websocketapi.WebSocketApiRequestHandler;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosedCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketClosingCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketFailureCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketMessageCallback;
import com.binance.connector.client.utils.websocketcallback.WebSocketOpenCallback;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class WebSocketApiClientImpl implements WebSocketApiClient {
    private static final OkHttpClient client = WebSocketApiHttpClientSingleton.getHttpClient();
    private final SignatureGenerator signatureGenerator;
    private final String apiKey;
    private final String baseUrl;
    private final WebSocketOpenCallback noopOpenCallback = response -> { };
    private final WebSocketClosingCallback noopClosingCallback = (code, reason) -> { };
    private final WebSocketClosedCallback noopClosedCallback = (code, reason) -> { };
    private final WebSocketFailureCallback noopFailureCallback = (throwable, response) -> { };
    private WebSocketConnection connection; 
    private WebSocketApiRequestHandler requestHandler;

    public WebSocketApiClientImpl() {
        this("", null);
    }

    public WebSocketApiClientImpl(String baseUrl) {
        this("", null, baseUrl);
    }

    public WebSocketApiClientImpl(String apiKey, SignatureGenerator signatureGenerator) {
        this(apiKey, signatureGenerator, DefaultUrls.WS_API_URL);
    }

    public WebSocketApiClientImpl(String apiKey, SignatureGenerator signatureGenerator, String baseUrl) {
        this.apiKey = apiKey;
        this.signatureGenerator = signatureGenerator;
        this.baseUrl = baseUrl;
    }
    
    private void checkRequestHandler() {
        if (this.requestHandler == null) {
            throw new BinanceConnectorException("No WebSocket API connection to submit request. Please connect first.");
        }
    }

    @Override
    public void connect(WebSocketMessageCallback onMessageCallback) {
        connect(noopOpenCallback, onMessageCallback, noopClosingCallback, noopClosedCallback, noopFailureCallback);
    }

    @Override
    public void connect(WebSocketOpenCallback onOpenCallback, WebSocketMessageCallback onMessageCallback, WebSocketClosingCallback onClosingCallback, WebSocketClosedCallback onClosedCallback, WebSocketFailureCallback onFailureCallback) {
        Request request = RequestBuilder.buildWebSocketRequest(baseUrl);

        this.connection = new WebSocketConnection(onOpenCallback, onMessageCallback, onClosingCallback, onClosedCallback, onFailureCallback, request, client);
        this.requestHandler = new WebSocketApiRequestHandler(this.connection, this.apiKey, this.signatureGenerator);
        this.connection.connect();
    }

    @Override
    public void close() {
        this.connection.close();
        client.dispatcher().executorService().shutdown();
    }

    @Override
    public WebSocketApiAccount account() {
        checkRequestHandler();
        return (WebSocketApiAccount) WebSocketApiModuleFactory.build(Category.ACCOUNT, this.requestHandler);
    }

    @Override
    public WebSocketApiAuth auth() {
        checkRequestHandler();
        return (WebSocketApiAuth) WebSocketApiModuleFactory.build(Category.AUTH, this.requestHandler);
    }

    @Override
    public WebSocketApiGeneral general() {
        checkRequestHandler();
        return (WebSocketApiGeneral) WebSocketApiModuleFactory.build(Category.GENERAL, this.requestHandler);
    }

    @Override
    public WebSocketApiMarket market() {
        checkRequestHandler();
        return (WebSocketApiMarket) WebSocketApiModuleFactory.build(Category.MARKET, this.requestHandler);
    }

    @Override
    public WebSocketApiTrade trade() {
        checkRequestHandler();
        return (WebSocketApiTrade) WebSocketApiModuleFactory.build(Category.TRADE, this.requestHandler);
    }

    @Override
    public WebSocketApiUserDataStream userDataStream() {
        checkRequestHandler();
        return (WebSocketApiUserDataStream) WebSocketApiModuleFactory.build(Category.USER_DATA_STREAM, this.requestHandler);
    }

}
