package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>Staking Endpoints</h2>
 * All endpoints under the
 * <a href="https://developers.binance.com/docs/staking/Introduction">Staking Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class Staking {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public Staking(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public Staking(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String SUB_ETH_STAKING = "/sapi/v2/eth-staking/eth/stake";
    /**
     * Stake ETH to get WBETH
     * 
     * <br><br>
     * POST /sapi/v2/eth-staking/eth/stake
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * amount -- mandatory/decimal -- Amount in ETH, limit 4 decimals <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/staking/Subscribe-ETH-Staking">
     *     https://developers.binance.com/docs/staking/staking/Subscribe-ETH-Staking</a>
     */
    public String subEthStaking(Map<String, Object> parameters) {
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, SUB_ETH_STAKING, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String REDEEM_ETH = "/sapi/v1/eth-staking/eth/redeem";
    /**
     * Redeem WBETH or BETH and get ETH
     * 
     * <br><br>
     * POST /sapi/v1/eth-staking/eth/redeem
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * amount -- mandatory/decimal -- Amount in ETH, limit 4 decimals <br>
     * asset -- optional/string -- "BETH" or "WBETH", default "BETH" <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/staking/Redeem-ETH">
     *     https://developers.binance.com/docs/staking/staking/Redeem-ETH</a>
     */
    public String redeemEthStaking(Map<String, Object> parameters) {
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, REDEEM_ETH, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ETH_STAKING_HISTORY = "/sapi/v1/eth-staking/eth/history/stakingHistory";
    /**
     * GET /sapi/v1/eth-staking/eth/history/stakingHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default: 10, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/history/Get-ETH-staking-history">
     *     https://developers.binance.com/docs/staking/history/Get-ETH-staking-history</a>
     */
    public String ethStakingSubHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ETH_STAKING_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ETH_STAKING_REDEEM_HISTORY = "/sapi/v1/eth-staking/eth/history/redemptionHistory";
    /**
     * GET /sapi/v1/eth-staking/eth/history/redemptionHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default: 10, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/history/Get-ETH-redemption-history">
     *     https://developers.binance.com/docs/staking/history/Get-ETH-redemption-history</a>
     */
    public String ethStakingRedeemHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ETH_STAKING_REDEEM_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ETH_STAKING_REWARDS_HISTORY = "/sapi/v1/eth-staking/eth/history/rewardsHistory";
    /**
     * GET /sapi/v1/eth-staking/eth/history/rewardsHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default: 10, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/history/Get-ETH-rewards-distribution-history">
     *     https://developers.binance.com/docs/staking/history/Get-ETH-rewards-distribution-history</a>
     */
    public String ethStakingRewardsHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ETH_STAKING_REWARDS_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ETH_STAKING_QUOTA = "/sapi/v1/eth-staking/eth/quota";
    /**
     * GET /sapi/v1/eth-staking/eth/quota
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/account/Get-current-ETH-staking-quota">
     *     https://developers.binance.com/docs/staking/account/Get-current-ETH-staking-quota</a>
     */
    public String ethStakingQuota(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ETH_STAKING_QUOTA, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ETH_STAKING_RATE_HISTORY = "/sapi/v1/eth-staking/eth/history/rateHistory";
    /**
     * GET /sapi/v1/eth-staking/eth/history/rateHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default: 10, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/history/Get-BETH-Rate-History">
     *     https://developers.binance.com/docs/staking/history/Get-BETH-Rate-History</a>
     */
    public String ethStakingRateHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ETH_STAKING_RATE_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ETH_STAKING_ACCOUNT = "/sapi/v2/eth-staking/account";
    /**
     * GET /sapi/v2/eth-staking/account
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/account/ETH-Staking-account">
     *     https://developers.binance.com/docs/staking/account/ETH-Staking-account</a>
     */
    public String ethStakingAccount(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ETH_STAKING_ACCOUNT, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String WRAP_WBETH = "/sapi/v1/eth-staking/wbeth/wrap";
    /**
     * POST /sapi/v1/eth-staking/wbeth/wrap
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * amount -- mandatory/decimal -- Amount in BETH, limit 4 decimals <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/staking/Wrap-BETH">
     *     https://developers.binance.com/docs/staking/staking/Wrap-BETH</a>
     */
    public String wrapEthStakingWbeth(Map<String, Object> parameters) {
        ParameterChecker.checkRequiredParameter(parameters, "amount");
        return requestHandler.sendSignedRequest(baseUrl, WRAP_WBETH, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String ETH_STAKING_WBETH_WRAP_HISTORY = "/sapi/v1/eth-staking/wbeth/history/wrapHistory";
    /**
     * GET /sapi/v1/eth-staking/wbeth/history/wrapHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default: 10, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/history/Get-WBETH-wrap-history">
     *     https://developers.binance.com/docs/staking/history/Get-WBETH-wrap-history</a>
     */
    public String ethStakingWbethWrapHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ETH_STAKING_WBETH_WRAP_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ETH_STAKING_WBETH_UNWRAP_HISTORY = "/sapi/v1/eth-staking/wbeth/history/unwrapHistory";
    /**
     * GET /sapi/v1/eth-staking/wbeth/history/unwrapHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default: 10, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/history/Get-WBETH-unwrap-history">
     *     https://developers.binance.com/docs/staking/history/Get-WBETH-unwrap-history</a>
     */
    public String ethStakingWbethUnwrapHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ETH_STAKING_WBETH_UNWRAP_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ETH_STAKING_WBETH_REWARD_HISTORY = "/sapi/v1/eth-staking/eth/history/wbethRewardsHistory";
    /**
     * GET /sapi/v1/eth-staking/eth/history/wbethRewardsHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * current -- optional/long -- Currently querying page. Start from 1. Default:1 <br>
     * size -- optional/long -- Default: 10, Max: 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://developers.binance.com/docs/staking/history/Get-WBETH-rewards-history">
     *     https://developers.binance.com/docs/staking/history/Get-WBETH-rewards-history</a>
     */
    public String ethStakingWbethRewardHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, ETH_STAKING_WBETH_REWARD_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }
}
