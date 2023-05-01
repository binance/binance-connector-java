package examples.spot.savings;

import java.util.LinkedHashMap;

import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class PurchaseProject {
    private PurchaseProject() {
    }
    private static final long lot = 1L;

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();
        parameters.put("projectId", "TKO001");
        parameters.put("lot", lot);

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createSavings().purchaseProject(parameters);
        System.out.println(result);
    }
}
