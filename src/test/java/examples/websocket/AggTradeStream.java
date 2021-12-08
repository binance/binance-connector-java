package examples.websocket;

import com.binance.connector.client.impl.WebsocketClientImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AggTradeStream {
    private static final Logger logger = LoggerFactory.getLogger(AggTradeStream.class);
    public static void main(String[] args) {
        WebsocketClientImpl client = new WebsocketClientImpl();
        int streamId1 = client.aggTradeStream("btcusdt",((event) -> {
            System.out.println(event);
        }));
        int streamId2 = client.aggTradeStream("ethusdt",((event) -> {
            System.out.println(event);
        }));
        client.closeConnection(streamId1);
        client.closeConnection(streamId2);
    }
}
