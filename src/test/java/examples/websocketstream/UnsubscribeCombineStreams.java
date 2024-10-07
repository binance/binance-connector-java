package examples.websocketstream;

import com.binance.connector.client.WebSocketStreamClient;
import com.binance.connector.client.impl.WebSocketStreamClientImpl;
import java.util.ArrayList;

public final class UnsubscribeCombineStreams {
    private UnsubscribeCombineStreams() {
    }

    public static void main(String[] args) throws InterruptedException {
        final long sleepTime = 3000;
        WebSocketStreamClient client = new WebSocketStreamClientImpl();

        ArrayList<String> streams = new ArrayList<>();
        streams.add("btcusdt@trade");
        streams.add("bnbusdt@trade");

        int connectionId = client.combineStreams(streams, ((event) -> {
            System.out.println(event);
        }));

        client.unsubscribeCombineStreams(streams, connectionId);

        Thread.sleep(sleepTime);
        client.closeAllConnections();
    }
}
