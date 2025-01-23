public class ThePrimeNumberChallenge {
  public static void main(String[] args) {
    
    System.out.println("0 is " + (isPrime(0) ? "" : "NOT ") + "a prime number");

    int primeCounter = 0;
    for (int i = 1; i <= 1000; i++) {
      if (isPrime(i)) {
        System.out.println(i + " is a prime number");
        primeCounter++;
        if (primeCounter == 3) {
          break;
        }
      }
    }
  }

  public static boolean isPrime(int wholeNumber) {
    if ( wholeNumber <= 2) {
      return (wholeNumber == 2);
    }

    for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
      if (wholeNumber % divisor == 0) {
        return false;
      }
    }

    return true;
  }

}
