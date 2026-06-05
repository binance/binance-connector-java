package com.binance.connector.client.wallet.rest.asset;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.wallet.rest.WalletRestApiUtil;
import com.binance.connector.client.wallet.rest.api.WalletRestApi;
import com.binance.connector.client.wallet.rest.model.FundingWalletRequest;
import com.binance.connector.client.wallet.rest.model.FundingWalletResponse;

/** API examples for AssetApi */
public class FundingWalletExample {
    private WalletRestApi api;

    public WalletRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = WalletRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new WalletRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Funding Wallet (USER_DATA)
     *
     * <p>Query Funding Wallet * Currently supports querying the following business assets：Binance
     * Pay, Binance Card, Binance Gift Card, Stock Token Weight: 1
     *
     * @throws ApiException if the Api call fails
     */
    public void fundingWalletExample() throws ApiException {
        FundingWalletRequest fundingWalletRequest = new FundingWalletRequest();
        ApiResponse<FundingWalletResponse> response = getApi().fundingWallet(fundingWalletRequest);
        System.out.println(response.getData());
    }
}
