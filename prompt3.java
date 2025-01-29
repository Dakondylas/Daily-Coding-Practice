// Dillon Kondylas
// 01/29/2025
// prompt 3
import java.util.Scanner;


class prompt3 {
    static void countdown(String userInput) {
        // here is my function countdown
        Scanner scanner = new Scanner(System.in);
        Boolean ifBreak = false;
        int userInputInt = 0;
        // this is the validation, the loop iterates through each character in the userInput parameter and if there is any non integers it will go into a while true loop and prompt the user again until they just provide an integer
        // I use a boolean variable named ifBreak that can be used to break out of all the loops 
        for (int i = 0; i < userInput.length(); i++) {
            if (!Character.isDigit(userInput.charAt(i))) {
                System.out.println("\nPlease try again...\n");
                while (true) {
                    System.out.print("Enter a number to count down: ");
                    userInput = scanner.next();
                    for (int x = 0; x < userInput.length(); x++) {
                        if (!Character.isDigit(userInput.charAt(x))) {
                            System.out.println("\nPlease try again...\n");
                        } else {
                            ifBreak = true;
                        }
                    }
                    if (ifBreak) {
                        userInputInt = Integer.valueOf(userInput);
                        break;
                    }
                }
            } else {
                ifBreak = true;
            }
            if (ifBreak) {
                userInputInt = Integer.valueOf(userInput);
                break;
            }
        }
        
        // There is one of these loops for counting down to 0 and one to count down to 1
        for (int x = userInputInt; x >= 0; x--) {
            System.out.println(x);
        }
        for (int x = userInputInt; x > 0; x--) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.print("Enter a number to count down: ");
        userInput = scanner.next();
        countdown(userInput);
    }
}
