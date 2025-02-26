// necessary imports go here
import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {
        String arraySizee;
        Scanner scanner = new Scanner(System.in);
        boolean isDigit;
        while (true) {
            isDigit = true;
            System.out.print("Enter an array size: ");
            // Get array size from user using Scanner
            arraySizee = (scanner.next());
            System.out.println("");
            // Validate input to ensure a positive integer for array size
            for (int x = 0; x < arraySizee.length(); x++) {
                if (!Character.isDigit(arraySizee.charAt(x))) {
                    System.out.println("Please enter a valid size.\n");
                    isDigit = false;
                    break;
                }
            }
            if (isDigit) {
                break;
            }
        }
        int arraySize = Integer.parseInt(arraySizee);
        

        // Create an array of the specified size and fill with random numbers
        int[] userArray = new int[arraySize];
        for (int x = 0; x < arraySize; x++) {
            userArray[x] = 1 + (int)(Math.random() * 1000);
        }
        
        
        String targetNumm;
        while (true) {
            isDigit = true;
            System.out.print("Enter a target number: ");
            // Get target number from user using Scanner
            targetNumm = (scanner.next());
            System.out.println("");
            // Validate input to ensure a positive integer for the target number if found, -1 if not
            for (int x = 0; x < targetNumm.length(); x++) {
                if (!Character.isDigit(targetNumm.charAt(x))) {
                    System.out.println("Please enter a valid number.\n");
                    isDigit = false;
                    break;
                }
            }
            if (isDigit) {
                break;
            }
        }
        int targetNum = Integer.parseInt(targetNumm);
        System.out.println("\n" + Arrays.toString(userArray) + "\n");
        
        scanner.close();
        
        int linearIndex = 0;
        int binaryIndex = 0;

        // Linear Search
        System.out.println("Starting linear search...");
        long linearStartTime = System.nanoTime();
        for (int x = 0; x < arraySize; x++) {
            if (userArray[x] == targetNum) {
                System.out.println("\n" + targetNum + " found at index: " + x + "\n");
                linearIndex = x;
                break;
            } else if (x == arraySize - 1) {
                System.out.println("\n" + targetNum + " found at index: -1\n");
                linearIndex = -1;
                break;
            }
        }
        
        // Implement linear search to find the index of the target number

        long linearEndTime = System.nanoTime();
        System.out.println("Linear search took " + (linearEndTime - linearStartTime) + " nanoseconds.");

        // Sort the array using built-in method of the Arrays class
        System.out.println("\nSorting the array...\n");
        Arrays.sort(userArray);
        System.out.println("\n" + Arrays.toString(userArray) + "\n");
        // Sort the array as specified above

        // Binary Search
        System.out.println("Starting binary search...\n");
        long binaryStartTime = System.nanoTime();
        binaryIndex = Arrays.binarySearch(userArray, targetNum);
        System.out.println("\n" + targetNum + " found at index: " + binaryIndex + "\n");
        
        // Implement binary search to find the index of the target number if found, -1 if not

        // Display the result of the binary search (index or not found)

        long binaryEndTime = System.nanoTime();
        System.out.println("Binary search took " + (binaryEndTime - binaryStartTime) + " nanoseconds.");

        // Display results specified in Display Output section
        if (linearIndex < 0) {
            System.out.println("\n\nLinear search did not find the specified number and so it returned -1 as the index.\nIt did this in " + (linearEndTime - linearStartTime) + " nanoseconds.\n");
            System.out.println("Binary search also failed to find the value because it returned a negative index, but if the value was in the sorted list, it would be put at the " + Math.abs(binaryIndex) + " index.\nIt did this in " + (binaryEndTime - binaryStartTime) + " nanoseconds.");
        } else {
            System.out.println("\n\nLinear search found the specified number at index " + linearIndex +".\nIt did this in " + (linearEndTime - linearStartTime) + " nanoseconds.\n");
            System.out.println("Binary search also found the value at the index " + binaryIndex + ".\nIt did this in " + (binaryEndTime - binaryStartTime) + " nanoseconds.");
        }
    }
}
