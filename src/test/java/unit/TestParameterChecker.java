package unit;

import static org.junit.Assert.assertThrows;

import org.json.JSONObject;
import org.junit.Test;

import com.binance.connector.client.exceptions.BinanceConnectorException;
import com.binance.connector.client.utils.ParameterChecker;

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

    @Test
    public void testMoreThanOneAllowedParam() {
        String[] symbols = new String[]{"BTCUSDT", "BNBUSDT"};
        String[] permissions =  new String[]{"SPOT", "MARGIN"};

        JSONObject params = new JSONObject();
        params.put("symbols", symbols);
        params.put("permissions", permissions);

        assertThrows(BinanceConnectorException.class, () -> ParameterChecker.checkOnlyOneOfParameters(params, "symbols", "permissions"));
    }

    @Test
    public void testNoOneOfTheRequiredPrams() {

        // params without either one of required params (orderId or origClientOrderId)
        JSONObject params = new JSONObject();
        assertThrows(BinanceConnectorException.class, () -> ParameterChecker.checkOneOfParametersRequired(params, "orderId", "origClientOrderId"));
        // no params
        assertThrows(BinanceConnectorException.class, () -> ParameterChecker.checkOneOfParametersRequired(null, "orderId", "origClientOrderId"));

    }

}
