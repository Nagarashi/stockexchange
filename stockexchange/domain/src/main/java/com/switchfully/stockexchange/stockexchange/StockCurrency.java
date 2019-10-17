package com.switchfully.stockexchange.stockexchange;

public enum StockCurrency {
    EUR ("€", "Euro"),
    USD ("$", "Dollar"),
    GBP ("£", "Pound");


    private final String symbol;
    private final String label;

    StockCurrency(String symbol, String label) {
        this.symbol = symbol;
        this.label = label;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getLabel() {
        return label;
    }
}
