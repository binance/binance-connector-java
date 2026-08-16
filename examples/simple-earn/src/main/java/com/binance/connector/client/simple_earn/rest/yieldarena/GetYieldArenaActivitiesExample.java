package com.binance.connector.client.simple_earn.rest.yieldarena;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.simple_earn.rest.SimpleEarnRestApiUtil;
import com.binance.connector.client.simple_earn.rest.api.SimpleEarnRestApi;
import com.binance.connector.client.simple_earn.rest.model.GetYieldArenaActivitiesResponse;
import java.io.IOException;

/** API examples for YieldArenaApi */
public class GetYieldArenaActivitiesExample {
    private SimpleEarnRestApi api;

    public SimpleEarnRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    SimpleEarnRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SimpleEarnRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Yield Arena Activities (USER_DATA)
     *
     * <p>Get the list of Earn Yield Arena giveaway activities currently available to the user.
     * Weight(IP): 150 Security Type: USER_DATA
     *
     * @throws ApiException if the Api call fails
     */
    public void getYieldArenaActivitiesExample() throws ApiException, IOException {
        String lang = "en";
        Long recvWindow = 5000L;
        ApiResponse<GetYieldArenaActivitiesResponse> response =
                getApi().getYieldArenaActivities(lang, recvWindow);
        System.out.println(response.getData());
    }
}
