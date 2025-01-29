package Section6CodingExercises;

public class NumberToWords {
  public static void main(String[] args) {
    numberToWords(92857);
    numberToWords(1000);
    numberToWords(2225);
    numberToWords(0);
  }

  public static void numberToWords(int number) {
    if (number < 0) {
      System.out.println("Invalid Value");
    }

    int reversedNumber = reverse(number);
    int numberCount = getDigitCount(number);
    int reverseCount = getDigitCount(reversedNumber);
    int countDifference = numberCount - reverseCount;
    String digit = "";

    while (reverseCount > 0) {
      digit = switch (reversedNumber % 10) {
        case 0 -> "Zero";
        case 1 -> "One";
        case 2 -> "Two";
        case 3 -> "Three";
        case 4 -> "Four";
        case 5 -> "Five";
        case 6 -> "Six";
        case 7 -> "Seven";
        case 8 -> "Eight";
        case 9 -> "Nine";
        default -> "Invalid Value";
      };

      System.out.println(digit);

      reversedNumber = reversedNumber / 10;
      reverseCount--;
    }

    if (countDifference != 0) {
      for(int i = 1; i <= countDifference; i++) {
        System.out.println("Zero");
      }
    }
  }

  public static int reverse(int number) {
    int reversedNumber = 0;
    boolean negative = false;

    if (number < 0) {
      negative = true;
      number = Math.abs(number);
    }

    while (number > 9) {
      reversedNumber += number % 10;
      reversedNumber = reversedNumber * 10;
      number = number / 10;
    }

    reversedNumber += number;

    if (negative) {
      reversedNumber = reversedNumber * -1;
    }

    return reversedNumber;
  }

  public static int getDigitCount(int number) {
    if (number < 0) {
      return -1;
    }

    int count = 0;

    if (number == 0) {
      count = 1;
    }

    while (number > 0) {
      number = number / 10;
      count++;
    }

    return count;
  }

}
