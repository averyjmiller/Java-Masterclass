public class IntEqualityPrinter {
  public static void main(String[] args) {
    printEqual(0, 0, 0);
    printEqual(1, 2, 3);
    printEqual(1, 1, 1);
    printEqual(1, 1, 2);
  }

  public static void printEqual(int num1, int num2, int num3) {
    if (num1 < 0 || num2 < 0 || num3 < 0) {
      System.out.println("Invalid Value");
      return;
    }

    if (num1 == num2 && num1 == num3) {
      System.out.println("All numbers are equal");
    } else if (num1 != num2 && num1 != num3 && num2 != num3) {
      System.out.println("All numbers are different");
    } else {
      System.out.println("Neither all are equal or different");
    }

  }

}
