package com.binance.connector.client.common.websocket.configuration;

public enum SessionMode {
    // Use session logon after opening the connection that we don't need to sign the requests
    LOGON,
    // Sign every request
    SIGNATURE,
    // No signature needed
    NOOP
}
