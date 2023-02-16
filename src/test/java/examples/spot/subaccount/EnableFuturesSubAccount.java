package examples.spot.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class EnableFuturesSubAccount {
    private EnableFuturesSubAccount() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("email", "another_virtual@q6c1dsmxnoemail.com");

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().enableFutures(parameters);
        System.out.println(result);
    }
}
