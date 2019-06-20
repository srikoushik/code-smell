package amdocs;

import java.util.Scanner;
import java.util.stream.IntStream;

public class LongMethod {

	public static String enteredInteger = "Entered integer: ";
	public static int [] userInputs = new int[2];
	public static boolean notAValidInput = false;

	public static void main(String args[]) {		  
		  printInConsole("Addition Program" + '\n');
		  
		  Scanner inputScanner = new Scanner(System.in);

		  processUserInputAndAddToArray(inputScanner);
		  
		  if(!notAValidInput) {
			  printInConsole("Addition result: "+ IntStream.of(userInputs).sum() + '\n');			  
		  }

		  inputScanner.close();		  
	}
	
	private static void processUserInputAndAddToArray(Scanner inputScanner) {
		for(int inputs = 0; inputs < 2; inputs++) {
			int userEnteredNumber = getUserInputFromConsole(inputScanner);
			if(isNumberBetweenRange(userEnteredNumber)) {
				userInputs[inputs] = userEnteredNumber;				  
			} else {
				notAValidInput = true;
				printInConsole("Error: Enter number between 0 - 100");				  
				break;
			}
		}
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
