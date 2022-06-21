package unit;

import com.binance.connector.client.utils.UrlBuilder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestUrlBuilder {
    private final String baseUrl = "www.test.com";
    private final String urlPath = "/url/path";
    private final double key3 = 0.0006;
    private final double key4 = 0.000000000000000000001;
    private final int value2 = 2;
    private final LinkedHashMap<String, Object> mockParameters = new LinkedHashMap<String, Object>() {{
        put("key1", "value1");
        put("key2", value2);
        put("key3", key3);
    }};
    private final ArrayList<String> mockStreams = new ArrayList<String>() {{
        add("stream1");
        add("stream2");
        add("stream3");
    }};


    @Test
    public void testBuildFullUrl() {
        String fullUrl = "www.test.com/url/path?key1=value1&key2=2&key3=0.0006";
        assertEquals(fullUrl, UrlBuilder.buildFullUrl(baseUrl, urlPath, mockParameters, null));
    }

    @Test
    public void testBuildFullUrlWithoutParams() {
        assertEquals(baseUrl + urlPath, UrlBuilder.buildFullUrl(baseUrl, urlPath, null, null));
    }

    @Test
    public void testJoinQueryParameters() {
        String joinedQuery = "key1=value1&key2=2&key3=0.0006";
        assertEquals(joinedQuery, UrlBuilder.joinQueryParameters(mockParameters));
    }

    @Test
    public void testJoinLargeQueryParameters() {
        mockParameters.put("key4", key4);
        String joinedQuery = "key1=value1&key2=2&key3=0.0006&key4=0.000000000000000000001";
        assertEquals(joinedQuery, UrlBuilder.joinQueryParameters(mockParameters));
    }

    @Test
    public void testJoinQueryParametersWithoutParams() {
        assertEquals("", UrlBuilder.joinQueryParameters(null));
    }

    @Test
    public void testBuildStreamUrl() {
        String streamUrl = "www.test.com?streams=stream1/stream2/stream3";
        assertEquals(streamUrl, UrlBuilder.buildStreamUrl(baseUrl, mockStreams));
    }
}
