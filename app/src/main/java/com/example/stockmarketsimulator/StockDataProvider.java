package com.example.stockmarketsimulator;

public class StockDataProvider {
    private final String stockName,stockPrize,stockPrizeMovement,stockPrizeMovementPercent;

    public StockDataProvider(String stockName ,String stockPrize ,String stockPrizeMovement ,String stockPrizeMovementPercent) {
        this.stockName = stockName;
        this.stockPrize = stockPrize;
        this.stockPrizeMovement = stockPrizeMovement;
        this.stockPrizeMovementPercent = stockPrizeMovementPercent;
    }

    public String getStockPrize() {
        return stockPrize;
    }

    public String getStockPrizeMovement() {
        return stockPrizeMovement;
    }

    public String getStockPrizeMovementPercent() {
        return stockPrizeMovementPercent;
    }

    public String getStockName() {
        return stockName;
    }

}
