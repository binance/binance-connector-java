/*
 * Binance Margin Trading REST API
 * OpenAPI Specification for the Binance Margin Trading REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.margin_trading.rest.model;

import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.validation.constraints.*;
import java.io.IOException;
import org.hibernate.validator.constraints.*;

/** Gets or Sets timeInForce */
@JsonAdapter(TimeInForce.Adapter.class)
public enum TimeInForce {
    GTC("GTC"),

    IOC("IOC"),

    FOK("FOK");

    private String value;

    TimeInForce(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TimeInForce fromValue(String value) {
        for (TimeInForce b : TimeInForce.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeInForce> {
        @Override
        public void write(final JsonWriter jsonWriter, final TimeInForce enumeration)
                throws IOException {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public TimeInForce read(final JsonReader jsonReader) throws IOException {
            String value = jsonReader.nextString();
            return TimeInForce.fromValue(value);
        }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        String value = jsonElement.getAsString();
        TimeInForce.fromValue(value);
    }
}
