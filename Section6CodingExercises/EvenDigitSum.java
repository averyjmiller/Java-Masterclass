package Section6CodingExercises;

public class EvenDigitSum {
  public static void main(String[] args) {
    System.out.println("123456789: " + getEvenDigitSum(123456789));
    System.out.println("252: " + getEvenDigitSum(252));
    System.out.println("-22: " + getEvenDigitSum(-22));
  }

  public static int getEvenDigitSum(int number) {
    if (number < 0) {
      return -1;
    }

    int sum = 0;
    int lastDigit = 0;

    while (number > 9) {
      lastDigit = number % 10;
      number = number / 10;
      if (lastDigit % 2 != 0) {
        continue;
      }
      sum += lastDigit;
    }

    if (number % 2 == 0) {
      sum += number;
    }
    
    return sum;

  }

}
