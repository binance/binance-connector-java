package com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.account;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.DerivativesTradingPortfolioMarginProRestApiUtil;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.api.DerivativesTradingPortfolioMarginProRestApi;
import com.binance.connector.client.derivatives_trading_portfolio_margin_pro.rest.model.GetTransferableEarnAssetBalanceForPortfolioMarginResponse;

/** API examples for AccountApi */
public class GetTransferableEarnAssetBalanceForPortfolioMarginExample {
    private DerivativesTradingPortfolioMarginProRestApi api;

    public DerivativesTradingPortfolioMarginProRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration =
                    DerivativesTradingPortfolioMarginProRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingPortfolioMarginProRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get Transferable Earn Asset Balance for Portfolio Margin (USER_DATA)
     *
     * <p>Get transferable earn asset balance for all types of Portfolio Margin account Weight: 1500
     *
     * @throws ApiException if the Api call fails
     */
    public void getTransferableEarnAssetBalanceForPortfolioMarginExample() throws ApiException {
        String asset = "";
        String transferType = "";
        Long recvWindow = 5000L;
        ApiResponse<GetTransferableEarnAssetBalanceForPortfolioMarginResponse> response =
                getApi().getTransferableEarnAssetBalanceForPortfolioMargin(
                                asset, transferType, recvWindow);
        System.out.println(response.getData());
    }
}
