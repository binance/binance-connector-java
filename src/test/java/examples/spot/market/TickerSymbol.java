package examples.spot.market;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class TickerSymbol {
    private TickerSymbol() {
    }

    public static void main(String[] args) {
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);

        parameters.put("symbol", "BNBUSDT");
        String result = client.createMarket().tickerSymbol(parameters);
        System.out.println(result);
        parameters.clear();

        ArrayList<String> symbols = new ArrayList<>();
        symbols.add("BTCUSDT");
        symbols.add("BNBUSDT");
        parameters.put("symbols", symbols);
        result = client.createMarket().tickerSymbol(parameters);
        System.out.println(result);
    }
}
