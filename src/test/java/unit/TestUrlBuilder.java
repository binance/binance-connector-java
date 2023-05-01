package unit;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

import org.junit.Test;

import com.binance.connector.client.utils.UrlBuilder;

public class TestUrlBuilder {
    private final String baseUrl = "www.test.com";
    private final String urlPath = "/url/path";
    private final double doubleValue = 0.0006;
    private final double extensiveDecimalsDouble = 1.123456789101112;  
    private final double highDouble = 10000.1;
    private final int intValue = 2;
    private final LinkedHashMap<String, Object> mockParameters = new LinkedHashMap<String, Object>() {{
            put("key1", "value1");
            put("key2", intValue);
            put("key3", doubleValue);
        }};
    private final LinkedHashMap<String, Object> mockDoubleParameters = new LinkedHashMap<String, Object>() {{
            put("key1", extensiveDecimalsDouble);
            put("key2", highDouble);

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
        mockParameters.put("key4", extensiveDecimalsDouble);
        mockParameters.put("key5", highDouble);
        String joinedQuery = "key1=value1&key2=2&key3=0.0006&key4=1.123456789101112&key5=10000.1";
        assertEquals(joinedQuery, UrlBuilder.joinQueryParameters(mockParameters));
    }

    @Test
    public void testJoinQueryParametersWithoutParams() {
        assertEquals("", UrlBuilder.joinQueryParameters(null));
    }

    /**
     * Tests the JoinQueryParameters with Locale.IT to see if the originated Double continues with "." instead of being changed to a ","
     * Also tests if there's no drop of 0s, add of group separator "," and limitation on decimals number.
     */
    @Test
    public void testJoinQueryParametersWithLocaleIT() {

        Locale.setDefault(new Locale("it", "IT"));

        String joinedQuery = String.format("key1=%s&key2=%s", extensiveDecimalsDouble, highDouble);
        String buildQuery = UrlBuilder.joinQueryParameters(mockDoubleParameters);
        assertEquals(joinedQuery, buildQuery);
    }

    @Test
    public void testBuildStreamUrl() {
        String streamUrl = "www.test.com?streams=stream1/stream2/stream3";
        assertEquals(streamUrl, UrlBuilder.buildStreamUrl(baseUrl, mockStreams));
    }
}
