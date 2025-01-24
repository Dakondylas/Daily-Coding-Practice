import java.util.Scanner;

class Stairs {
  public static void main(String[] args) {
    String userCHaracter;
    int userNUmLines;
    while (true) {
        
        Scanner userCharacter = new Scanner(System.in);
        System.out.println("Enter Character: ");
        userCHaracter = userCharacter.nextLine();
        
        if (userCHaracter.length() == 1) {
            Scanner userNumLines = new Scanner(System.in);
            System.out.println("Enter Number of Lines: ");
            userNUmLines = userNumLines.nextInt();
            break;
        } else {
            System.out.println("\nPlease enter a single character...\n");
        }
        
    }
    for (int x = userNUmLines; x > 0; x--) {
        String spaces = "";
        String characterFiller = "";
        for (int y = 0; y < x; y++) {
            spaces = spaces + " ";
        }
        for (int z = 0; z < (userNUmLines-x); z++) {
            characterFiller = characterFiller + userCHaracter;
        }
        System.out.println((spaces) + characterFiller);
    }
    String characterFiller = "";
    for (int x = 0; x < userNUmLines; x++) {
        characterFiller = characterFiller + userCHaracter;
    }
    System.out.println(characterFiller);
  }
}
