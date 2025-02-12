import java.util.Scanner;

class arrayWeGo {
    

    
    // Task 1: Declare an Array
    public static void taskOne() {
        int[] numbers;   
        // Declare an integer array named numbers with a size of 5.
        numbers = new int[5];
        // Print all elements of the array to show their default values.
        System.out.println("1. Declare an Array:");
        System.out.println("Array[0] = " + numbers[0]);
        System.out.println("Array[1] = " + numbers[1]);
        System.out.println("Array[2] = " + numbers[2]);
        System.out.println("Array[3] = " + numbers[3]);
        System.out.println("Array[4] = " + numbers[4]);
    }
    
    // Task 2: Declare an Array and fill the values in multiple lines
    public static void taskTwo() {
        // Declare an integer array named numbers with a size of 5.
        int[] numbers;
        numbers = new int[5];
        // Assign the values 21, 12, 22, 11, 2 to the array using separate assignment statements.
        numbers[0] = 21;
        numbers[1] = 12;
        numbers[2] = 22;
        numbers[3] = 11;
        numbers[4] = 2;
        // Print the complete array.
        System.out.println("\n2. Declare an Array and fill the values in multiple lines:");
        System.out.println("Array[0] = " + numbers[0]);
        System.out.println("Array[1] = " + numbers[1]);
        System.out.println("Array[2] = " + numbers[2]);
        System.out.println("Array[3] = " + numbers[3]);
        System.out.println("Array[4] = " + numbers[4]);
    }
    
    // Task 3: Declare an Array and fill the values in one line
    public static void taskThree() {
        // Declare and initialize an integer array named numbers with a size of 5 in one line.
        int[] numbers = {21, 12, 22, 11, 2};
        // Assign the values 21, 12, 22, 11, 2 directly.
        // Print the complete array.
        System.out.println("\n3. Declare an Array and fill the values in one line:");
        System.out.println("Array[0] = " + numbers[0]);
        System.out.println("Array[1] = " + numbers[1]);
        System.out.println("Array[2] = " + numbers[2]);
        System.out.println("Array[3] = " + numbers[3]);
        System.out.println("Array[4] = " + numbers[4]);
    }
    
    // Task 4: Declare an Array and fill the values using a for loop
    public static void taskFour() {
        // Declare an integer array named numbers with a size of 5.
        int[] numbers;
        numbers = new int[5];
        int valueNumber = 3;
        // Use a for loop to populate the array starting with 3, then fill it with increasing multiples of 3.
        for (int x = 1; x <= 5; x++) {
            numbers[x-1] = valueNumber * x;
        }
        // Print the complete array.
        System.out.println("\n4. Declare an Array and fill the values using a for loop:");
        System.out.println("Array[0] = " + numbers[0]);
        System.out.println("Array[1] = " + numbers[1]);
        System.out.println("Array[2] = " + numbers[2]);
        System.out.println("Array[3] = " + numbers[3]);
        System.out.println("Array[4] = " + numbers[4]);
    }
    
    // Task 5: Declare an Array and fill the values using a for loop, char edition
    public static void taskFive() {
        // Declare a char array named charArray with a size of 5.
        char[] charArray;
        charArray = new char[5];
        int valueChar = 'A';
        // Set the first element to 'A'.
        // Use a for loop to fill the array with the next respective letters, increasing by 2 each time. You must use math, you cannot hard code.
        for (int x = 0; x < 5; x++) {
            charArray[x] = (char)(valueChar + (2 * x));
        }
        // Print the complete array.
        System.out.println("\n5. Declare an Array and fill the values using a for loop, char edition:");
        System.out.println("Array[0] = " + charArray[0]);
        System.out.println("Array[1] = " + charArray[1]);
        System.out.println("Array[2] = " + charArray[2]);
        System.out.println("Array[3] = " + charArray[3]);
        System.out.println("Array[4] = " + charArray[4]);
    }
    
    // Task 6: User-Defined Array with Random Values
    public static void taskSix() {
        // Prompt the user to enter the size of the array.
        System.out.println("\n6. User-Defined Array with Random Values:");
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        while (userInput <= 0) {
            System.out.print("\nEnter the size of the array: ");
            userInput = scanner.nextInt();
            if (userInput <= 0) {
                System.out.println("\nPlease enter a valid array size...\n");
            } else {
                break;
            }
        }
        // Create an array of that size.
        int[] numbers;
        numbers = new int[userInput];
        // Fill it with random numbers between 1 and 100 using a for loop.
        for (int x = 0; x < userInput; x++) {
            numbers[x] = (int)(1 + (Math.random() * 100));
            System.out.println("Array[" + x + "] = " + numbers[x]);
        }
        // Print the array values.
    }
    public static void main(String[] args) {
    
        taskOne();
        taskTwo();
        taskThree();
        taskFour();
        taskFive();
        taskSix();
    }
}