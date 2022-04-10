package com.bridelabz.Day11;

import java.util.Scanner;
import java.util.*;
public class StockOperation {
	Scanner scn = new Scanner(System.in);
	
	private ArrayList <StockPortfolio> stockList = new ArrayList <StockPortfolio> ();
	
	private StockOperation() {
		
	}
	
	private static StockOperation instance;
	
	public static StockOperation getInstance() {
		if(instance == null) {
			instance = new StockOperation();
		}
		return instance;
	}
	
	public ArrayList <StockPortfolio> getStockList() 
	{
		return stockList;
	}
	
	public void add(StockPortfolio stockPortfolio)
	{
		stockList.add(stockPortfolio);		
	}
		
	public void remove(StockPortfolio stockPortfolio)
	{
		stockList.remove(stockPortfolio);	
	}
	
	public String selectStock() {
		System.out.println("Enter the Stock Name :");
		String userSelection = scn.next();
		return userSelection;
	}
		
	public StockPortfolio getStock(String stockName) {
		for(StockPortfolio stockPortfolio : stockList) {
			if(stockName.equalsIgnoreCase(stockPortfolio.getStockName())) {
				return stockPortfolio;
			}
		}
		return null;
	}
	
	public void printStockList() {
		System.out.println(stockList);
	}
		
	public void eachStockValue() {
		double eachStockValue = 0;
		for(StockPortfolio stockPortfolio : stockList) {
			eachStockValue = stockPortfolio.getPrice();
			System.out.println("StockValue for "+ stockPortfolio.getStockName() + " is " + eachStockValue );	
		}	
	}
	
	public void totalStockValue() {
				
		double totalStockValue = 0;
		double eachStockValue = 0;
		for(StockPortfolio stockPortfolio : stockList) {
			eachStockValue= stockPortfolio.getPrice();
			totalStockValue += eachStockValue;
		}
		System.out.println("The Total StockValue is "+ totalStockValue);
	}
}
