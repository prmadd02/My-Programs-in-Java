// This program will find the Perimeter and Area of a Square
// Assuming all sides are equal


import java.util.Scanner;

public class Square {
	
	public static void main (String[] args)
	{
		int length;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println ("Enter the Length of the Square's Side: ");
		
		length = input.nextInt();
		
		System.out.println ("Perimeter: " + (4*length));
		
		System.out.println ();
		
		System.out.println ("Area: " + (length*length));
	}

}
