package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);

		BookMyShow bms = new BookMyShowImpl();

		bms.addMovie();

		int choice =1;

		while(choice == 1)
		{
			bms.displayMovie();
			bms.bookMovie();
			System.out.println("press 1 : if you want to continue , any other number to CHECKOUT");
			choice  = sc.nextInt();
			System.out.println("----------------------------------------------------------------------");

		}
		bms.checkOut();

	}

}
