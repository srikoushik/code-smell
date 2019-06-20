package amdocs;

import java.util.Scanner;

/**
 * Next - ConditionalDecompression
 * @author koushik
 *
 */
public class AddingConditions {

	public static String enteredInteger = "Entered integer: ";

	public static void main(String args[]) {
		  int firstInput;
		  int secondInput;
		  int result;
		  
		  printInConsole("Addition Program" + '\n');
		  
		  Scanner inputScanner = new Scanner(System.in);
		  
		  firstInput = getUserInputFromConsole(inputScanner);

		  if(firstInput > 0 && firstInput < 100) {
			  secondInput = getUserInputFromConsole(inputScanner);
			  
			  result = firstInput + secondInput;
			  
			  printInConsole("Addition result: "+ result + '\n');
		  } else {
			  printInConsole("Error: Enter number between 0 - 100");
		  }

		  inputScanner.close();		  
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
