package lektion1;

import java.util.Scanner;

public class Lektion1Uppgift {

	public static void main(String[] args) {
		
		final String password = "123456"; // Declaring password
		Scanner inputObj = new Scanner(System.in);
		int attempts = 3;
		String userInput = "";
		
		for (int i = 0; i <= 3; i++) {
			
			System.out.print("Enter your password: ");
			userInput = inputObj.nextLine();
			attempts--;
			if (userInput.equals(password)) {
				System.out.println("Correct password. Logging in...");
				break;
			}else {
				System.out.println("Incorrect password.\t" + attempts + " attempts remaining");
			}
			if (attempts == 0) { // Executes after 3 incorrect attempts.
				System.out.println("\nApplication locked!");
				break;
				
			}
		}
		inputObj.close();
		
	}
	
	
}
