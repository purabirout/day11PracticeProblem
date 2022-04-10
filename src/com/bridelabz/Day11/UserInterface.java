package com.bridelabz.Day11;
import java.util.Scanner;
public class UserInterface {
		
		Scanner scn = new Scanner(System.in);
		
		private UserInterface() {
			
		}
		private static UserInterface instance;
		
		public static UserInterface getInstance() {
			if(instance == null) {
				instance = new UserInterface();
			}
			return instance;
		}

		public int showMainMenu() {
			System.out.println("Select \n 1.Add Stock\n 2.Remove Stock\n "
					+ "3.Print Stock List\n 4.Value of Each Stock\n 5.value of Total Stock \n6.Exit");
			int choice = scn.nextInt();
			return choice;
		}
}
