package unit;

import com.binance.connector.client.utils.JSONParser;
import org.json.JSONException;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestJSONParser {
    private final String mockJson = "{\"key1\":\"value1\", \"key2\":2}";

    @Test
    public void testGetJSONStringValue() {
        assertEquals("value1", JSONParser.getJSONStringValue(mockJson, "key1"));
    }

    @Test
    public void testGetJSONIntValue() {
        assertEquals(2, JSONParser.getJSONIntValue(mockJson, "key2"));
    }

    @Test(expected = JSONException.class)
    public void testGetJSONStringValueThrowException() {
        JSONParser.getJSONStringValue(mockJson, "InvalidKey");
    }

    @Test(expected = JSONException.class)
    public void testGetJSONIntValueThrowException() {
        JSONParser.getJSONIntValue(mockJson, "InvalidKey");
    }
}
