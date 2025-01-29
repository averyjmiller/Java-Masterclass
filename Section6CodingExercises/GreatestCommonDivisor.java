package Section6CodingExercises;

public class GreatestCommonDivisor {
  public static void main(String[] args) {
    System.out.println("25, 15: " + getGreatestCommonDivisor(25, 15));
    System.out.println("12, 30: " + getGreatestCommonDivisor(12, 30));
    System.out.println("9, 18: " + getGreatestCommonDivisor(9, 18));
    System.out.println("81, 153: " + getGreatestCommonDivisor(81, 153));
  }

  public static int getGreatestCommonDivisor(int first, int second) {
    if (first < 10 || second < 10) {
      return -1;
    }

    int minimum = (first < second) ? first : second;
    int greatestCommonDivisor = 1;

    for(int i = 2; i <= minimum; i++) {
      if (first % i != 0) {
        continue;
      }

      if (second % i != 0) {
        continue;
      }

      greatestCommonDivisor = i;
    }

    return greatestCommonDivisor;
  }

}
