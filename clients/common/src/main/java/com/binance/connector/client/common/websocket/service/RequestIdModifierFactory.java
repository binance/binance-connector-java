package com.binance.connector.client.common.websocket.service;

import com.binance.connector.client.common.websocket.dtos.RequestWrapperDTO;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;

public class RequestIdModifierFactory implements TypeAdapterFactory {
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
        if (!RequestWrapperDTO.class.isAssignableFrom(type.getRawType())) return null;

        final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);
        final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

        return new TypeAdapter<T>() {
            @Override
            public void write(JsonWriter out, T value) throws IOException {
                JsonElement tree = delegate.toJsonTree(value);
                if (tree.isJsonObject()) {
                    JsonObject jo = tree.getAsJsonObject();
                    if (jo.has("id")) {
                        String id = jo.get("id").getAsString();
                        if (StringUtils.isNumeric(id)) {
                            jo.add("id", new JsonPrimitive(Long.parseLong(id)));
                        }
                    }
                }
                elementAdapter.write(out, tree);
            }

            @Override
            public T read(JsonReader in) throws IOException {
                return delegate.read(in);
            }
        }.nullSafe();
    }
}