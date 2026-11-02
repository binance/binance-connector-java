package com.binance.connector.client.margin_trading.rest.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.io.IOException;
import org.junit.jupiter.api.Test;

class MarginAccountNewOrderResponseTest {

    @Test
    void deserializesFractionalBorrowAmount() throws IOException {
        MarginAccountNewOrderResponse response =
                MarginAccountNewOrderResponse.fromJson("{\"marginBuyBorrowAmount\":\"0.001\"}");

        assertEquals("0.001", response.getMarginBuyBorrowAmount());
        assertEquals("0.001", MarginAccountNewOrderResponse.fromJson(response.toJson())
                .getMarginBuyBorrowAmount());
    }

    @Test
    void deserializesNumericFractionalBorrowAmount() throws IOException {
        MarginAccountNewOrderResponse response =
                MarginAccountNewOrderResponse.fromJson("{\"marginBuyBorrowAmount\":0.001}");

        assertEquals("0.001", response.getMarginBuyBorrowAmount());
    }

    @Test
    void preservesBorrowAmountScale() throws IOException {
        MarginAccountNewOrderResponse response =
                MarginAccountNewOrderResponse.fromJson(
                        "{\"marginBuyBorrowAmount\":\"0.00100\"}");

        assertEquals("0.00100", response.getMarginBuyBorrowAmount());
    }

    @Test
    void allowsNullOrMissingBorrowAmount() throws IOException {
        assertNull(
                MarginAccountNewOrderResponse.fromJson("{\"marginBuyBorrowAmount\":null}")
                        .getMarginBuyBorrowAmount());
        assertNull(MarginAccountNewOrderResponse.fromJson("{}").getMarginBuyBorrowAmount());
    }
}
