package com.binance.connector.client.utils;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.enums.RequestType;
import com.binance.connector.client.exceptions.BinanceConnectorException;
import java.util.LinkedHashMap;
import okhttp3.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestHandler {
    private final String apiKey;
    private final SignatureGenerator signatureGenerator;
    private static final Logger logger = LoggerFactory.getLogger(RequestHandler.class);

    public RequestHandler(String apiKey) {
        this(apiKey, null);
    }

    public RequestHandler(String apiKey, SignatureGenerator signatureGenerator) {
        this.apiKey = apiKey;
        this.signatureGenerator = signatureGenerator;
    }

    /**
     * Build request based on request type and send the requests to server.
     * @param baseUrl
     * @param urlPath
     * @param signature
     * @param parameters
     * @param httpMethod
     * @param requestType
     * @return String - response from server
     */

    private String sendApiRequest(String baseUrl, String urlPath, String signature, LinkedHashMap<String, Object> parameters,
                                  HttpMethod httpMethod, RequestType requestType, boolean showLimitUsage) {
        String fullUrl = UrlBuilder.buildFullUrl(baseUrl, urlPath, parameters, signature);
        logger.info("{} {}", httpMethod, fullUrl);
        Request request;
        switch (requestType) {
            case PUBLIC:
                request = RequestBuilder.buildPublicRequest(fullUrl, httpMethod);
                break;
            case WITH_API_KEY:
            case SIGNED:
                request = RequestBuilder.buildApiKeyRequest(fullUrl, httpMethod, apiKey);
                break;
            default:
                throw new BinanceConnectorException("[RequestHandler] Invalid request type: " + requestType);
        }
        return ResponseHandler.handleResponse(request, showLimitUsage);
    }

    public String sendPublicRequest(String baseUrl, String urlPath, LinkedHashMap<String, Object> parameters,
                                    HttpMethod httpMethod, boolean showLimitUsage) {
        return sendApiRequest(baseUrl, urlPath, null, parameters, httpMethod, RequestType.PUBLIC, showLimitUsage);
    }

    public String sendWithApiKeyRequest(String baseUrl, String urlPath, LinkedHashMap<String, Object> parameters,
                                        HttpMethod httpMethod, boolean showLimitUsage) {
        if (null == apiKey || apiKey.isEmpty()) {
            throw new BinanceConnectorException("[RequestHandler] API key cannot be null or empty!");
        }
        return sendApiRequest(baseUrl, urlPath, null, parameters, httpMethod, RequestType.WITH_API_KEY, showLimitUsage);
    }

    public String sendSignedRequest(String baseUrl, String urlPath, LinkedHashMap<String, Object> parameters,
                                    HttpMethod httpMethod, boolean showLimitUsage) {
                                        
        if (signatureGenerator.getClass() == HmacSignatureGenerator.class && null == apiKey || apiKey.isEmpty()) {
            throw new BinanceConnectorException("[RequestHandler] Secret key/API key cannot be null or empty!");
        }
        if (signatureGenerator.getClass() == RsaSignatureGenerator.class && null == apiKey || apiKey.isEmpty()) {
            throw new BinanceConnectorException("[RequestHandler] Private key/API key cannot be null or empty!");
        }
        parameters.put("timestamp", UrlBuilder.buildTimestamp());
        String queryString = UrlBuilder.joinQueryParameters(parameters);
        String signature = this.signatureGenerator.getSignature(queryString);
        return sendApiRequest(baseUrl, urlPath, signature, parameters, httpMethod, RequestType.SIGNED, showLimitUsage);
    }
}
