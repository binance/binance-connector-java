package com.binance.connector.client.common;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalFormatter {
    private static final int MAX_DECIMAL_DIGITS = 30;
    private static DecimalFormat df;

    public static DecimalFormat getFormatter() {
        if (null == df) {
            // Overrides the default Locale
            DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.ENGLISH);
            df = new DecimalFormat("#,##0.###", symbols);
            df.setMaximumFractionDigits(MAX_DECIMAL_DIGITS);
            df.setGroupingUsed(false);
        }
        return df;
    }
}
