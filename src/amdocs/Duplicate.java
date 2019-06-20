package amdocs;

import java.util.Scanner;

/**
 * Next - AlgorithmDuplication
 * @author koushik
 *
 */
public class Duplicate {
	public static void main(String args[]) {
		  int firstInput;
		  int secondInput;
		  int result;
		  String enteredInteger = "You entered integer ";
		  
		  printInConsole("Addition Program" + '\n');
		  
		  Scanner inputScanner = new Scanner(System.in);
		  
		  printInConsole("Enter an integer:");
		  firstInput = inputScanner.nextInt();
		  processDetailsToPrint(enteredInteger , firstInput);
		  
		  printInConsole("Enter another integer:");
		  secondInput = inputScanner.nextInt();
		  processDetailsToPrint(enteredInteger , secondInput);

		  inputScanner.close();
		  
		  result = firstInput + secondInput;
		  
		  printInConsole("Addition result: "+ result + '\n');
	}
	
	private static void processDetailsToPrint(String message, int value) {
		String messageToDisplay = message + value;
		printInConsole(messageToDisplay);
	}
	
	private static void printInConsole(String messageToPrint) {
		System.out.println(messageToPrint);
	}
}
