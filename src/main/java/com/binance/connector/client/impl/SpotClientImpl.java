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


public class SpotClientImpl implements SpotClient {
    private final String apiKey;
    private final String secretKey;
    private final String baseUrl;
    private boolean showLimitUsage = false;

    public SpotClientImpl() {
        this.apiKey = null;
        this.secretKey = null;
        this.baseUrl = DefaultUrls.PROD_URL;
    }

    public SpotClientImpl(String baseUrl) {
        this.apiKey = null;
        this.secretKey = null;
        this.baseUrl = baseUrl;
    }

    public SpotClientImpl(String baseUrl, boolean showLimitUsage) {
        this.apiKey = null;
        this.secretKey = null;
        this.baseUrl = baseUrl;
        this.showLimitUsage = showLimitUsage;
    }

    public SpotClientImpl(String apiKey, String secretKey) {
        this.apiKey = apiKey;
        this.secretKey = secretKey;
        this.baseUrl = DefaultUrls.PROD_URL;
    }

    public SpotClientImpl(String apiKey, String secretKey, String baseUrl) {
        this.apiKey = apiKey;
        this.secretKey = secretKey;
        this.baseUrl = baseUrl;
    }

    public void setShowLimitUsage(boolean showLimitUsage) {
        this.showLimitUsage = showLimitUsage;
    }

    @Override
    public Blvt createBlvt() {
        return new Blvt(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public BSwap createBswap() {
        return new BSwap(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public C2C createC2C() {
        return new C2C(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public Convert createConvert() {
        return new Convert(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public CryptoLoans createCryptoLoans() {
        return new CryptoLoans(baseUrl, apiKey, secretKey, showLimitUsage); }

    @Override
    public Fiat createFiat() {
        return new Fiat(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public Futures createFutures() {
        return new Futures(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public GiftCard createGiftCard() {
        return new GiftCard(baseUrl, apiKey, secretKey, showLimitUsage); }

    @Override
    public Margin createMargin() {
        return new Margin(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public Market createMarket() {
        return new Market(baseUrl, apiKey, showLimitUsage);
    }

    @Override
    public Mining createMining() {
        return new Mining(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public NFT createNFT() {
        return new NFT(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public Pay createPay() {
        return new Pay(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public PortfolioMargin createPortfolioMargin() {
        return new PortfolioMargin(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public Rebate createRebate() {
        return new Rebate(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public Savings createSavings() {
        return new Savings(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public Staking createStaking() {
        return new Staking(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public SubAccount createSubAccount() {
        return new SubAccount(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public Trade createTrade() {
        return new Trade(baseUrl, apiKey, secretKey, showLimitUsage);
    }

    @Override
    public UserData createUserData() {
        return new UserData(baseUrl, apiKey, showLimitUsage);
    }

    @Override
    public Wallet createWallet() {
        return new Wallet(baseUrl, apiKey, secretKey, showLimitUsage);
    }
}
