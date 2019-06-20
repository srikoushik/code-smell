package amdocs;

import java.util.Scanner;

/**
 * Next - Duplicate
 * @author koushik
 *
 */
public class Comment {
	public static void main(String args[]) {
		  int firstInput;
		  int secondInput;
		  int result;

		  System.out.println("Addition Program" + '\n');
		  
		  Scanner inputScanner = new Scanner(System.in);
		  System.out.println("Enter an integer:");
		  firstInput = inputScanner.nextInt();

		  System.out.println("You entered integer " + firstInput + '\n');
		  
		  System.out.println("Enter another integer:");
		  secondInput = inputScanner.nextInt();
		  System.out.println("You entered integer " + secondInput + '\n');

		  inputScanner.close();
		  
		  result = firstInput + secondInput;
		  
		  System.out.println("Addition result: "+ result);
	}
}
