package Section6CodingExercises;

public class SharedDigit {
  public static void main(String[] args) {
    System.out.println("12, 23: " + hasSharedDigit(12, 23));
    System.out.println("9, 99: " + hasSharedDigit(9, 99));
    System.out.println("15, 55: " + hasSharedDigit(12, 23));
    System.out.println("12, 34: " + hasSharedDigit(12, 34));
  }

  public static boolean hasSharedDigit(int value1, int value2) {
    if (value1 < 10 || value1 > 99) {
      return false;
    }

    if (value2 < 10 || value2 > 99) {
      return false;
    }

    boolean hasDigit = false;

    if ((value1 % 10) == (value2 % 10)) {
      hasDigit = true;
    } else if ((value1 % 10) == (value2 / 10)) {
      hasDigit = true;
    } else if ((value1 / 10) == (value2 % 10)) {
      hasDigit = true;
    } else if ((value1 / 10) == (value2 / 10)) {
      hasDigit = true;
    }

    return hasDigit;
  }

}
