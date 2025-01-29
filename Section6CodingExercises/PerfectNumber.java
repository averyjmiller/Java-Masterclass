package Section6CodingExercises;

public class PerfectNumber {
  public static void main(String[] args) {
    
  }

  public static boolean isPerfectNumber(int number) {
    if (number < 1) {
      return false;
    }

    int sum = 0;

    for(int i = 1; i <= (number / 2); i++) {
      if (!(number % i == 0))
        continue;

      sum += i;
    }

    return (sum == number);

  }

}
