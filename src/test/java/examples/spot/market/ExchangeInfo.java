package examples.spot.market;

import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.impl.spot.Market;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class ExchangeInfo {
    private ExchangeInfo() {
    }

    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl();
        Market market = client.createMarket();
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

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
