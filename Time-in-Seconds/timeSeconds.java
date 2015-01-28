// This program will receive input from the user and will convert time into seconds.


import java.util.Scanner;

public class timeSeconds {

		public static void main(String[] args)
		{
			// Declare variables
			int hrs, min, sec, totalSeconds;
			
			//Declaring scanner object
			Scanner input = new Scanner(System.in);
			
			// User Input
			System.out.println ("Enter Hours: ");
				hrs = input.nextInt();
			
			// User Input
			System.out.println ("Enter Minutes: ");
				min = input.nextInt();
			
			// User Input
			System.out.println ("Enter Seconds: ");
				sec = input.nextInt();
			
			// Conversion
			totalSeconds = (3600*hrs)+(60*min)+ sec;
			
			// Displaying Result
			System.out.println ("Total Seconds: " +totalSeconds);
		}
}
