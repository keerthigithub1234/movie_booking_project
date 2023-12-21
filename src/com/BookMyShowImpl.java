package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookMyShowImpl implements BookMyShow {

	Scanner sc =  new Scanner(System.in);

	Map<Integer,Movie> db  = new LinkedHashMap<Integer,Movie>();
	int totalCost = 0;


	@Override
	public void addMovie() {
		db.put(1, new Movie("HostelHudugru",10,120));
		db.put(2, new Movie("Gaalipata2",5,240));
		db.put(3, new Movie("KGF-2",10,100));


	}

	@Override
	public void displayMovie() {
		Set<Integer> keys = db.keySet(); // 1 2 3 

		for(int key : keys)
		{
			Movie m  = db.get(key);  // getting product based on key
			System.out.println("enter " +key+" to book tickets for: "+m.getmName());
			System.out.println("Available quantity is: " +m.getMtikets());
			System.out.println("cost: "+m.getMcost());
			System.out.println("-------------------------------------------");
		}


	}

	@Override
	public void bookMovie() {
		System.out.println("Enter the Choice : "); // choice  ->key
		int choice = sc.nextInt();

		Movie movie = db.get(choice);

		if(movie != null)
		{
			System.out.println("Selected Movie is " +movie.getmName());
			System.out.println("Enter the no of tickets: " );
			int tickets = sc.nextInt();

			if(tickets <= movie.getMtikets())
			{
				System.out.println("Tickets Available");
				// logic

				//calculating current ticket cost
				int currentCost = tickets * movie.getMcost();

				//Updating new tickets Available
				movie.setMtikets(movie.getMtikets()-  tickets);

				//Adding current cost to total cost
				totalCost = totalCost + currentCost; // totalCost += currentCost;
				
				System.out.println("Booking Successful");
				System.out.println("********************************************");
				System.out.println("Movie Name: " +movie.getmName());
				System.out.println("No of Tickets Booked: "+tickets);
				System.out.println("Movie Ticket Cost:" +currentCost);
				System.out.println("**********THANK YOU VISIT AGAIN !!!*********");
				
				
			}
			else
			{
				System.out.println("Tickets UnAvailable");

			}
		}
		else
		{
			System.out.println("Invalid choice !!");
		}

	}

	@Override
	public void checkOut() {
		System.out.println("Your Total ticket cost is: " +totalCost );

	}


}
