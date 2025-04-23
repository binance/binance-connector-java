package com.binance.connector.client.common;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

final class AcceptEncodingInterceptor implements Interceptor {
    @Override
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request request = chain.request().newBuilder().removeHeader("Accept-Encoding").build();
        return chain.proceed(request);
    }
}
