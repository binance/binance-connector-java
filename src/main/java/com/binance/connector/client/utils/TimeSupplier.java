package com.binance.connector.client.utils;

import java.util.function.Supplier;

public class TimeSupplier {

    public static final TimeSupplier INSTANCE = new TimeSupplier();

    private Supplier<Long> timeProvider;

    public TimeSupplier() {
        timeProvider = System::currentTimeMillis;
    }

    public void setTimeProvider(Supplier<Long> timeProvider) {
        this.timeProvider = timeProvider;
    }

    public String buildTimestamp() {
        return String.valueOf(timeProvider.get());
    }
}
