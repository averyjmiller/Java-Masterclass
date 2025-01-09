package KeywordsAndExpressions;

public class Main {
  public static void main(String[] args) {
    int highScore = 50;

    if (highScore > 25) {
      highScore = 1000 + highScore;   // add bonus point
    }

    int health = 100;

    if ((health < 25) && (highScore > 1000)) {  // There are 6 statements in this if-statement
      highScore = highScore - 1000;
    }
  }
}
