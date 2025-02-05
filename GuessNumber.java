// BEGIN
import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {
        
        // Choose a hidden number
        int hiddenNum = (int)(Math.random() * 100.0) + 1;
        // Prompt the user to start guessing
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number 1-100: ");
        int guessedNum = scanner.nextInt();
        
        // Repeat until the correct guess is made
        // WHILE (true) DO
        do {
            //     IF the guess is correct THEN
            //         Display success message
            //         Exit the loop
            if (guessedNum == hiddenNum) {
                System.out.println("\n\nCongratulations, you guessed the number!!");
                break;
            } else if (guessedNum > hiddenNum) {
                //     ELSE IF the guess is too high THEN
                //         Give a hint
                System.out.println("Your guess is too high...\n\n");
            } else if (guessedNum < hiddenNum) {
                //     ELSE
                //         Give a different hint
                System.out.println("Your guess is too low...\n\n");
            } 
            //     Ask for a guess
            System.out.print("\nGuess another num 1-100: ");
            //     Get user input
            guessedNum = scanner.nextInt();
            
        } while (true); 
        
    }
}