package com.binance.connector.client.common.dtos;

/** DTOs for rate limits */
public final class RateLimit {
    private RateLimitType rateLimitType;
    private RateLimitInterval interval;
    private Integer intervalNum;
    private Integer count;
    private Integer retryAfter;

    public RateLimitType getRateLimitType() {
        return rateLimitType;
    }

    public void setRateLimitType(RateLimitType rateLimitType) {
        this.rateLimitType = rateLimitType;
    }

    public RateLimitInterval getInterval() {
        return interval;
    }

    public void setInterval(RateLimitInterval interval) {
        this.interval = interval;
    }

    public Integer getIntervalNum() {
        return intervalNum;
    }

    public void setIntervalNum(Integer intervalNum) {
        this.intervalNum = intervalNum;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getRetryAfter() {
        return retryAfter;
    }

    public void setRetryAfter(Integer retryAfter) {
        this.retryAfter = retryAfter;
    }
}
