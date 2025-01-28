package Section6CodingExercises;

public class FirstLastDigitSum {
  public static void main(String[] args) {
    System.out.println("252: " + sumFirstAndLastDigit(252));
    System.out.println("257: " + sumFirstAndLastDigit(257));
    System.out.println("0: " + sumFirstAndLastDigit(0));
    System.out.println("5: " + sumFirstAndLastDigit(5));
    System.out.println("-10: " + sumFirstAndLastDigit(-10));
  }

  public static int sumFirstAndLastDigit(int number) {
    if (number < 0) {
      return -1;
    }

    int lastDigit = number % 10;

    while (number > 9) {
      number = number / 10;
    }

    return (number + lastDigit);
  }

}
