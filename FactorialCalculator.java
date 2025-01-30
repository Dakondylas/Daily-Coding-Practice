// Dillon Kondylas
// Factorial calculator
// 01/30/2025

import java.util.Scanner;

class FactorialCalculator {

    public static long numFactorial(int userNum) {
        if (userNum < 0) {
            return 0L;
        } else if (userNum == 0) {
            return 1L;
        } else {
            long finalNum = 1L;
            for (int x = 1; x <= userNum; x++) {
                finalNum *= x;
            }
            return finalNum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to see the factorial: ");
        int userNum = scanner.nextInt();
        if (numFactorial(userNum) == 0) {
            System.out.println("The factorial of a negative number is undefined");
        } else {
            System.out.println("The factorial of " + userNum + " is " + numFactorial(userNum));
        }
    }
}
