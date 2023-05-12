package com.binance.connector.client;

import com.binance.connector.client.impl.spot.BSwap;
import com.binance.connector.client.impl.spot.Blvt;
import com.binance.connector.client.impl.spot.C2C;
import com.binance.connector.client.impl.spot.Convert;
import com.binance.connector.client.impl.spot.CryptoLoans;
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
import com.binance.connector.client.utils.ProxyAuth;


public interface SpotClient {
    void setShowLimitUsage(boolean showLimitUsage);
    void setProxy(ProxyAuth proxy);
    void unsetProxy();
    Blvt createBlvt();
    BSwap createBswap();
    C2C createC2C();
    Convert createConvert();
    CryptoLoans createCryptoLoans();
    Fiat createFiat();
    Futures createFutures();
    GiftCard createGiftCard();
    Market createMarket();
    Margin createMargin();
    Mining createMining();
    NFT createNFT();
    Pay createPay();
    PortfolioMargin createPortfolioMargin();
    Rebate createRebate();
    Savings createSavings();
    Staking createStaking();
    SubAccount createSubAccount();
    Trade createTrade();
    UserData createUserData();
    Wallet createWallet();
}
