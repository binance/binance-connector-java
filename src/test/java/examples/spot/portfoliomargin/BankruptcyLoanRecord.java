package examples.spot.portfoliomargin;

import java.util.LinkedHashMap;
import java.util.Map;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.impl.SpotClientImpl;

import examples.PrivateConfig;

public final class BankruptcyLoanRecord {
    private BankruptcyLoanRecord() {
    }

    public static void main(String[] args) {
        Map<String, Object> parameters = new LinkedHashMap<>();

        SpotClient client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createPortfolioMargin().bankruptcyLoanRecord(parameters);
        System.out.println(result);
    }
}
