package IfKeywordAndCodeBlocks;

public class MethodChallenge {
  public static void main(String[] args) {

    displayHighScorePosition("Tim", calculateHighScorePosition(1500));
    displayHighScorePosition("Sally", calculateHighScorePosition(1000));
    displayHighScorePosition("Joe", calculateHighScorePosition(500));
    displayHighScorePosition("Jane", calculateHighScorePosition(100));
    displayHighScorePosition("John", calculateHighScorePosition(25));

  }

  public static void displayHighScorePosition(String name, int position) {
    System.out.println(name + 
      " managed to get into position " +
      position +
      " on the high score list.");
  }

  public static int calculateHighScorePosition(int score) {

    int position = 4;

    if(score >= 1000) {
      position = 1;
    } else if (score >= 500) {
      position = 2;
    } else if (score >= 100) {
      position = 3;
    }
    
    return position;
  
  }

}
