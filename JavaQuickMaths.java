// Import necessary classes
import java.util.Scanner;


public class JavaQuickMaths {
    public static void main(String[] args)    {
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // 1. Loop from 1.0 to 5.0, incrementing by 0.5
        for (double x = 1.0; x <= 5.0; x += 0.5) {
            //    - Print the number
            System.out.print("Number: " + x);
            //    - Apply and print results of:
            //      - Math.ceil()
            System.out.print(" Ceil: " + Math.ceil(x));
            //      - Math.floor()
            System.out.print(" Floor: " + Math.floor(x));
            //      - Math.rint()
            System.out.print(" Rint: " + Math.rint(x));
            //      - Math.round()
            System.out.print(" Round: " + Math.round(x) + "\n");
        }
        
        // 2. Prompt the user to enter a decimal number
        System.out.print("\nEnter a decimal number: ");
        //    - Store the number
        double userDecimalNum = scanner.nextDouble();
        //    - Print the rounding results (ceil, floor, rint, round)
        System.out.print("Ceil: " + Math.ceil(userDecimalNum));
        System.out.print(" Floor: " + Math.floor(userDecimalNum));
        System.out.print(" Rint: " + Math.rint(userDecimalNum));
        System.out.print(" Round: " + Math.round(userDecimalNum) + "\n");
        
        // 3. Prompt the user to enter an integer
        System.out.print("\nEnter an integer number: ");
        int userIntegerNum = scanner.nextInt();
        //    - Store the integer
        //    - Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String userString = scanner.next();
        //    - Store the string
        System.out.print("You entered integer: " + userIntegerNum);
        System.out.print("\nYou entered string: " + userString);
        //    - Print the entered integer and string
        
        // 4. Demonstrate type casting
        double implicitDouble = userIntegerNum;
        System.out.print("\n\nImplicit cast (int -> double): " + implicitDouble);
        //    - Convert the integer to double (implicit cast) and print
        System.out.print("\nExplicit cast (double -> int): " + (int)userDecimalNum);
        //    - Convert the decimal number to int (explicit cast) and print
        System.out.print("\nCasting int to char (ASCII): " + (char)userIntegerNum);
        //    - Convert the integer to a char (ASCII representation) and print
        
        // 5. Prompt the user to enter a character
        System.out.print("\n\nEnter a character: ");
        char userCharacter = scanner.next().charAt(0);
        //    - Store the character
        System.out.print("\nASCII value of \"" + userCharacter + "\" is: " + (int)userCharacter);
        //    - Convert the character to its ASCII value (int) and print
        
        // 6. Demonstrate String vs. new String()
        String varStr1 = "Example String";
        String varStr2 = "Example String";
        //    - Create a String literal and assign it to two variables
        String varStr3 = new String("Example String");
        //    - Create another String using new String()
        System.out.print("\n\nvarStr1 == varStr2: " + (varStr1 == varStr2));
        //    - Compare the first two strings using == (reference check)
        System.out.print("\nvarStr1 == varStr3: " + (varStr1 == varStr3));
        //    - Compare one literal with the new String() object using ==
        System.out.print("\nvarStr1.equals(varStr3): " + (varStr1.equals(varStr3)));
        //    - Compare the content of both strings using .equals()
        //    - Print the results
        
        // Close the Scanner object
        scanner.close();
        
    }
}
