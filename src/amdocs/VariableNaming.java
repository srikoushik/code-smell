package amdocs;

import java.util.Scanner;

/**
 * Next - Comment
 * @author koushik
 *
 */
public class VariableNaming {

	public static void main(String args[]) {
		  int firstInput; // first number user enters
		  int secondInput; // second number from the user
		  int result; // result after addition

		  System.out.println("Addition Program" + '\n');
		  
		  // create a scanner object
		  Scanner inputScanner = new Scanner(System.in);
		  System.out.println("Enter an integer:");
		  // Take integer input and assign to variable
		  firstInput = inputScanner.nextInt();
		  System.out.println("You entered integer " + firstInput + '\n');
		  
		  System.out.println("Enter another integer:");
		  // Take integer input and assign to variable
		  secondInput = inputScanner.nextInt();
		  System.out.println("You entered integer " + secondInput + '\n');
		  // closing the scanner.
		  inputScanner.close();
		  
		  result = firstInput + secondInput;
		  
		  System.out.println("Addition result: "+ result);
	}
}
