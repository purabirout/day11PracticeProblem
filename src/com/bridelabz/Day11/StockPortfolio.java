package com.bridelabz.Day11;

public class StockPortfolio {
	private String stockName;
	private int numOfStocks;
	private String shareName;
	private int numOfShares;
	private double price;
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumOfStocks() {
		return numOfStocks;
	}
	public void setNumOfStocks(int numOfStocks) {
		this.numOfStocks = numOfStocks;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	public int getNumOfShares() {
		return numOfShares;
	}
	public void setNumOfShares(int numOfShares) {
		this.numOfShares = numOfShares;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "StockPortfolio [stockName=" + stockName + ", numOfStocks=" + numOfStocks + ", shareName=" + shareName
				+ ", numOfShares=" + numOfShares + ", price=" + price + "]";
	}
}
