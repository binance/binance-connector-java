package examples;

public final class PrivateConfig {
    private PrivateConfig() {
    }

    public static final String API_KEY = System.getenv("BINANCE_API_KEY");
    public static final String SECRET_KEY = System.getenv("BINANCE_SECRET_KEY");
    public static final String BASE_URL = "https://testnet.binance.vision";
    public static final String TESTNET_API_KEY = System.getenv("BINANCE_TESTNET_API_KEY");
    public static final String TESTNET_SECRET_KEY = System.getenv("BINANCE_TESTNET_SECRET_KEY");

}
