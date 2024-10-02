package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Gift Card Endpoints</h2>
 * All endpoints under the
 * <a href="https://developers.binance.com/docs/gift_card/Introduction">Gift Card Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class GiftCard {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public GiftCard(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public GiftCard(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String CREATE_CODE = "/sapi/v1/giftcard/createCode";
    /**
     * This API is for creating a Binance Code. To get started with, please make sure:
     *
     * You have a Binance account <br>
     * You have passed kyc <br>
     * You have a sufficient balance in your Binance funding wallet <br>
     * You need Enable Withdrawals for the API Key which requests this endpoint. <br>
     * <br><br>
     * POST /sapi/v1/giftcard/createCode
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * token -- mandatory/string -- The coin type contained in the Binance Code <br>
     * amount -- mandatory/double -- The amount of the coin <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/gift_card/market-data/Create-a-single-token-gift-card">
     *     https://developers.binance.com/docs/gift_card/market-data/Create-a-single-token-gift-card</a>
     */
    public String createCode(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "token", String.class);
        ParameterChecker.checkParameter(parameters, "amount", Double.class);
        return requestHandler.sendSignedRequest(baseUrl, CREATE_CODE, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String REDEEM_CODE = "/sapi/v1/giftcard/redeemCode";
    /**
     * This API is for redeeming the Binance Code. Once redeemed, the coins will be deposited in your funding wallet. <br>
     * Please note that if you enter the wrong code 5 times within 24 hours,
     * you will no longer be able to redeem any Binance Code that day. <br>
     * <br><br>
     * POST /sapi/v1/giftcard/redeemCode
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * code -- mandatory/string -- Binance code <br>
     * externalUid -- optional/string -- Each external unique ID represents a unique user on the partner platform.
     *                                  The function helps you to identify the redemption behavior of different users,
     *                                  such as redemption frequency and amount. It also helps risk and limit control of a single account,
     *                                  such as daily limit on redemption volume, frequency, and incorrect number of entries. This will also prevent a single user account reach the partner's daily redemption limits. We strongly recommend you to use this feature and transfer us the User ID of your users if you have different users redeeming Binance codes on your platform.
     *                                  To protect user data privacy, you may choose to transfer the user id in any desired format (max. 400 characters). <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/gift_card/market-data/Redeem-a-Binance-Gift-Card">
     *     https://developers.binance.com/docs/gift_card/market-data/Redeem-a-Binance-Gift-Card</a>
     */
    public String redeemCode(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "code", String.class);
        return requestHandler.sendSignedRequest(baseUrl, REDEEM_CODE, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String VERIFY = "/sapi/v1/giftcard/verify";
    /**
     * This API is for verifying whether the Binance Code is valid or not by entering Binance Code or reference number. <br>
     * Please note that if you enter the wrong binance code 5 times within an hour,
     * you will no longer be able to verify any binance code for that hour. <br>
     * <br><br>
     * GET /sapi/v1/giftcard/verify
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * referenceNo -- mandatory/string -- reference number <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/gift_card/market-data/Verify-Binance-Gift-Card-by-Gift-Card-Number">
     *     https://developers.binance.com/docs/gift_card/market-data/Verify-Binance-Gift-Card-by-Gift-Card-Number</a>
     */
    public String verify(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "referenceNo", String.class);
        return requestHandler.sendSignedRequest(baseUrl, VERIFY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String RSA_PUB = "/sapi/v1/giftcard/cryptography/rsa-public-key";
    /**
     * This API is for fetching the RSA Public Key. This RSA Public key will be used to encrypt the card code.
     * <br><br>
     * GET /sapi/v1/giftcard/cryptography/rsa-public-key
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/gift_card/market-data/Fetch-RSA-Public-Key">
     *     https://developers.binance.com/docs/gift_card/market-data/Fetch-RSA-Public-Key</a>
     */
    public String rsaPublicKey(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, RSA_PUB, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CREATE_DUAL_TOKEN_CODE = "/sapi/v1/giftcard/buyCode";
    /**
     * This API is for buying a fixed-value Binance Code, which means your Binance Code will be redeemable to a token that is different to the token that you are paying in. If the token you’re paying and the redeemable token are the same, please use the Create Binance Code endpoint.
     * You can use supported crypto currency or fiat token as baseToken to buy Binance Code that is redeemable to your chosen faceToken.
     * Once successfully purchased, the amount of baseToken would be deducted from your funding wallet.
     * 
     * To get started with, please make sure:
     * - You have a Binance account
     * - You have passed kyc
     * - You have a sufficient balance in your Binance funding wallet
     * - You need Enable Withdrawals for the API Key which requests this endpoint.
     * 
     * <br><br>
     * POST /sapi/v1/giftcard/buyCode
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * baseToken -- mandatory/string -- The token you want to pay, example BUSD <br>
     * faceToken -- mandatory/string -- The token you want to buy, example BNB. If faceToken = baseToken, it's the same as createCode endpoint. <br>
     * baseTokenAmount -- mandatory/double -- The base token asset quantity, example 1.002 <br>
     * discount -- optional/double -- The discount rate, example 0.1 <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/gift_card/market-data/Create-a-dual-token-gift-card">
     *      https://developers.binance.com/docs/gift_card/market-data/Create-a-dual-token-gift-card</a>
     */
    public String createDualTokensCode(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "baseToken", String.class);
        ParameterChecker.checkParameter(parameters, "faceToken", String.class);
        ParameterChecker.checkParameter(parameters, "baseTokenAmount", Double.class);
        return requestHandler.sendSignedRequest(baseUrl, CREATE_DUAL_TOKEN_CODE, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String TOKEN_LIMIT = "/sapi/v1/giftcard/buyCode/token-limit";
    /**
     * This API is to help you verify which tokens are available for you to purchase fixed-value gift cards.
     * 
     * <br><br>
     * GET /sapi/v1/giftcard/buyCode/token-limit
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * baseToken -- mandatory/string -- The token you want to pay, example BUSD <br>
     * recvWindow -- optional/long -- The value cannot be greater than 60000 <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/gift_card/market-data/Fetch-Token-Limit">
     *      https://developers.binance.com/docs/gift_card/market-data/Fetch-Token-Limit</a>
     */
    public String tokensLimit(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "baseToken", String.class);
        return requestHandler.sendSignedRequest(baseUrl, TOKEN_LIMIT, parameters, HttpMethod.GET, showLimitUsage);
    }
}
