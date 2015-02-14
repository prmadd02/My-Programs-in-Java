/******************************************
This is a username generator that uses 
the first letter of your first name and 
five letters of your last name plus a 
random number between 10 and 99 to create
a user name.
 ******************************************/

import java.util.Scanner;

public class ComposedNames {

	public static void main(String[] args) {
		
		// Declare Variables
		String fName;
		String lName;
		String str;
		int rNum;
		
		// Create Scanner for User Input
		Scanner scan = new Scanner(System.in);
		
		// User Input
		System.out.print("Enter First Name: ");
		
		// Read Input
		fName = scan.next();
		
		// User Input
		System.out.print("Enter Last Name: ");
		
		// Read Input
		lName = scan.next();
			
			
			// Checks to see if Last Name is long enough
			if (lName.length() > 4) {
				
				// Displays Full Name
				System.out.println("Given Name: " +fName+ " " +lName);
				
				// Generates Random Number between 10 to 99
				rNum = 10+(int) (Math.random()*((99-10)+1));
				
				// Generates User Name
				str = fName.substring(0,1) + lName.substring(0,5) + rNum;
				
				// Displays User Name
				System.out.println("Your User Name is: "+str);
			}
		
			else 
				System.out.println("Last Name must contain 5 characters.");
	
	}

}
