/******************************************
  This program was created as part of a 
  programming assignment. The assignment 
  required me to generate a number between
  20 and 40 inclusive, and find the sine,
  cosine, and tangent values of that random
  number.
 ******************************************/

import java.util.Random;


public class SinCosTan {

	public static void main(String[] args) {
		
		// Random Class Object
		Random generator = new Random();
		
		// Declare Variables
		int number;
		
		// Generates a random integer
		number = generator.nextInt(21)+20;
		
		// Display random number
		System.out.println("Generated random number is (Range from 20 to 40): " +number);
		System.out.println("");
		
		// Display sine value of random number
		System.out.println("Sine value in radians:");
		System.out.println("Sin("+number+") = "+Math.sin(number));
		System.out.println("");
		
		// Display cosine value of random number
		System.out.println("Cosine value in radians:");
		System.out.println("Cos("+number+") = "+Math.cos(number));
		System.out.println("");
		
		// Display tangent value of random number
		System.out.println("Tangent value in radians:");
		System.out.println("Tan("+number+") = "+Math.tan(number));
		System.out.println("");

	}

}
