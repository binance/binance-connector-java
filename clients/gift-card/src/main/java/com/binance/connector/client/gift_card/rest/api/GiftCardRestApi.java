package com.binance.connector.client.gift_card.rest.api;

import com.binance.connector.client.common.ApiClient;
import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.gift_card.rest.GiftCardRestApiUtil;
import com.binance.connector.client.gift_card.rest.model.CreateADualTokenGiftCardRequest;
import com.binance.connector.client.gift_card.rest.model.CreateADualTokenGiftCardResponse;
import com.binance.connector.client.gift_card.rest.model.CreateASingleTokenGiftCardRequest;
import com.binance.connector.client.gift_card.rest.model.CreateASingleTokenGiftCardResponse;
import com.binance.connector.client.gift_card.rest.model.FetchRsaPublicKeyResponse;
import com.binance.connector.client.gift_card.rest.model.FetchTokenLimitResponse;
import com.binance.connector.client.gift_card.rest.model.RedeemABinanceGiftCardRequest;
import com.binance.connector.client.gift_card.rest.model.RedeemABinanceGiftCardResponse;
import com.binance.connector.client.gift_card.rest.model.VerifyBinanceGiftCardByGiftCardNumberResponse;

public class GiftCardRestApi {

    private final MarketDataApi marketDataApi;

    public GiftCardRestApi(ClientConfiguration configuration) {
        this(GiftCardRestApiUtil.getDefaultClient(configuration));
    }

    public GiftCardRestApi(ApiClient apiClient) {
        this.marketDataApi = new MarketDataApi(apiClient);
    }

    /**
     * Create a dual-token gift card (fixed value, discount feature) (TRADE) * This API is for
     * creating a dual-token ( stablecoin-denominated) Binance Gift Card. You may create a gift card
     * using USDT as baseToken, that is redeemable to another designated token (faceToken). For
     * example, you can create a fixed-value BTC gift card and pay with 100 USDT plus minting fee.
     * This gift card can keep the value fixed at 100 USDT before redemption, and will be redeemable
     * to BTC equivalent to 100 USDT upon redemption. * Once successfully created, the amount of
     * baseToken (e.g. USDT) in the fixed-value gift card along with the fee would be deducted from
     * your funding wallet. * To get started with, please make sure: * You have a Binance account *
     * You have passed KYB * You have a sufﬁcient balance(Gift Card amount and fee amount) in your
     * Binance funding wallet * You need Enable Withdrawals for the API Key which requests this
     * endpoint. Weight(IP): 1 Security Type: TRADE
     *
     * @param createADualTokenGiftCardRequest (required)
     * @return ApiResponse&lt;CreateADualTokenGiftCardResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Create a dual-token gift card </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-gift-card/api/rest-api/market-data#create-adual-token-gift-card">Create
     *     a dual-token gift card (fixed value, discount feature) (TRADE) Documentation</a>
     */
    public ApiResponse<CreateADualTokenGiftCardResponse> createADualTokenGiftCard(
            CreateADualTokenGiftCardRequest createADualTokenGiftCardRequest) throws ApiException {
        return marketDataApi.createADualTokenGiftCard(createADualTokenGiftCardRequest);
    }

    /**
     * Create a single-token gift card (USER_DATA) This API is for creating a Binance Gift Card. To
     * get started with, please make sure: * You have a Binance account * You have passed KYB * You
     * have a sufﬁcient balance(Gift Card amount and fee amount) in your Binance funding wallet *
     * You need &#x60;Enable Withdrawals&#x60; for the API Key which requests this endpoint.
     * Weight(IP): 1 Security Type: USER_DATA
     *
     * @param createASingleTokenGiftCardRequest (required)
     * @return ApiResponse&lt;CreateASingleTokenGiftCardResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Create a single-token gift card </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-gift-card/api/rest-api/market-data#create-asingle-token-gift-card">Create
     *     a single-token gift card (USER_DATA) Documentation</a>
     */
    public ApiResponse<CreateASingleTokenGiftCardResponse> createASingleTokenGiftCard(
            CreateASingleTokenGiftCardRequest createASingleTokenGiftCardRequest)
            throws ApiException {
        return marketDataApi.createASingleTokenGiftCard(createASingleTokenGiftCardRequest);
    }

