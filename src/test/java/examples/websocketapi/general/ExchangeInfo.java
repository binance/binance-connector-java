package examples.websocketapi.general;

import com.binance.connector.client.impl.WebsocketApiClientImpl;
import org.json.JSONObject;

public final class ExchangeInfo {

    private ExchangeInfo() {
    }

    private static final int waitTime = 3000;

    public static void main(String[] args) throws InterruptedException {
        WebsocketApiClientImpl client = new WebsocketApiClientImpl();
        client.connect(((event) -> {
            System.out.println(event + '\n');
        }));

        // empty params
        JSONObject params = new JSONObject();
        client.general().exchangeInfo(params);
        Thread.sleep(waitTime);

        // one symbol
        params.put("symbol", "ETHRUB");
        client.general().exchangeInfo(params);
        Thread.sleep(waitTime);

        // multiple symbols
        params.clear();
        String[] symbols = new String[]{"BTCUSDT", "BNBUSDT"};
        params.put("symbols", symbols);
        client.general().exchangeInfo(params);
        Thread.sleep(waitTime);

        // specific permissions
        params.clear();
        String[] permissions = new String[]{"SPOT", "MARGIN"};
        params.put("permissions", permissions);
        client.general().exchangeInfo(params);

        Thread.sleep(waitTime);
        client.close();
    }
}
