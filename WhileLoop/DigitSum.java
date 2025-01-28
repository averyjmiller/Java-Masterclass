package WhileLoop;

public class DigitSum {
  public static void main(String[] args) {
    System.out.println("The sum of the digits: 1 is " + sumDigits(1));
    System.out.println("The sum of the digits: 5 is " + sumDigits(5));
    System.out.println("The sum of the digits: 10 is " + sumDigits(10));
    System.out.println("The sum of the digits: 27 is " + sumDigits(27));
    System.out.println("The sum of the digits: 489 is " + sumDigits(489));
    System.out.println("The sum of the digits: 278329 is " + sumDigits(278329));
    System.out.println("The sum of the digits: 100000 is " + sumDigits(100000));
  }

  public static int sumDigits(int number) {
    if (number < 0) {
      return -1;
    }

    int sum = 0;

    while (number > 9) {
      sum += (number % 10);
      number = number / 10;
    }
    sum += number;
    return sum;
  }

}
