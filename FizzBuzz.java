public class Main {

  static void fizzBuzz(int number){
          String message = "";
          if (number%3 == 0) {
              message += "fizz";
          };
          if (number%5 == 0) {
              message += "buzz";
          };
          if (message == "") {
          	message += "Neither";
          }
          System.out.println(message);
      };
      
  public static void main(String[] args) {
  
  	int threeNum = 3;
    int fiveNum = 5;
    int fifteenNum = 15;
    int otherNum = 19;
    
  	
  	
    fizzBuzz(threeNum);
    fizzBuzz(fiveNum);
    fizzBuzz(fifteenNum);
    fizzBuzz(otherNum);
    
  };
};
