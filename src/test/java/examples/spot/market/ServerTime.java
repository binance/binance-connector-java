package examples.spot.market;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

public final class ServerTime {
    private ServerTime() {
    }

    public static void main(String[] args) {

        SpotClient client = new SpotClientImpl();
        String result = client.createMarket().time();
        System.out.println(result);
    }
}
