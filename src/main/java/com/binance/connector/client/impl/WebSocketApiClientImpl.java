package com.binance.connector.client.impl;

import com.binance.connector.client.WebSocketApiClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.websocketapi.WebSocketApiAccount;
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
    private WebSocketApiGeneral wsApiGeneral;
    private WebSocketApiMarket wsApiMarket;
    private WebSocketApiTrade wsApiTrade;
    private WebSocketApiAccount wsApiAccount;
    private WebSocketApiUserDataStream wsApiUserDataStream;

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

    private void checkCategoryInstance(Object categoryInstance, Class<?> categoryClass) {
        if (categoryInstance == null) {
            if (categoryClass == WebSocketApiGeneral.class) {
                this.wsApiGeneral = new WebSocketApiGeneral(this.requestHandler);
            } else if (categoryClass == WebSocketApiMarket.class) {
                this.wsApiMarket = new WebSocketApiMarket(this.requestHandler);
            } else if (categoryClass == WebSocketApiTrade.class) {
                this.wsApiTrade = new WebSocketApiTrade(this.requestHandler);
            } else if (categoryClass == WebSocketApiAccount.class) {
                this.wsApiAccount = new WebSocketApiAccount(this.requestHandler);
            } else if (categoryClass == WebSocketApiUserDataStream.class) {
                this.wsApiUserDataStream = new WebSocketApiUserDataStream(this.requestHandler);
            }
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
    public WebSocketApiGeneral general() {
        checkRequestHandler();
        checkCategoryInstance(this.wsApiGeneral, WebSocketApiGeneral.class);
        return this.wsApiGeneral;
    }

    @Override
    public WebSocketApiMarket market() {
        checkRequestHandler();
        checkCategoryInstance(this.wsApiMarket, WebSocketApiMarket.class);
        return this.wsApiMarket;
    }

    @Override
    public WebSocketApiTrade trade() {
        checkRequestHandler();
        checkCategoryInstance(this.wsApiTrade, WebSocketApiTrade.class);
        return this.wsApiTrade;
    }

    @Override
    public WebSocketApiAccount account() {
        checkRequestHandler();
        checkCategoryInstance(this.wsApiAccount, WebSocketApiAccount.class);
        return this.wsApiAccount;
    }

    @Override
    public WebSocketApiUserDataStream userDataStream() {
        checkRequestHandler();
        checkCategoryInstance(this.wsApiUserDataStream, WebSocketApiUserDataStream.class);
        return this.wsApiUserDataStream;
    }

}
