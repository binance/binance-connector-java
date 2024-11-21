package com.binance.connector.client.impl.spot.data;

import com.binance.connector.client.enums.OrderType;
import com.binance.connector.client.enums.TradingStatus;

import java.math.BigDecimal;
import java.util.Set;

public record SymbolResponse(

        String symbol,
        TradingStatus status,
        String baseAsset,
        BigDecimal baseAssetPrecision,
        String quoteAsset,
        BigDecimal quoteAssetPrecision,

        Set<OrderType> orderTypes,

        Boolean icebergAllowed,
        Boolean ocoAllowed,
        Boolean otoAllowed,
        Boolean quoteOrderQtyMarketAllowed,
        Boolean allowTrailingStop,
        Boolean cancelReplaceAllowed,
        Boolean isSpotTradingAllowed,
        Boolean isMarginTradingAllowed
) {

}
