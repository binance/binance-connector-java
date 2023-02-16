package examples.websocketstream;

import com.binance.connector.client.impl.WebsocketStreamClientImpl;

public final class AggTradeStream {
    private AggTradeStream() {
    }

    public static void main(String[] args) {
        WebsocketStreamClientImpl client = new WebsocketStreamClientImpl();
        int streamId1 = client.aggTradeStream("btcusdt", ((event) -> {
            System.out.println(event);
        }));
        int streamId2 = client.aggTradeStream("ethusdt", ((event) -> {
            System.out.println(event);
        }));
        client.closeConnection(streamId1);
        client.closeConnection(streamId2);
    }
}
