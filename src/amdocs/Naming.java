package amdocs;

import java.util.Scanner;

/**
 * Next - Variable Naming
 * @author koushik
 *
 */
public class Naming {
		
	public static void main(String args[]) {
		  int a; // first number user enters
		  int b; // second number from the user 
		  int c; // result after addition

		  System.out.println("Addition Program" + '\n');
		  
		  // create a scanner object
		  Scanner obj = new Scanner(System.in);
		  System.out.println("Enter an integer:");
		  // Take integer input and assign to variable
		  a = obj.nextInt();
		  System.out.println("You entered integer " + a + '\n');

		  System.out.println("Enter another integer:");
		  // Take integer input and assign to variable
		  b = obj.nextInt();
		  System.out.println("You entered integer " + b + '\n');
		  // closing the scanner.
		  obj.close();
		  
		  c = a + b;
		  System.out.println("Addition result: "+ c);
	}
}
