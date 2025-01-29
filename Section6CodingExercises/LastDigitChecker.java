package Section6CodingExercises;

public class LastDigitChecker {
  public static void main(String[] args) {
  
  }

  public static boolean hasSameLastDigit(int value1, int value2, int value3) {

    if (!isValid(value1)) {
      return false;
    }

    if (!isValid(value2)) {
      return false;
    }

    if (!isValid(value3)) {
      return false;
    }

    int lastDigit1 = value1 % 10;
    int lastDigit2 = value2 % 10;
    int lastDigit3 = value3 % 10;

    boolean hasDigit = false;

    if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3) {
      hasDigit = true;
    } else if (lastDigit2 == lastDigit3) {
      hasDigit = true;
    }

    return hasDigit;

  }

  public static boolean isValid(int number) {
    return (number >= 10 && number <= 1000);
  }

}
