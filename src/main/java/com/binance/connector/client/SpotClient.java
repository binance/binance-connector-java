package com.binance.connector.client;

import com.binance.connector.client.impl.spot.AutoInvest;
import com.binance.connector.client.impl.spot.C2C;
import com.binance.connector.client.impl.spot.Convert;
import com.binance.connector.client.impl.spot.CryptoLoans;
import com.binance.connector.client.impl.spot.Fiat;
import com.binance.connector.client.impl.spot.GiftCard;
import com.binance.connector.client.impl.spot.Margin;
import com.binance.connector.client.impl.spot.Market;
import com.binance.connector.client.impl.spot.Mining;
import com.binance.connector.client.impl.spot.NFT;
import com.binance.connector.client.impl.spot.Pay;
import com.binance.connector.client.impl.spot.PortfolioMargin;
import com.binance.connector.client.impl.spot.Rebate;
import com.binance.connector.client.impl.spot.SimpleEarn;
import com.binance.connector.client.impl.spot.SpotAlgo;
import com.binance.connector.client.impl.spot.Staking;
import com.binance.connector.client.impl.spot.SubAccount;
import com.binance.connector.client.impl.spot.Trade;
import com.binance.connector.client.impl.spot.UserData;
import com.binance.connector.client.impl.spot.VIPLoans;
import com.binance.connector.client.impl.spot.Wallet;
import com.binance.connector.client.utils.ProxyAuth;


public interface SpotClient {
    void setShowLimitUsage(boolean showLimitUsage);
    void setProxy(ProxyAuth proxy);
    void unsetProxy();
    AutoInvest createAutoInvest();
    C2C createC2C();
    Convert createConvert();
    CryptoLoans createCryptoLoans();
    Fiat createFiat();
    GiftCard createGiftCard();
    Market createMarket();
    Margin createMargin();
    Mining createMining();
    NFT createNFT();
    Pay createPay();
    PortfolioMargin createPortfolioMargin();
    Rebate createRebate();
    SimpleEarn createSimpleEarn();
    SpotAlgo createSpotAlgo();
    Staking createStaking();
    SubAccount createSubAccount();
    Trade createTrade();
    UserData createUserData();
    VIPLoans createVIPLoans();
    Wallet createWallet();
}
