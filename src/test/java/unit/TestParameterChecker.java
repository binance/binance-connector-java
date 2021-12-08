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

    @Test
    public void testcheckParameter() {
        ParameterChecker.checkParameter(mockParameters, "key1", String.class);
        ParameterChecker.checkParameter(mockParameters, "key2", Integer.class);
    }

    @Test(expected = BinanceConnectorException.class)
    public void testcheckParameterNoKey() {
        ParameterChecker.checkParameter(mockParameters, "InvalidKey", String.class);
    }

    @Test(expected = BinanceConnectorException.class)
    public void testcheckParameterWrongType() {
        ParameterChecker.checkParameter(mockParameters, "key1", Integer.class);
    }

}
