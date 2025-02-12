import java.util.Scanner;

public class AllInOne {
    
    public static int sumNum(int num1, int num2, int num3) {
        // Calculate sum
        int sum = num1 + num2 + num3;
        return sum;
    }
    
    public static int maxNum(int num1, int num2, int num3) {
        // Find max
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
    
    public static int minNum(int num1, int num2, int num3) {
        // Find min
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }
    
    public static double avgNum(int num1, int num2, int num3) {
        // Calculate average
        double average = sumNum(num1, num2, num3) / 3.0;
        return average;
    }
    
    public static boolean allPos(int num1, int num2, int num3) {
        // Check if all numbers are positive
        boolean allPositive = (num1 > 0 && num2 > 0 && num3 > 0);
        return allPositive;
    }
    
    public static void printResult(int num1, int num2, int num3, int sum, int max, int min, double average, boolean allPositive) {
        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + average);
        System.out.println("All numbers are positive: " + allPositive);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }
    
    public static void processNumbers(int num1, int num2, int num3) {
        
        int sumNumber = sumNum(num1, num2, num3);
        int maxNumber = maxNum(num1, num2, num3);
        int minNumber = minNum(num1, num2, num3);
        double avgNumber = avgNum(num1, num2, num3);
        boolean allPositive = allPos(num1, num2, num3);
        printResult(num1, num2, num3, sumNumber, maxNumber, minNumber, avgNumber, allPositive);
        
    }
    
    public static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        String num1;
        String num2;
        String num3;
        boolean canBreak = true;
        while (true) {
            canBreak = true;
            System.out.print("Enter 3 integers to process: \n1. ");
            num1 = (scanner.next());
            for (int x = 0; x < num1.length(); x++) {
                if (!Character.isDigit(num1.charAt(x))) {
                    if (!(x == 0 && num1.charAt(0) == '-')) {
                        canBreak = false;
                        System.out.println("\nPlease enter integers...\n");
                    }
                }
            }
            if (canBreak) {
                System.out.print("2. ");
                num2 = scanner.next();
                for (int x = 0; x < num2.length(); x++) {
                    if (!Character.isDigit(num2.charAt(x))) {
                        if (!(x == 0 && num2.charAt(0) == '-')) {
                            canBreak = false;
                            System.out.println("\nPlease enter integers...\n");
                        }
                    }
                }
                if (canBreak) {
                    System.out.print("3. ");
                    num3 = scanner.next();
                    for (int x = 0; x < num3.length(); x++) {
                        if (!Character.isDigit(num3.charAt(x))) {
                            if (!(x == 0 && num3.charAt(0) == '-')) {
                                canBreak = false;
                                System.out.println("\nPlease enter integers...\n");
                            }
                        }
                    }
                    if (canBreak) {
                        break;
                    }
                }
            }
        }
        scanner.close();
        int Num1 = Integer.parseInt(num1);
        int Num2 = Integer.parseInt(num2);
        int Num3 = Integer.parseInt(num3);
        System.out.println("");
        processNumbers(Num1, Num2, Num3);
    }
 
    public static void main(String[] args) {
        getUserInput();
    }
}
