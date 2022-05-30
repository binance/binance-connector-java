package unit;

import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.ParameterChecker;
import java.util.LinkedHashMap;
import org.junit.Test;

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

    @Test(expected = BinanceConnectorException.class)
    public void testcheckParameterNoKey() {
        ParameterChecker.checkRequiredParameter(mockParameters, "InvalidKey");
    }

    @Test(expected = BinanceConnectorException.class)
    public void testcheckParameterWrongType() {
        ParameterChecker.checkParameterType(mockObject, Integer.class, "mockObject");
    }

    @Test(expected = BinanceConnectorException.class)
    public void testcheckEmptyString() {
        ParameterChecker.checkParameterType(emptyString, String.class, "mockObject");
    }

    @Test(expected = BinanceConnectorException.class)
    public void testcheckNull() {
        ParameterChecker.checkParameterType(null, String.class, "mockObject");
    }

}
