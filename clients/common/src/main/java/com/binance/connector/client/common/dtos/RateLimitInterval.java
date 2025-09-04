package com.binance.connector.client.common.dtos;

import java.util.Arrays;
import java.util.Optional;

public enum RateLimitInterval {
    SECOND("S"),
    MINUTE("M"),
    HOUR("H"),
    DAY("D");

    private final String value;

    RateLimitInterval(String value) {
        this.value = value;
    }

    public static RateLimitInterval fromValue(String s) {
        Optional<RateLimitInterval> first =
                Arrays.stream(values()).filter(val -> val.value.equals(s)).findFirst();
        return first.orElse(null);
    }
}
