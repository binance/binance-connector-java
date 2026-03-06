package com.binance.connector.client.common.websocket.configuration;

import com.binance.connector.client.common.configuration.ClientConfiguration;
import org.eclipse.jetty.client.ProxyConfiguration;
import org.eclipse.jetty.client.api.Authentication;

public class WebSocketClientConfiguration extends ClientConfiguration implements Cloneable {
    /** Base URL */
    protected String url = "wss://ws-api.binance.com:443/ws-api/v3";

    /** Proxy configuration */
    protected ProxyConfiguration.Proxy webSocketProxy;

    /** Proxy Auth configuration */
    protected Authentication webSocketProxyAuthentication;

    /** Auto LOGON or generate and send signature for each request. */
    private Boolean autoLogon = false;

    /** Interval time between reconnects, in ms */
    private Integer reconnectIntervalTime = DEFAULT_RECONNECT_INTERVAL_TIME;

    /** Use connection pool */
    private Boolean usePool = false;

    /** poolSize for the reconnect strategy */
    private Integer poolSize = DEFAULT_POOL_SIZE;

    /** batchSize for the reconnect strategy */
    private Integer reconnectBatchSize = DEFAULT_RECONNECT_BATCH_SIZE;

    /** messageMaxSize for WebSocket messages */
    private Long messageMaxSize = DEFAULT_MAX_MESSAGE_SIZE;

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    public ProxyConfiguration.Proxy getWebSocketProxy() {
        return webSocketProxy;
    }

    public void setWebSocketProxy(ProxyConfiguration.Proxy webSocketProxy) {
        this.webSocketProxy = webSocketProxy;
    }

    public Authentication getWebSocketProxyAuthentication() {
        return webSocketProxyAuthentication;
    }

    public void setWebSocketProxyAuthentication(Authentication webSocketProxyAuthentication) {
        this.webSocketProxyAuthentication = webSocketProxyAuthentication;
    }

    public Boolean getAutoLogon() {
        return autoLogon;
    }

    public void setAutoLogon(Boolean autoLogon) {
        this.autoLogon = autoLogon;
    }

    public Integer getReconnectIntervalTime() {
        return reconnectIntervalTime;
    }

    public void setReconnectIntervalTime(Integer reconnectIntervalTime) {
        this.reconnectIntervalTime = reconnectIntervalTime;
    }

    public Integer getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(Integer poolSize) {
        this.poolSize = poolSize;
    }

    public Integer getReconnectBatchSize() {
        return reconnectBatchSize;
    }

    public void setReconnectBatchSize(Integer reconnectBatchSize) {
        this.reconnectBatchSize = reconnectBatchSize;
    }

    public Boolean getUsePool() {
        return usePool;
    }

    public void setUsePool(Boolean usePool) {
        this.usePool = usePool;
    }

    public Long getMessageMaxSize() {
        return messageMaxSize;
    }

    public void setMessageMaxSize(Long messageMaxSize) {
        this.messageMaxSize = messageMaxSize;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
