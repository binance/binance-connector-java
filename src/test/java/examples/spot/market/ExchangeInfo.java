package examples.spot.market;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.impl.spot.Market;

public final class ExchangeInfo {
    private ExchangeInfo() {
    }

    public static void main(String[] args) {
        SpotClient client = new SpotClientImpl();
        Market market = client.createMarket();
        Map<String, Object> parameters = new LinkedHashMap<>();

        String result = market.exchangeInfo(parameters);
        System.out.println(result);

        parameters.put("symbol", "BTCUSDT");
        result = market.exchangeInfo(parameters);
        System.out.println(result);
        parameters.clear();

        ArrayList<String> symbols = new ArrayList<>();
        symbols.add("BTCUSDT");
        symbols.add("BNBUSDT");
        parameters.put("symbols", symbols);
        result = market.exchangeInfo(parameters);
        System.out.println(result);
        parameters.clear();

        ArrayList<String> permissions = new ArrayList<>();
        permissions.add("SPOT");
        permissions.add("MARGIN");
        parameters.put("permissions", permissions);
        result = market.exchangeInfo(parameters);
        System.out.println(result);
    }

}
