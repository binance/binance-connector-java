package examples.websocketapi.market;

import org.json.JSONObject;

import com.binance.connector.client.impl.WebsocketApiClientImpl;

public final class TickerBook {

    private TickerBook() {
    }

    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        WebsocketApiClientImpl client = new WebsocketApiClientImpl();
        client.connect(((event) -> {
            System.out.println(event);
        }));

        JSONObject params = new JSONObject();
        String[] symbols = new String[]{"BTCUSDT", "BNBUSDT"};

        params.put("symbols", symbols);
        client.market().tickerBook(params);

        Thread.sleep(waitTime);
        client.close();

    }
}
