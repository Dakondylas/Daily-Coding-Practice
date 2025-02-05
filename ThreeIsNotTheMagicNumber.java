// BEGIN

class ThreeisNotTheMagicNumber {
    public static void main(String[] args) {
        
        // Loop through numbers 1 to 20
        for (int i = 1; i <= 20; i++) {
            // FOR each number from 1 to 20 DO
            //     IF number is divisible by 3 THEN
            if ((i % 3) == 0) {
                continue;
                // Skip this iteration
            } else {
                //     ELSE
                //         Print the number
                System.out.println(i);
            }
        }
    }
}
