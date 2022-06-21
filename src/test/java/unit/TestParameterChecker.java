package unit;

import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.ParameterChecker;
import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class TestParameterChecker {

    private final String mockObject = "mockObject";
    private final String emptyString = "";


    @Test
    public void testcheckParameter() {
        ParameterChecker.checkParameter(MockData.MOCK_PARAMETERS, "key1", String.class);
        ParameterChecker.checkParameter(MockData.MOCK_PARAMETERS, "key2", Integer.class);
    }

    @Test
    public void testcheckParameterNoKey() {
        assertThrows(BinanceConnectorException.class, () -> ParameterChecker.checkRequiredParameter(MockData.MOCK_PARAMETERS, "InvalidKey"));
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
