package com.binance.connector.client.common.websocket;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

public class SignatureUtil {

    private static final int DIFF_TILL_POSITION_INDEX = 1;
    private static final int MAX_DECIMAL_DIGITS = 30;
    private static DecimalFormat df;

    public String buildSignature(String secretKey, Map<String, Object> params) {
        // Setup authentications (key: authentication name, value: authentication).
        HmacSignatureGenerator generator = new HmacSignatureGenerator(secretKey);
        StringBuilder stringBuilder = joinQueryParameters(new StringBuilder(), params);
        return generator.getSignature(stringBuilder.toString());
    }

    public static StringBuilder joinQueryParameters(StringBuilder sb, Map<String, Object> params) {
        if (params != null && !params.isEmpty()) {
            Iterator<String> keys = params.keySet().iterator();
            while (keys.hasNext()) {
                String key = keys.next();
                sb.append(key);
                sb.append("=");

                String value;
                if (params.get(key) instanceof Double) {
                    value = getFormatter().format(params.get(key));
                } else if (params.get(key) instanceof List) {
                    List list = (List) params.get(key);
                    value =
                            (String)
                                    list.stream()
                                            .map(Object::toString)
                                            .collect(Collectors.joining(","));
                } else {
                    value = params.get(key).toString();
                }
                sb.append(urlEncode(value));

                sb.append("&");
            }
            sb.deleteCharAt(sb.length() - DIFF_TILL_POSITION_INDEX);
        }
        return sb;
    }

    private static DecimalFormat getFormatter() {
        if (null == df) {
            // Overrides the default Locale
            DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ENGLISH);
            df = new DecimalFormat("#,##0.###", symbols);
            df.setMaximumFractionDigits(MAX_DECIMAL_DIGITS);
            df.setGroupingUsed(false);
        }
        return df;
    }

    public static String urlEncode(String s) {
        return URLEncoder.encode(s, StandardCharsets.UTF_8);
    }

    public void buildSignature(String apiKey, String secretKey, HashMap<String, String> params) {
        String timestamp = buildTimestamp();
        // Setup authentications (key: authentication name, value: authentication).
        params.put("X-MBX-APIKEY", apiKey);
        HmacSignatureGenerator generator = new HmacSignatureGenerator(secretKey);
        params.put("timestamp", timestamp);
        params.put("signature", generator.getSignature("timestamp=" + timestamp));
    }

    public String buildTimestamp() {
        return String.valueOf(System.currentTimeMillis());
    }
}
