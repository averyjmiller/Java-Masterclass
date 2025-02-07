package ReadingUserInput;

public class Challenge {
  public static void main(String[] args) {
   
    System.out.println("Enter 5 numbers to be added: ");
    int count = 1;
    int sum = 0;

    do {
      try {
        sum += Integer.parseInt(System.console().readLine("#" + count + ": "));
        count++;
      } catch (NumberFormatException badUserData) {
        System.out.println("Invalid number");
      }
    } while (count <= 5);

    System.out.println("Sum = " + sum);
  }

}
