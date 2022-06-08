package unit;

import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.ParameterChecker;
import java.util.LinkedHashMap;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class TestParameterChecker {

    private final LinkedHashMap<String,Object> mockParameters = new LinkedHashMap<String,Object>() {{
        put("key1","value1");
        put("key2",2);
    }};
    private final String mockObject = "mockObject";
    private final String emptyString = "";

    @Test
    public void testcheckParameter() {
        ParameterChecker.checkParameter(mockParameters, "key1", String.class);
        ParameterChecker.checkParameter(mockParameters, "key2", Integer.class);
    }

    @Test
    public void testcheckParameterNoKey() {
        assertThrows(BinanceConnectorException.class, () -> ParameterChecker.checkRequiredParameter(mockParameters, "InvalidKey"));
    }

    @Test
    public void testcheckParameterWrongType() {
        assertThrows(BinanceConnectorException.class, () -> ParameterChecker.checkParameterType(mockObject, Integer.class, "mockObject"));
    }

    @Test
    public void testcheckEmptyString() {
        assertThrows(BinanceConnectorException.class, () -> ParameterChecker.checkParameterType(emptyString, String.class, "mockObject"));
    }

    @Test
    public void testcheckNull() {
        assertThrows(BinanceConnectorException.class, () -> ParameterChecker.checkParameterType(null, String.class, "mockObject"));
    }

}
