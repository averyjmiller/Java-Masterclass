package Section5CodingExercises;

public class DecimalComparator {
  public static void main(String[] args) {
    
  }

  public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    num1 *= 1000;
    num2 *= 1000;
    int value1 = (int) num1;
    int value2 = (int) num2;
    return (value1 == value2);
  }

}
