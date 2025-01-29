// Dillon Kondylas
// 01/29/2025
// prompt 3
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean ifBreak = false;
        String userInput;
        int userInputInt;
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
        for (int x = userInputInt; x >= 0; x--) {
            System.out.println(x);
        }
        for (int x = userInputInt; x > 0; x--) {
            System.out.println(x);
        }
    }
}
