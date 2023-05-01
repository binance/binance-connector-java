package examples.websocketapi.market;

import org.json.JSONObject;

import com.binance.connector.client.impl.WebSocketApiClientImpl;

public final class Ticker {

    private Ticker() {
    }

    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        WebSocketApiClientImpl client = new WebSocketApiClientImpl();
        client.connect(((event) -> {
            System.out.println(event);
        }));

        JSONObject params = new JSONObject();
        String[] symbols = new String[]{"BTCUSDT", "BNBUSDT"};

        params.put("symbols", symbols);
        client.market().ticker(params);

        Thread.sleep(waitTime);
        client.close();

    }
}
