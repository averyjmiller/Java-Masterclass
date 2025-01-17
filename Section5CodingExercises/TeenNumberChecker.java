package Section5CodingExercises;

public class TeenNumberChecker {
  public static void main(String[] args) {
    
  }

  public static boolean hasTeen(int age1, int age2, int age3) {
    boolean teen = false;
    if (isTeen(age1)) {
      teen = true;
    } else if (isTeen(age2)) {
      teen = true;
    } else if (isTeen(age3)) {
      teen = true;
    }
    return teen;
  }

  public static boolean isTeen(int age) {
    return (age >= 13 && age <= 19);
  }

}
