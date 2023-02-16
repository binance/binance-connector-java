package examples.spot.bswap;

import com.binance.connector.client.impl.SpotClientImpl;
import examples.PrivateConfig;

public final class SwapPools {
    private SwapPools() {
    }

    public static void main(String[] args) {
        SpotClientImpl client = new SpotClientImpl(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY);
        String result = client.createBswap().swapPools();
        System.out.println(result);
    }
}
