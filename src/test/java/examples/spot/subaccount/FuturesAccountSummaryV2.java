package examples.spot.subaccount;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;
import java.util.LinkedHashMap;

public final class FuturesAccountSummaryV2 {
    private FuturesAccountSummaryV2() {
    }
    private static final int futuresType = 1;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("futuresType", futuresType);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSubAccount().futuresAccountSummaryV2(parameters);
        System.out.println(result);
    }
}
