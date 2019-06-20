package amdocs;

import java.util.Scanner;

/**
 * Next - AddingConditions
 * @author koushik
 *
 */
public class AlgorithmDulpication {

	public static String enteredInteger = "Entered integer: ";

	public static void main(String args[]) {
		  int firstInput;
		  int secondInput;
		  int result;
		  
		  printInConsole("Addition Program" + '\n');
		  
		  Scanner inputScanner = new Scanner(System.in);
		  
		  firstInput = getUserInputFromConsole(inputScanner);

		  secondInput = getUserInputFromConsole(inputScanner);

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
	
	private static int getUserInputFromConsole(Scanner inputScanner) {
		printInConsole("Enter an integer:");
		  
		int enteredValue = inputScanner.nextInt();
		processDetailsToPrint(enteredInteger , enteredValue);
		  
		return enteredValue;
	}
}
