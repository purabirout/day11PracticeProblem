package com.bridelabz.Day11;

import java.util.Scanner;

public class StockAccountManagement {
	static {
		System.out.println("Enter to Stock Account Management Program");	
	}
		
	Scanner scn = new Scanner(System.in);
	StockOperation stockOpe = StockOperation.getInstance();
	
	public void handleUserSelection(int choice) {
		UserInterface userInterface = UserInterface.getInstance();
		
		switch(choice) {
			case 1:
				addStock();
				System.out.println("Stock Details are added Successfully");
				break;
			case 2:
				String userSelection = stockOpe.selectStock();
				StockPortfolio stockPortfolio = stockOpe.getStock(userSelection);
				System.out.println("Stock = "+stockPortfolio);
				stockOpe.getStockList().remove(stockPortfolio);
				System.out.println("Stock Removed Successfully");
				System.out.println(stockOpe.getStockList());
				break;
			case 3:
				System.out.println("The Stock List is ");
				stockOpe.printStockList();
				break;
			case 4:
				stockOpe.eachStockValue();
				break;
			case 5:
				stockOpe.totalStockValue();
				break;
			case 6:
				System.out.println("Exiting Main Menu");
				break;
			}
	
	}
	
	public void addStock() {
		StockPortfolio stockPortfolio = new StockPortfolio();
		
		System.out.println("Enter no. of Stocks");
		stockPortfolio.setNumOfShares(scn.nextInt());
		System.out.println("Enter Stock name");
		stockPortfolio.setStockName(scn.next());
		System.out.println("Enter no.of Shares");
		stockPortfolio.setNumOfShares(scn.nextInt());
		System.out.println("Enter Share name");
		stockPortfolio.setShareName(scn.next());
		System.out.println("Enter Price of Stock Share");
		stockPortfolio.setPrice(scn.nextDouble());
		
		stockOpe.add(stockPortfolio);
		System.out.println(stockOpe.getStockList());
				
	}
		
	public static void main(String[] args) {
		UserInterface userInterface = UserInterface.getInstance();
		StockAccountManagement main = new StockAccountManagement();
		
		int choice = 0;
		while(choice != 6) {
			choice = userInterface.showMainMenu();
			main.handleUserSelection(choice);
		}		
	}
}