    /**
     * Fetch RSA Public Key (USER_DATA) This API is for fetching the RSA Public Key. This RSA Public
     * key will be used to encrypt the card code. **Please note that the RSA Public key fetched is
     * valid only for the current day.** Weight(IP): 1 Security Type: USER_DATA
     *
     * @param recvWindow (optional)
     * @return ApiResponse&lt;FetchRsaPublicKeyResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch RSA Public Key </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-gift-card/api/rest-api/market-data#fetch-rsa-public-key">Fetch
     *     RSA Public Key (USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchRsaPublicKeyResponse> fetchRsaPublicKey(Long recvWindow)
            throws ApiException {
        return marketDataApi.fetchRsaPublicKey(recvWindow);
    }

    /**
     * Fetch Token Limit (USER_DATA) This API is to help you verify which tokens are available for
     * you to create Stablecoin-Denominated gift cards as mentioned in section 2 and its’
     * limitation. Weight(IP): 1 Security Type: USER_DATA
     *
     * @param baseToken The token you want to pay, example: BUSD (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;FetchTokenLimitResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Fetch Token Limit </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-gift-card/api/rest-api/market-data#fetch-token-limit">Fetch
     *     Token Limit (USER_DATA) Documentation</a>
     */
    public ApiResponse<FetchTokenLimitResponse> fetchTokenLimit(String baseToken, Long recvWindow)
            throws ApiException {
        return marketDataApi.fetchTokenLimit(baseToken, recvWindow);
    }

    /**
     * Redeem a Binance Gift Card (USER_DATA) This API is for redeeming a Binance Gift Card. Once
     * redeemed, the coins will be deposited in your funding wallet. Weight(IP): 1 Security Type:
     * USER_DATA Notes: - Parameter &#x60;code&#x60; can be sent in two formats:
     * &#x60;Plaintext&#x60; and &#x60;Encrypted&#x60;. - Sending &#x60;code&#x60; in encrypted
     * format is more secure than plaintext. - To send encrypted &#x60;code&#x60;: - Fetch RSA
     * public key from &#x60;GET /sapi/v1/giftcard/cryptography/rsa-public-key&#x60;. - Encrypt card
     * code using &#x60;RSA/ECB/OAEPWithSHA-256AndMGF1Padding&#x60;. - If you enter the wrong
     * redemption code 5 times within 24 hours, you will no longer be able to redeem any Binance
     * Gift Cards that day.
     *
     * @param redeemABinanceGiftCardRequest (required)
     * @return ApiResponse&lt;RedeemABinanceGiftCardResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Redeem a Binance Gift Card </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-gift-card/api/rest-api/market-data#redeem-abinance-gift-card">Redeem
     *     a Binance Gift Card (USER_DATA) Documentation</a>
     */
    public ApiResponse<RedeemABinanceGiftCardResponse> redeemABinanceGiftCard(
            RedeemABinanceGiftCardRequest redeemABinanceGiftCardRequest) throws ApiException {
        return marketDataApi.redeemABinanceGiftCard(redeemABinanceGiftCardRequest);
    }

    /**
     * Verify Binance Gift Card by Gift Card Number (USER_DATA) This API is for verifying whether
     * the Binance Gift Card is valid or not by entering Gift Card Number. **Please note that if you
     * enter the wrong Gift Card Number 5 times within an hour, you will no longer be able to verify
     * any Gift Card Number for that hour.** Weight(IP): 1 Security Type: USER_DATA
     *
     * @param referenceNo Enter the Gift Card Number (required)
     * @param recvWindow (optional)
     * @return ApiResponse&lt;VerifyBinanceGiftCardByGiftCardNumberResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the
     *     response body
     * @http.response.details
     *     <table border="1">
     * <caption>Response Details</caption>
     * <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
     * <tr><td> 200 </td><td> Verify Binance Gift Card by Gift Card Number </td><td>  -  </td></tr>
     * </table>
     *
     * @see <a
     *     href="https://developers.binance.com/en/docs/catalog/investment-and-services-gift-card/api/rest-api/market-data#verify-binance-gift-card-by-gift-card-number">Verify
     *     Binance Gift Card by Gift Card Number (USER_DATA) Documentation</a>
     */
    public ApiResponse<VerifyBinanceGiftCardByGiftCardNumberResponse>
            verifyBinanceGiftCardByGiftCardNumber(String referenceNo, Long recvWindow)
                    throws ApiException {
        return marketDataApi.verifyBinanceGiftCardByGiftCardNumber(referenceNo, recvWindow);
    }
}
