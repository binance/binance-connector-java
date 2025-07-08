package com.binance.connector.client.common.configuration;

import com.binance.connector.client.common.dtos.TimeUnit;
import java.net.Proxy;
import java.util.Map;

import okhttp3.Authenticator;
import okhttp3.CertificatePinner;

public class ClientConfiguration {
    public static final int DEFAULT_RECONNECT_INTERVAL_TIME = (23 * 60 * 60 * 1000);
    public static final int DEFAULT_POOL_SIZE = 10;
    public static final int DEFAULT_RECONNECT_BATCH_SIZE = 2;
    public static final int DEFAULT_RETRIES = 3;
    public static final int DEFAULT_BACKOFF = 200;
    public static final int DEFAULT_CONNECT_TIMEOUT = 1000;
    public static final int DEFAULT_READ_TIMEOUT = 5000;
    public static final long DEFAULT_MAX_MESSAGE_SIZE = 65536L;

    /** Base URL */
    protected String url = "https://api.binance.com";

    /** Proxy configuration */
    protected Proxy proxy;

    /** Proxy Auth configuration */
    protected Authenticator proxyAuthenticator;

    /** Certificate Pinner configuration */
    protected CertificatePinner certificatePinner;

    /** Signature configuration for signed requests */
    private SignatureConfiguration signatureConfiguration;

    /** Enable compression on request body */
    private Boolean compression = true;

    /** number of retries in case of error */
    private Integer retries = DEFAULT_RETRIES;

    /** delay between retries, in ms */
    private Integer backOff = DEFAULT_BACKOFF;

    /** connect timeout, in ms */
    private Integer connectTimeout = DEFAULT_CONNECT_TIMEOUT;

    /** read timeout, in ms */
    private Integer readTimeout = DEFAULT_READ_TIMEOUT;

    /** timeunit to be returned by APIs, default MILLISECOND */
    private TimeUnit timeUnit;

    /** custom headers to be added to each request */
    private Map<String, String> customHeaders;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public Authenticator getProxyAuthenticator() {
        return proxyAuthenticator;
    }

    public void setProxyAuthenticator(Authenticator proxyAuthenticator) {
        this.proxyAuthenticator = proxyAuthenticator;
    }

    public CertificatePinner getCertificatePinner() {
        return certificatePinner;
    }

    public void setCertificatePinner(CertificatePinner certificatePinner) {
        this.certificatePinner = certificatePinner;
    }

    public SignatureConfiguration getSignatureConfiguration() {
        return signatureConfiguration;
    }

    public void setSignatureConfiguration(SignatureConfiguration signatureConfiguration) {
        this.signatureConfiguration = signatureConfiguration;
    }

    public Boolean getCompression() {
        return compression;
    }

    public void setCompression(Boolean compression) {
        this.compression = compression;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public Integer getBackOff() {
        return backOff;
    }

    public void setBackOff(Integer backOff) {
        this.backOff = backOff;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Map<String, String> getCustomHeaders() {
        return customHeaders;
    }

    public void setCustomHeaders(Map<String, String> customHeaders) {
        this.customHeaders = customHeaders;
    }
}
