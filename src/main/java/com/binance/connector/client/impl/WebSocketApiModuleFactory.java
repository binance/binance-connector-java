package com.binance.connector.client.impl;

import com.binance.connector.client.enums.Category;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.impl.websocketapi.WebSocketApiAccount;
import com.binance.connector.client.impl.websocketapi.WebSocketApiAuth;
import com.binance.connector.client.impl.websocketapi.WebSocketApiGeneral;
import com.binance.connector.client.impl.websocketapi.WebSocketApiMarket;
import com.binance.connector.client.impl.websocketapi.WebSocketApiModule;
import com.binance.connector.client.impl.websocketapi.WebSocketApiTrade;
import com.binance.connector.client.impl.websocketapi.WebSocketApiUserDataStream;
import com.binance.connector.client.utils.websocketapi.WebSocketApiRequestHandler;

public final class WebSocketApiModuleFactory {
    
    private static WebSocketApiAccount wsApiAccount;
    private static WebSocketApiAuth wsApiAuth;
    private static WebSocketApiGeneral wsApiGeneral;
    private static WebSocketApiMarket wsApiMarket;
    private static WebSocketApiTrade wsApiTrade;
    private static WebSocketApiUserDataStream wsApiUserDataStream;

    private WebSocketApiModuleFactory() {
        // Private constructor to prevent instantiation
    }

    private interface ModuleCreator {
        WebSocketApiModule create();
    }

    private static WebSocketApiModule obtainModule(WebSocketApiModule module, ModuleCreator creator) {
        if (module == null) {
            module = creator.create();
        }
        return module;
    }

    /**
     * Build WebSocketApiModule for the given WebSocket API category if it does not exist yet.
     * Otherwise, return the existing one.
     * 
     * @param category WebSocket API Category
     * @param requestHandler WebSocketApiRequestHandler
     * @return WebSocketApiModule
     */
    public static WebSocketApiModule build(Category category, WebSocketApiRequestHandler requestHandler) {
        switch (category) {
            case ACCOUNT:
                return obtainModule(wsApiAccount, () -> new WebSocketApiAccount(requestHandler));
            case AUTH:
                return obtainModule(wsApiAuth, () -> new WebSocketApiAuth(requestHandler));
            case GENERAL:
                return obtainModule(wsApiGeneral, () -> new WebSocketApiGeneral(requestHandler));
            case MARKET:
                return obtainModule(wsApiMarket, () -> new WebSocketApiMarket(requestHandler));
            case TRADE:
                return obtainModule(wsApiTrade, () -> new WebSocketApiTrade(requestHandler));
            case USER_DATA_STREAM:
                return obtainModule(wsApiUserDataStream, () -> new WebSocketApiUserDataStream(requestHandler));
            default:
                throw new BinanceConnectorException("Unknown WebSocket API Category: " + category);
        }
    }

}