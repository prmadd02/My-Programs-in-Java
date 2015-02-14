/******************************************
  This program is how to find the area of 
  a triangle by SSS method.
 ******************************************/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Triangle {

	public static void main(String[] args) {
	
		// Declare Variables
		double a,b,c;
		double s, area;
		
		// Create Scanner for User Input
		Scanner scan = new Scanner(System.in);
		
		// User Input
		System.out.print("Enter Length of side A: ");
		
		// Read Input
		a = scan.nextInt();
		
		// User Input
		System.out.print("Enter Length of side B: ");
				
		// Read Input
		b = scan.nextInt();
		
		// User Input
		System.out.print("Enter Length of side C: ");
				
		// Read Input
		c = scan.nextInt();
		
			// Calculate s
			s = (a+b+c)/2;
			
			// Calculate Area of the Triangle
			area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
			
			// Round out the output to 3 decimal places
			DecimalFormat fmt = new DecimalFormat("#.###");
			
			// Display the result to 3 decimal places
			System.out.println("The area of the Triangle is: "+fmt.format(area));
	}

}
