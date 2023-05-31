package examples.websocketstream;

import java.util.ArrayList;

import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.impl.WebSocketStreamClientImpl;

public final class CombineStreams {
    private CombineStreams() {
    }

    public static void main(String[] args) throws InterruptedException {
        final long sleepTime = 3000;
        WebSocketStreamClient client = new WebSocketStreamClientImpl();

        ArrayList<String> streams = new ArrayList<>();
        streams.add("btcusdt@trade");
        streams.add("bnbusdt@trade");

        client.combineStreams(streams, ((event) -> {
            System.out.println(event);
        }));

        Thread.sleep(sleepTime);
        client.closeAllConnections();
    }
}
