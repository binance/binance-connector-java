package unit;

import com.binance.connector.client.utils.JSONParser;
import org.json.JSONException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

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

    @Test
    public void testGetJSONStringValueThrowException() {
        assertThrows(JSONException.class, () -> JSONParser.getJSONStringValue(mockJson, "InvalidKey"));
    }

    @Test
    public void testGetJSONIntValueThrowException() {
        assertThrows(JSONException.class, () -> JSONParser.getJSONIntValue(mockJson, "InvalidKey"));
    }
}
