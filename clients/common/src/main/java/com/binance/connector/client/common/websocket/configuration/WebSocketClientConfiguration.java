package com.binance.connector.client.common.websocket.configuration;

import com.binance.connector.client.common.configuration.ClientConfiguration;
import org.eclipse.jetty.client.ProxyConfiguration;

public class WebSocketClientConfiguration extends ClientConfiguration {
    /** Base URL */
    protected String url = "wss://ws-api.binance.com:443/ws-api/v3";

    /** Proxy configuration */
    protected ProxyConfiguration.Proxy proxy;

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

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    public ProxyConfiguration.Proxy getWebSocketProxy() {
        return proxy;
    }

    public void setProxy(ProxyConfiguration.Proxy proxy) {
        this.proxy = proxy;
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
}
