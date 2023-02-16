package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

import java.util.ArrayList;

public final class CombineStreams {
    private CombineStreams() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        ArrayList<String> streams = new ArrayList<>();
        streams.add("btcusdt@trade");
        streams.add("bnbusdt@trade");

        client.combineStreams(streams, ((event) -> {
            System.out.println(event);
        }));

        client.closeAllConnections();
    }
}
