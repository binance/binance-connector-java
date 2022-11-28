package com.binance.connector.client.impl;

import com.binance.connector.client.SpotClient;
import com.binance.connector.client.enums.DefaultUrls;
import com.binance.connector.client.impl.spot.BSwap;
import com.binance.connector.client.impl.spot.Blvt;
import com.binance.connector.client.impl.spot.C2C;
import com.binance.connector.client.impl.spot.CryptoLoans;
import com.binance.connector.client.impl.spot.Convert;
import com.binance.connector.client.impl.spot.Fiat;
import com.binance.connector.client.impl.spot.Futures;
import com.binance.connector.client.impl.spot.GiftCard;
import com.binance.connector.client.impl.spot.Margin;
import com.binance.connector.client.impl.spot.Market;
import com.binance.connector.client.impl.spot.Mining;
import com.binance.connector.client.impl.spot.NFT;
import com.binance.connector.client.impl.spot.Pay;
import com.binance.connector.client.impl.spot.PortfolioMargin;
import com.binance.connector.client.impl.spot.Rebate;
import com.binance.connector.client.impl.spot.Savings;
import com.binance.connector.client.impl.spot.Staking;
import com.binance.connector.client.impl.spot.SubAccount;
import com.binance.connector.client.impl.spot.Trade;
import com.binance.connector.client.impl.spot.UserData;
import com.binance.connector.client.impl.spot.Wallet;
import com.binance.connector.client.utils.HmacSignatureGenerator;
import com.binance.connector.client.utils.SignatureGenerator;


public class SpotClientImpl implements SpotClient {
    private final String apiKey;
    private final SignatureGenerator signatureGenerator;
    private final String baseUrl;
    private boolean showLimitUsage = false;

    public SpotClientImpl() {
        this(DefaultUrls.PROD_URL);
    }

    public SpotClientImpl(String baseUrl) {
        this("", "", baseUrl);
    }

    public SpotClientImpl(String baseUrl, boolean showLimitUsage) {
        this(baseUrl);
        this.showLimitUsage = showLimitUsage;
    }

    public SpotClientImpl(String apiKey, String secretKey) {
        this(apiKey, secretKey, DefaultUrls.PROD_URL);
    }

    public SpotClientImpl(String apiKey, String secretKey, String baseUrl) {
        this(apiKey, new HmacSignatureGenerator(secretKey), baseUrl);
    }

    public SpotClientImpl(String apiKey, SignatureGenerator signatureGenerator, String baseUrl) {
        this.apiKey = apiKey;
        this.signatureGenerator = signatureGenerator;
        this.baseUrl = baseUrl;
    }

    public void setShowLimitUsage(boolean showLimitUsage) {
        this.showLimitUsage = showLimitUsage;
    }

    @Override
    public Blvt createBlvt() {
        return new Blvt(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public BSwap createBswap() {
        return new BSwap(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public C2C createC2C() {
        return new C2C(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public Convert createConvert() {
        return new Convert(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public CryptoLoans createCryptoLoans() {
        return new CryptoLoans(baseUrl, apiKey, signatureGenerator, showLimitUsage); }

    @Override
    public Fiat createFiat() {
        return new Fiat(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public Futures createFutures() {
        return new Futures(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public GiftCard createGiftCard() {
        return new GiftCard(baseUrl, apiKey, signatureGenerator, showLimitUsage); }

    @Override
    public Margin createMargin() {
        return new Margin(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public Market createMarket() {
        return new Market(baseUrl, apiKey, showLimitUsage);
    }

    @Override
    public Mining createMining() {
        return new Mining(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public NFT createNFT() {
        return new NFT(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public Pay createPay() {
        return new Pay(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public PortfolioMargin createPortfolioMargin() {
        return new PortfolioMargin(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public Rebate createRebate() {
        return new Rebate(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public Savings createSavings() {
        return new Savings(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public Staking createStaking() {
        return new Staking(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public SubAccount createSubAccount() {
        return new SubAccount(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public Trade createTrade() {
        return new Trade(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }

    @Override
    public UserData createUserData() {
        return new UserData(baseUrl, apiKey, showLimitUsage);
    }

    @Override
    public Wallet createWallet() {
        return new Wallet(baseUrl, apiKey, signatureGenerator, showLimitUsage);
    }
}
