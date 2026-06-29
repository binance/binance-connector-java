package com.binance.connector.client.w3w_prediction.rest.transfer;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.AccountType;
import com.binance.connector.client.w3w_prediction.rest.model.CreateInboundTransferRequest;
import com.binance.connector.client.w3w_prediction.rest.model.CreateInboundTransferResponse;

/** API examples for TransferApi */
public class CreateInboundTransferExample {
    private W3WPredictionRestApi api;

    public W3WPredictionRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    W3WPredictionRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new W3WPredictionRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Create Inbound Transfer
     *
     * <p>Transfer funds from the prediction wallet back to the user&#39;s CEX account (SPOT or
     * FUNDING). Requires SAS authorization. ⚠️ **SAS Authorization Required:** This endpoint
     * enforces SAS (Self-Authorization Service) authorization. If SAS is not enabled for the
     * wallet, the request will be rejected with &#x60;-31003 SAS authorization required&#x60;.
     * Enable SAS for your wallet before calling this endpoint. Weight(IP): 200 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void createInboundTransferExample() throws ApiException {
        CreateInboundTransferRequest createInboundTransferRequest =
                new CreateInboundTransferRequest();
        createInboundTransferRequest.walletId("5b5c1ec3be4e4416a5872b21c1ca5d20");
        createInboundTransferRequest.walletAddress("0x12e32db8817e292508c34111cbc4b23340df542c");
        createInboundTransferRequest.fromTokenAmount("1000000000000000000");
        createInboundTransferRequest.accountType(AccountType.SPOT);
        ApiResponse<CreateInboundTransferResponse> response =
                getApi().createInboundTransfer(createInboundTransferRequest);
        System.out.println(response.getData());
    }
}
