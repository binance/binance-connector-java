package unit;

import java.util.LinkedHashMap;

public final class MockData {
    private static final int intValue2 = 2;
    public static final int HTTP_STATUS_OK = 200;
    public static final int HTTP_STATUS_CLIENT_ERROR = 400;
    public static final int HTTP_STATUS_SERVER_ERROR = 502;
    public static final String PREFIX = "/";
    public static final String MOCK_RESPONSE = "{\"key_1\": \"value_1\", \"key_2\": \"value_2\"}";
    public static final String API_KEY = "apiKey";
    public static final String SECRET_KEY = "secretKey";
    public static final LinkedHashMap<String, Object> MOCK_PARAMETERS = new LinkedHashMap<String, Object>() {{
        put("key1", "value1");
        put("key2", intValue2);
    }};

    private MockData() {
    }
}
