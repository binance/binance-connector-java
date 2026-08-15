package com.binance.connector.client.algo.rest.futurealgo;

import com.binance.connector.client.algo.rest.AlgoRestApiUtil;
import com.binance.connector.client.algo.rest.api.AlgoRestApi;
import com.binance.connector.client.algo.rest.model.Side;
import com.binance.connector.client.algo.rest.model.Urgency;
import com.binance.connector.client.algo.rest.model.VolumeParticipationFutureAlgoRequest;
import com.binance.connector.client.algo.rest.model.VolumeParticipationFutureAlgoResponse;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import java.io.IOException;

/** API examples for FutureAlgoApi */
public class VolumeParticipationFutureAlgoExample {
    private AlgoRestApi api;

    public AlgoRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = AlgoRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new AlgoRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Volume Participation (VP) New Order (TRADE)
     *
     * <p>Send in a VP new order. Only support on USDⓈ-M Contracts. Weight(UID): 300 Security Type:
     * TRADE Notes: - Other info: - Total Algo open orders max allowed: &#x60;10&#x60; orders. -
     * Leverage and position mode follow your futures account settings. - Receiving
     * &#x60;\&quot;success\&quot;: true&#x60; does not guarantee execution; query order endpoints
     * for final status. - If balance/position constraints fail, response may still return success
     * but order status becomes &#x60;expired&#x60;. - You need to enable the corresponding
     * permission for the API key requesting this endpoint: - &#x60;Futures Trading Permission&#x60;
     * — for Classic Trading Account mode - &#x60;Portfolio Margin Trading Permission&#x60; — for
     * Portfolio Margin Account mode - Base URL: &#x60;https://api.binance.com&#x60;
     *
     * @throws ApiException if the Api call fails
     */
    public void volumeParticipationFutureAlgoExample() throws ApiException, IOException {
        VolumeParticipationFutureAlgoRequest volumeParticipationFutureAlgoRequest =
                new VolumeParticipationFutureAlgoRequest();
        volumeParticipationFutureAlgoRequest.symbol("BTCUSDT");
        volumeParticipationFutureAlgoRequest.side(Side.BUY);
        volumeParticipationFutureAlgoRequest.quantity(1d);
        volumeParticipationFutureAlgoRequest.urgency(Urgency.LOW);
        ApiResponse<VolumeParticipationFutureAlgoResponse> response =
                getApi().volumeParticipationFutureAlgo(volumeParticipationFutureAlgoRequest);
        System.out.println(response.getData());
    }
}
