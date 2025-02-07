package ReadingUserInput;

public class MinMaxChallenge {
  public static void main(String[] args) {
    
    int num = 0;
    int minimum = 0;
    int maximum = 0;
    boolean isNumber = true;
    boolean enteredANumber = false;

    while(isNumber) {
      try {
        num = Integer.parseInt(System.console().readLine("Enter an integer number (any character to quit): "));
        if(!enteredANumber) {
          minimum = num;
          maximum = num;
        } else {
          if(num < minimum) {
            minimum = num;
          }
          if(num > maximum) {
            maximum = num;
          }  
        }
        enteredANumber = true;
      } catch (NumberFormatException badUserData) {
        isNumber = false;
      }
    }

    if (enteredANumber) {
      System.out.println("Minimum: " + minimum);
      System.out.println("Maximum: " + maximum);
    } else {
      System.out.println("You did not enter any numbers");
    }
  }
}
