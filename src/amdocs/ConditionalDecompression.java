package amdocs;

import java.util.Scanner;

/**
 * Next - LongMethod
 * @author koushik
 *
 */
public class ConditionalDecompression {

	public static String enteredInteger = "Entered integer: ";

	public static void main(String args[]) {
		  int firstInput;
		  int secondInput;
		  int result;
		  
		  printInConsole("Addition Program" + '\n');
		  
		  Scanner inputScanner = new Scanner(System.in);
		  
		  firstInput = getUserInputFromConsole(inputScanner);

		  if(isNumberBetweenRange(firstInput)) {
			  secondInput = getUserInputFromConsole(inputScanner);
			  
			  if(isNumberBetweenRange(secondInput)) {
				  result = firstInput + secondInput;
				  
				  printInConsole("Addition result: "+ result + '\n');				  
			  } else {
				  printInConsole("Error: Enter number between 0 - 100");				  
			  }
		  } else {
			  printInConsole("Error: Enter number between 0 - 100");
		  }

		  inputScanner.close();		  
	}
	
	private static boolean isNumberBetweenRange(int number) {
		return (number > 0 & number < 100);
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
