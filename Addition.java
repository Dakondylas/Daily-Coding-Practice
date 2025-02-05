// BEGIN
import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        
        // Choose a hidden number
        int firstNum = (int)(Math.random() * 10.0);
        int secondNum = (int)(Math.random() * 10.0);
        int sum = firstNum + secondNum;
        // Prompts the user to enter their guess
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + firstNum + " + " + secondNum + "? ");
        int guessedNum = scanner.nextInt();
        
        // Repeat until the correct guess is made
        // WHILE (true) DO
        do {
            //     IF the guess is correct THEN
            //         Display success message
            //         Exit the loop
            if (guessedNum == sum) {
                System.out.println("You got it!");
                break;
            }
            
            System.out.print("Wrong answer. Try again. What is " + firstNum + " + " + secondNum + "? ");
            //     Get user input
            guessedNum = scanner.nextInt();
            
        } while (true); 
        
    }
}