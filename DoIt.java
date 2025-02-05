// BEGIN
import java.util.Scanner;

class Dolt {
    public static void main(String[] args) {

        // Declare a variable for user input
        int userInput;
        Scanner scanner = new Scanner(System.in);
        // REPEAT AT LEAST ONCE
        // DO
        do {
            //     Prompt the user to enter a positive number
            System.out.print("Enter a positive number: ");
            //     Read input
            userInput = scanner.nextInt();
            // WHILE (input is negative)
            if (userInput < 0) {
                System.out.println("Invalid input. Try again.");
            }
            // Display valid input message
        } while (userInput < 0);
        System.out.println("You entered: " + userInput);
    }
}