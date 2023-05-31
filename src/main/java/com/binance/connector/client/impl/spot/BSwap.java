package com.binance.connector.client.impl.spot;

import java.util.Map;

import com.binance.connector.client.enums.HttpMethod;
import com.binance.connector.client.utils.ParameterChecker;
import com.binance.connector.client.utils.ProxyAuth;
import com.binance.connector.client.utils.RequestHandler;
import com.binance.connector.client.utils.signaturegenerator.HmacSignatureGenerator;
import com.binance.connector.client.utils.signaturegenerator.SignatureGenerator;

/**
 * <h2>BSwap Endpoints</h2>
 * All endpoints under the
 * <a href="https://binance-docs.github.io/apidocs/spot/en/#bswap-endpoints">BSwap Endpoint</a>
 * section of the API documentation will be implemented in this class.
 * <br>
 * Response will be returned in <i>String format</i>.
 */
public class BSwap {
    private final String baseUrl;
    private final RequestHandler requestHandler;
    private final boolean showLimitUsage;

    public BSwap(String baseUrl, String apiKey, String secretKey, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, new HmacSignatureGenerator(secretKey), proxy);
        this.showLimitUsage = showLimitUsage;
    }

    public BSwap(String baseUrl, String apiKey, SignatureGenerator signatureGenerator, boolean showLimitUsage, ProxyAuth proxy) {
        this.baseUrl = baseUrl;
        this.requestHandler = new RequestHandler(apiKey, signatureGenerator, proxy);
        this.showLimitUsage = showLimitUsage;
    }

    private final String SWAP_POOLS = "/sapi/v1/bswap/pools";
    /**
     * Get metadata about all swap pools.
     * <br><br>
     * GET /sapi/v1/bswap/pools
     * <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#list-all-swap-pools-market_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#list-all-swap-pools-market_data</a>
     */
    public String swapPools() {
        return requestHandler.sendApiRequest(baseUrl, SWAP_POOLS, null, HttpMethod.GET, showLimitUsage);
    }

    private final String LIQUIDITY = "/sapi/v1/bswap/liquidity";
    /**
     * Get liquidity information and user share of a pool.
     * <br><br>
     * GET /sapi/v1/bswap/liquidity
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * poolId -- optional/long <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#subscribe-blvt-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#subscribe-blvt-user_data</a>
     */
    public String liquidity(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LIQUIDITY, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String LIQUIDITY_ADD = "/sapi/v1/bswap/liquidityAdd";
    /**
     * Add liquidity to a pool.
     * <br><br>
     * POST /sapi/v1/bswap/liquidityAdd
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * poolId -- mandatory/long <br>
     * type -- optional/string -- "Single" to add a single token; "Combination" to add dual tokens. Default "Single" <br>
     * asset -- mandatory/string <br>
     * quantity -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#add-liquidity-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#add-liquidity-trade</a>
     */
    public String liquidityAdd(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "poolId", Long.class);
        ParameterChecker.checkParameter(parameters, "asset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "quantity");
        return requestHandler.sendSignedRequest(baseUrl, LIQUIDITY_ADD, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String LIQUIDITY_REMOVE = "/sapi/v1/bswap/liquidityRemove";
    /**
     * Remove liquidity from a pool, type include SINGLE and COMBINATION, asset is mandatory for single asset removal.
     * <br><br>
     * POST /sapi/v1/bswap/liquidityRemove
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * poolId -- mandatory/long <br>
     * type -- mandatory/string -- SINGLE for single asset removal, COMBINATION for combination of all coins removal <br>
     * asset -- optional/string <br>
     * shareAmount -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#remove-liquidity-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#remove-liquidity-trade</a>
     */
    public String liquidityRemove(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "poolId", Long.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "shareAmount");
        return requestHandler.sendSignedRequest(baseUrl, LIQUIDITY_REMOVE, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String LIQUIDITY_OPS = "/sapi/v1/bswap/liquidityOps";
    /**
     * Get liquidity operation (add/remove) records.
     * <br><br>
     * GET /sapi/v1/bswap/liquidityOps
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * operationId -- optional/long <br>
     * poolId -- optional/long <br>
     * operation -- optional/enum -- ADD or REMOVE <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/long -- default 3, max 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-liquidity-operation-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-liquidity-operation-record-user_data</a>
     */
    public String liquidityOps(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, LIQUIDITY_OPS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String QUOTE = "/sapi/v1/bswap/quote";
    /**
     * Request a quote for swap quote asset (selling asset) for base asset (buying asset), essentially price/exchange rates.<br>
     * quoteQty is quantity of quote asset (to sell).<br>
     * Please be noted the quote is for reference only, the actual price will change as the liquidity changes, it's recommended to swap immediate after request a quote for slippage prevention.
     * <br><br>
     * GET /sapi/v1/bswap/quote
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * quoteAsset -- mandatory/string <br>
     * baseAsset -- mandatory/string <br>
     * quoteQty -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-liquidity-operation-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-liquidity-operation-record-user_data</a>
     */
    public String quote(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "quoteAsset", String.class);
        ParameterChecker.checkParameter(parameters, "baseAsset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "quoteQty");
        return requestHandler.sendSignedRequest(baseUrl, QUOTE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String SWAP = "/sapi/v1/bswap/swap";
    /**
     * Swap quoteAsset for baseAsset.
     * <br><br>
     * POST /sapi/v1/bswap/swap
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * quoteAsset -- mandatory/string <br>
     * baseAsset -- mandatory/string <br>
     * quoteQty -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#swap-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#swap-trade</a>
     */
    public String swap(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "quoteAsset", String.class);
        ParameterChecker.checkParameter(parameters, "baseAsset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "quoteQty");
        return requestHandler.sendSignedRequest(baseUrl, SWAP, parameters, HttpMethod.POST, showLimitUsage);
    }

    /**
     * Get swap history.
     * <br><br>
     * GET /sapi/v1/bswap/swap
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * swapId -- optional/long <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * status -- optional/int -- 0: pending for swap, 1: success, 2: failed <br>
     * quoteAsset -- optional/string <br>
     * baseAsset -- optional/string <br>
     * limit -- optional/long -- default 3, max 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-swap-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-swap-history-user_data</a>
     */
    public String swapHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, SWAP, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String POOL_CONFIGURE = "/sapi/v1/bswap/poolConfigure";
    /**
     * GET /sapi/v1/bswap/poolConfigure
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * poolId -- optional/long <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-pool-configure-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-pool-configure-user_data</a>
     */
    public String poolConfigure(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, POOL_CONFIGURE, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String ADD_LIQUIDITY_PREVIEW = "/sapi/v1/bswap/addLiquidityPreview";
    /**
     * Calculate expected share amount for adding liquidity in single or dual token.
     * <br><br>
     * GET /sapi/v1/bswap/addLiquidityPreview
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * poolId -- mandatory/long <br>
     * type -- mandatory/string -- "SINGLE" for adding a single token;"COMBINATION" for adding dual tokens <br>
     * quoteAsset -- mandatory/string <br>
     * quoteQty -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#add-liquidity-preview-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#add-liquidity-preview-user_data</a>
     */
    public String addLiquidityPreview(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "poolId", Long.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        ParameterChecker.checkParameter(parameters, "quoteAsset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "quoteQty");
        return requestHandler.sendSignedRequest(baseUrl, ADD_LIQUIDITY_PREVIEW, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String REMOVE_LIQUIDITY_PREVIEW = "/sapi/v1/bswap/removeLiquidityPreview";
    /**
     * Calculate the expected asset amount of single token redemption or dual token redemption.
     * <br><br>
     * GET /sapi/v1/bswap/removeLiquidityPreview
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * poolId -- mandatory/long <br>
     * type -- mandatory/string -- "SINGLE" for adding a single token;"COMBINATION" for adding dual tokens <br>
     * quoteAsset -- mandatory/string <br>
     * shareAmount -- mandatory/decimal <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#remove-liquidity-preview-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#remove-liquidity-preview-user_data</a>
     */
    public String removeLiquidityPreview(Map<String, Object> parameters) {
        ParameterChecker.checkParameter(parameters, "poolId", Long.class);
        ParameterChecker.checkParameter(parameters, "type", String.class);
        ParameterChecker.checkParameter(parameters, "quoteAsset", String.class);
        ParameterChecker.checkRequiredParameter(parameters, "shareAmount");
        return requestHandler.sendSignedRequest(baseUrl, REMOVE_LIQUIDITY_PREVIEW, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String UNCLAIMED_REWARDS = "/sapi/v1/bswap/unclaimedRewards";
    /**
     * Get unclaimed rewards record.
     * <br><br>
     * GET /sapi/v1/bswap/unclaimedRewards
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * type -- optional/int -- 0: Swap rewards,1:Liquidity rewards, default to 0 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-unclaimed-rewards-record-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-unclaimed-rewards-record-user_data</a>
     */
    public String unclaimedRewards(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, UNCLAIMED_REWARDS, parameters, HttpMethod.GET, showLimitUsage);
    }

    private final String CLAIM_REWARDS = "/sapi/v1/bswap/claimRewards";
    /**
     * Claim swap rewards or liquidity rewards
     * <br><br>
     * POST /sapi/v1/bswap/claimRewards
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * type -- optional/int -- 0: Swap rewards,1:Liquidity rewards, default to 0 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#claim-rewards-trade">
     *     https://binance-docs.github.io/apidocs/spot/en/#claim-rewards-trade</a>
     */
    public String claimRewards(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, CLAIM_REWARDS, parameters, HttpMethod.POST, showLimitUsage);
    }

    private final String CLAIM_HISTORY = "/sapi/v1/bswap/claimedHistory";
    /**
     * Claim swap rewards or liquidity rewards
     * <br><br>
     * GET /sapi/v1/bswap/claimedHistory
     * <br>
     * @param
     * parameters Map of String,Object pair
     *            where String is the name of the parameter and Object is the value of the parameter
     * <br><br>
     * poolId -- optional/long <br>
     * assetRewards -- optional/string <br>
     * type -- optional/int -- 0: Swap rewards,1:Liquidity rewards, default to 0 <br>
     * startTime -- optional/long <br>
     * endTime -- optional/long <br>
     * limit -- optional/long -- Default 3, max 100 <br>
     * recvWindow -- optional/long <br>
     * @return String
     * @see <a href="https://binance-docs.github.io/apidocs/spot/en/#get-claimed-history-user_data">
     *     https://binance-docs.github.io/apidocs/spot/en/#get-claimed-history-user_data</a>
     */
    public String claimedHistory(Map<String, Object> parameters) {
        return requestHandler.sendSignedRequest(baseUrl, CLAIM_HISTORY, parameters, HttpMethod.GET, showLimitUsage);
    }

}
