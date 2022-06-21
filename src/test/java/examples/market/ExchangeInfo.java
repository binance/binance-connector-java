package examples.market;

import com.binance.connector.client.impl.SpotClientImpl;
import com.binance.connector.client.impl.spot.Market;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ExchangeInfo {
    private ExchangeInfo() {
    }

    private static final Logger logger = LoggerFactory.getLogger(ExchangeInfo.class);
    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl();
        Market market = client.createMarket();
        LinkedHashMap<String, Object> parameters = new LinkedHashMap<>();

        String result = market.exchangeInfo(parameters);
        logger.info(result);

        parameters.put("symbol", "BTCUSDT");
        result = market.exchangeInfo(parameters);
        logger.info(result);
        parameters.clear();

        ArrayList<String> symbols = new ArrayList<>();
        symbols.add("BTCUSDT");
        symbols.add("BNBUSDT");
        parameters.put("symbols", symbols);
        result = market.exchangeInfo(parameters);
        logger.info(result);
    }

}
