package unit;

import com.binance.connector.client.enums.HttpMethod;
import okhttp3.mockwebserver.Dispatcher;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.RecordedRequest;

public class MockWebServerDispatcher {

    public static Dispatcher getDispatcher(String prefix, String path, String response, HttpMethod method, int statusCode) {
        final Dispatcher dispatcher = new Dispatcher() {
            @Override
            public MockResponse dispatch (RecordedRequest request) {
                if((request.getPath()).contains(prefix + path) && request.getMethod().equals(method.toString())) {
                    return new MockResponse()
                            .addHeader("Content-Type", "application/json; charset=utf-8")
                            .setResponseCode(statusCode)
                            .setBody(response);
                }
                return new MockResponse().setResponseCode(400);
            }
        };
        return dispatcher;
    }
}
