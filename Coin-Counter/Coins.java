// This program shows how much money you have in a jar.


import java.util.Scanner;

public class Coins {

	public static void main(String[] args)
	{
		// variable declaration
		int q, d, n, p;
		int dollars, cents;
		
		// reading input from keyboard
		Scanner input = new Scanner (System.in);
		
		// User Input
		System.out.println ("Quarters in the jar: ");
			q = input.nextInt();
		System.out.println ("Dimes in the jar: ");
			d = input.nextInt();
		System.out.println ("Nickels in the jar: ");
			n = input.nextInt();
		System.out.println ("Pennies in the jar: ");
			p = input.nextInt();
		
		// calculating number of cents in the jar
		cents = 25*q + 10*d + 5*n + p;
		
		// converting the cents into dollars
		dollars = cents/100;
	
		// converting the cents left from the dollars
		cents = cents %100;
		
		System.out.println ("Total value in the jar is: \n"
		+ dollars + " dollars and " + cents + " cents.");
	}
}
