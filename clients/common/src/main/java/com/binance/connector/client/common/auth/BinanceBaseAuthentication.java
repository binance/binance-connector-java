package com.binance.connector.client.common.auth;

import com.binance.connector.client.common.Pair;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

public abstract class BinanceBaseAuthentication implements Authentication {

    private static final int DIFF_TILL_POSITION_INDEX = 1;

    /**
     * Joins query parameters from a Map into a String representation.
     *
     * @param params The Map containing the query parameters.
     * @return The String representation of the joined query parameters.
     */
    public String joinQueryParameters(List<Pair> params) {
        return joinQueryParameters(new StringBuilder(), params).toString();
    }

    /**
     * Joins query parameters from a Map into a StringBuilder representation.
     *
     * @param sb The StringBuilder to append the query parameters to.
     * @param params The Map containing the query parameters.
     * @return The StringBuilder representation of the joined query parameters.
     */
    public StringBuilder joinQueryParameters(StringBuilder sb, List<Pair> params) {
        if (params != null && !params.isEmpty()) {
            for (Pair param : params) {
                String key = param.getName();
                String value = param.getValue();
                sb.append(key);
                sb.append("=");
                sb.append(URLEncoder.encode(value, StandardCharsets.UTF_8));
                sb.append("&");
            }
            sb.deleteCharAt(sb.length() - DIFF_TILL_POSITION_INDEX);
        }

        return sb;
    }

    public String buildTimestamp() {
        return String.valueOf(System.currentTimeMillis());
    }
}
