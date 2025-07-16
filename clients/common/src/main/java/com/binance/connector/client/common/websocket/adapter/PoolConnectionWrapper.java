package com.binance.connector.client.common.websocket.adapter;

import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.ApiRequestWrapperDTO;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.google.gson.Gson;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.BlockingQueue;

public class PoolConnectionWrapper implements ConnectionInterface {
    private final LinkedList<ConnectionWrapper> connectionList = new LinkedList<>();
    private ListIterator<ConnectionWrapper> pool;

    private boolean isConnected = false;

    private String userAgent =
            String.format(
                    "binance-connector-java/1.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    public PoolConnectionWrapper(WebSocketClientConfiguration clientConfiguration) {
        this(clientConfiguration, null);
    }

    public PoolConnectionWrapper(WebSocketClientConfiguration clientConfiguration, Gson gson) {
        Integer poolSize = clientConfiguration.getPoolSize();
        Integer batchSize = clientConfiguration.getReconnectBatchSize();
        Integer reconnectAfter = clientConfiguration.getReconnectIntervalTime();
        for (int i = 0; i < poolSize; i++) {
            ConnectionWrapper connectionWrapper = new ConnectionWrapper(clientConfiguration, gson);
            connectionList.add(connectionWrapper);
        }

        // Scheduler to reconnect by batch every 23h (configurable)
        new Timer()
                .scheduleAtFixedRate(
                        new TimerTask() {
                            @Override
                            public void run() {
                                try {
                                    for (int i = 0; i < batchSize; i++) {
                                        int currentBatchSize = (poolSize / batchSize);
                                        if (i == batchSize - 1) {
                                            currentBatchSize += poolSize % batchSize;
                                        }
                                        for (int j = 0; j < currentBatchSize; j++) {
                                            int connectionIndex = ((poolSize / batchSize) * i) + j;
                                            ConnectionWrapper connectionWrapper =
                                                    connectionList.get(connectionIndex);
                                            if (connectionWrapper.canReconnect()) {
                                                connectionWrapper.connect();
                                            } else {
                                                connectionWrapper.setPendingReconnect(true);
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        },
                        reconnectAfter,
                        reconnectAfter);

        pool = connectionList.listIterator();
    }

    @Override
    public void connect() {
        for (ConnectionWrapper connectionWrapper : connectionList) {
            connectionWrapper.setUserAgent(userAgent);
            connectionWrapper.connect();
        }
        isConnected = true;
    }

    @Override
    public void send(ApiRequestWrapperDTO request) throws InterruptedException {
        getConnection().send(request);
    }

    public void send(RequestWrapperDTO request) throws InterruptedException {
        getConnection().send(request);
    }

    @Override
    public BlockingQueue<String> sendForStream(ApiRequestWrapperDTO request)
            throws InterruptedException {
        return getConnection().sendForStream(request);
    }

    /**
     * @return the next connection from the pool, using round-robin
     */
    public ConnectionWrapper getConnection() {
        if (!pool.hasNext()) {
            pool = connectionList.listIterator();
        }
        ConnectionWrapper connection = pool.next();
        while (!connection.isReady()) {
            if (!pool.hasNext()) {
                pool = connectionList.listIterator();
            } else {
                connection = pool.next();
            }
        }

        return connection;
    }

    @Override
    public void setUserAgent(String userAgent) {}

    @Override
    public boolean isConnected() {
        return isConnected;
    }
}
