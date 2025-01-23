package WhileLoop;

public class Challenge {
  public static void main(String[] args) {
    int number = 4;
    int finishNumber = 20;
    int evenNumbers = 0;
    int oddNumbers = 0;
    while (number <= finishNumber) {
      number++;
      if (!isEvenNumber(number)) {
        oddNumbers++;
        continue;
      }
      evenNumbers++;
      System.out.println(number + " is an even number");
      if (evenNumbers == 5) {
        break;
      }
    }
    System.out.println("There were " + oddNumbers + " odd numbers");
    System.out.println("There were " + evenNumbers + " even numbers");
  }

  public static boolean isEvenNumber(int num) {
    return (num % 2 == 0);
  }

}
