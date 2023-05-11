package examples.spot.wallet;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

public final class SystemStatus {
    private SystemStatus() {
    }

    public static void main(String[] args) {

        SpotClient client = new SpotClientImpl();
        String result = client.createWallet().systemStatus();
        System.out.println(result);
    }
}
