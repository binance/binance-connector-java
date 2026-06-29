package com.binance.connector.client.w3w_prediction.rest.transfer;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.w3w_prediction.rest.W3WPredictionRestApiUtil;
import com.binance.connector.client.w3w_prediction.rest.api.W3WPredictionRestApi;
import com.binance.connector.client.w3w_prediction.rest.model.AccountType;
import com.binance.connector.client.w3w_prediction.rest.model.CreateOutboundTransferRequest;
import com.binance.connector.client.w3w_prediction.rest.model.CreateOutboundTransferResponse;
import com.binance.connector.client.w3w_prediction.rest.model.SourceBiz;

/** API examples for TransferApi */
public class CreateOutboundTransferExample {
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
     * Create Outbound Transfer
     *
     * <p>Transfer funds from the user&#39;s CEX account (SPOT or FUNDING) into the prediction
     * wallet. Requires SAS authorization. Weight(IP): 200 Security Type: TRADE
     *
     * @throws ApiException if the Api call fails
     */
    public void createOutboundTransferExample() throws ApiException {
        CreateOutboundTransferRequest createOutboundTransferRequest =
                new CreateOutboundTransferRequest();
        createOutboundTransferRequest.walletId("5b5c1ec3be4e4416a5872b21c1ca5d20");
        createOutboundTransferRequest.walletAddress("0x12e32db8817e292508c34111cbc4b23340df542c");
        createOutboundTransferRequest.fromTokenAmount("1000000000000000000");
        createOutboundTransferRequest.accountType(AccountType.SPOT);
        createOutboundTransferRequest.sourceBiz(SourceBiz.USER_TRANSFER);
        ApiResponse<CreateOutboundTransferResponse> response =
                getApi().createOutboundTransfer(createOutboundTransferRequest);
        System.out.println(response.getData());
    }
}
