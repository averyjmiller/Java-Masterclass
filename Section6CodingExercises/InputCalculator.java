package Section6CodingExercises;

import java.util.Scanner;

public class InputCalculator {
  public static void main(String[] args) {
    inputThenPrintSumAndAverage();
  }

  public static void inputThenPrintSumAndAverage() {

    Scanner scanner = new Scanner(System.in);

    boolean isNumber = true;
    int sum = 0;
    int average = 0;
    int count = 0;

    while(isNumber) {
      try {
        sum += Integer.parseInt(scanner.nextLine());
        count++;
      } catch (NumberFormatException badUserData) {
        if(count > 0) {
          average = (int) Math.round((double) sum / count);
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        isNumber = false;
      }
    }
  }

}
