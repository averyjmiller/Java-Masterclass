package Section6CodingExercises;

public class LargestPrime {
  public static void main(String[] args) {
    System.out.println(getLargestPrime(21));
    System.out.println(getLargestPrime(217));
    System.out.println(getLargestPrime(0));
    System.out.println(getLargestPrime(45));
    System.out.println(getLargestPrime(-1));
    System.out.println(getLargestPrime(7));
    System.out.println(getLargestPrime(2));
    System.out.println(getLargestPrime(16));
  }

  public static int getLargestPrime(int number) {
    if (number < 2) {
      return -1;
    }

    int factor = -1;

    for(int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i != 0) {
        continue;
      }

      factor = i;

      while (number % i == 0) {
        number /= i;
      }
    }

    return number == 1 ? factor : number;
  }

}
