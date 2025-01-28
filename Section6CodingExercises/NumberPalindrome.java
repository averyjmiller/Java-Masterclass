package Section6CodingExercises;

public class NumberPalindrome {
  public static void main(String[] args) {
    System.out.println("101: " + isPalindrome(101));
    System.out.println("1011: " + isPalindrome(1011));
    System.out.println("45654: " + isPalindrome(45654));
    System.out.println("77777: " + isPalindrome(77777));
    System.out.println("57447: " + isPalindrome(57447));

  }

  public static boolean isPalindrome(int number) {
    int reverse = 0;
    int lastDigit = 0;
    int n = number;
    while (n > 9) {
      lastDigit = n % 10;
      reverse += lastDigit;
      reverse = reverse * 10;
      n = n / 10;
    }
    reverse += n;
    if (reverse == number) {
      return true;
    } else {
      return false;
    }
  }

}
