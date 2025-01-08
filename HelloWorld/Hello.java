public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello, Avery");

    boolean isAlien = false;
    if (isAlien == false) {
      System.out.println("It is not an alien!");
      System.out.println("And I am scared of aliens");
    }

    int topScore = 100;
    if (topScore == 100) {
      System.out.println("You got the high score!");
    }

    int secondTopScore = 81;
    if (topScore > secondTopScore && topScore < 100) {
      System.out.println("Greater than second top score and less than 100");
    }

    boolean isCar = false;
    if (!isCar) {
      System.out.println("This is not supposed to happen");
    }

    String makeOfCar = "Volkswagen";
    boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;

    if (isDomestic) {
      System.out.println("This car is domestic to our country");
    }

    // CHALLENGE
    double varOne = 20.00, varTwo = 80.00;
    double result = (varOne + varTwo) * 100.00;
    double remainder = result % 40.00;
    boolean isZero = remainder == 0.00;
    System.out.println(isZero);
    if (!isZero) {
      System.out.println("got some remainder");
    }

  }
}
