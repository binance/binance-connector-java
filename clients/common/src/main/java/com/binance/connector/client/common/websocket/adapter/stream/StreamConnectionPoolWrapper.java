package com.binance.connector.client.common.websocket.adapter.stream;

import com.binance.connector.client.common.SystemUtil;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueue;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.google.gson.Gson;

import java.util.*;

public class StreamConnectionPoolWrapper implements StreamConnectionInterface {
    private final LinkedList<StreamConnectionInterface> connectionList = new LinkedList<>();
    private final Map<String, StreamConnectionInterface> connectionStreamMap = new HashMap<>();
    private ListIterator<StreamConnectionInterface> pool;
    private Boolean isConnected = false;
    private String userAgent =
            String.format(
                    "binance-connector-java/1.0.0 (Java/%s; %s; %s)",
                    SystemUtil.getJavaVersion(), SystemUtil.getOs(), SystemUtil.getArch());

    public StreamConnectionPoolWrapper(WebSocketClientConfiguration clientConfiguration) {
        this(clientConfiguration, null);
    }

    public StreamConnectionPoolWrapper(
            WebSocketClientConfiguration clientConfiguration, Gson gson) {
        Integer poolSize = clientConfiguration.getPoolSize();
        Integer batchSize = clientConfiguration.getReconnectBatchSize();
        Integer reconnectAfter = clientConfiguration.getReconnectIntervalTime();
        initConnectionPool(clientConfiguration, gson);
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
                                            StreamConnectionInterface connectionWrapper =
                                                    connectionList.get(connectionIndex);
                                            if (connectionWrapper.canReconnect()) {
                                                connectionWrapper.connect();
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
        for (StreamConnectionInterface connectionWrapper : connectionList) {
            connectionWrapper.setUserAgent(userAgent);
            connectionWrapper.connect();
        }
        isConnected = true;
    }

    @Override
    public void disconnect() {
        for (StreamConnectionInterface connectionWrapper : connectionList) {
            connectionWrapper.disconnect();
        }
        isConnected = false;
    }

    public Map<String, StreamBlockingQueue<String>> subscribe(
            RequestWrapperDTO<Set<String>, Object> requestWrapperDTO) {
        Set<String> params = requestWrapperDTO.getParams();
        Map<String, StreamBlockingQueue<String>> queueMap = new HashMap<>();
        for (String identifier : params) {
            StreamConnectionInterface connection = getConnection(identifier);
            queueMap.putAll(connection.subscribe(requestWrapperDTO));
        }
        return queueMap;
    }

    @Override
    public void unsubscribe(StreamBlockingQueueWrapper queue) {
        unsubscribe(queue.getInnerQueue());
    }

    @Override
    public void unsubscribe(StreamBlockingQueue queue) {
        StreamConnectionInterface connection = getConnection(queue.getOperationId());
        connection.unsubscribe(queue);
        connectionStreamMap.remove(queue.getOperationId());
    }

    public StreamConnectionInterface getConnection(String identifier) {
        if (connectionStreamMap.containsKey(identifier)) {
            return connectionStreamMap.get(identifier);
        }

        StreamConnectionInterface connection = getConnection();
        connectionStreamMap.put(identifier, connection);

        return connection;
    }

    /**
     * @return the next connection from the pool, using round-robin
     */
    public StreamConnectionInterface getConnection() {
        if (!pool.hasNext()) {
            pool = connectionList.listIterator();
        }
        StreamConnectionInterface connection = pool.next();
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
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public boolean isConnected() {
        return isConnected;
    }

    @Override
    public void stop() throws Exception {
        for (StreamConnectionInterface connectionWrapper : connectionList) {
            connectionWrapper.stop();
        }
        isConnected = false;
    }

    @Override
    public boolean canReconnect() {
        for (StreamConnectionInterface connectionWrapper : connectionList) {
            if (!connectionWrapper.canReconnect()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isReady() {
        for (StreamConnectionInterface connectionWrapper : connectionList) {
            if (!connectionWrapper.isReady()) {
                return false;
            }
        }
        return true;
    }

    protected LinkedList<StreamConnectionInterface> getConnectionList() {
        return connectionList;
    }

    protected void initConnectionPool(WebSocketClientConfiguration clientConfiguration, Gson gson) {
        Integer poolSize = clientConfiguration.getPoolSize();
        for (int i = 0; i < poolSize; i++) {
            StreamConnectionWrapper connectionWrapper =
                    new StreamConnectionWrapper(clientConfiguration, gson);
            connectionList.add(connectionWrapper);
        }
    }
}
