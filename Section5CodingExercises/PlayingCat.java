public class PlayingCat {
  public static void main(String[] args) {
    
  }

  public static boolean isCatPlaying(boolean summer, int temperature) {
    boolean playing = false;
    if (summer) {
      if (temperature >= 25 && temperature <= 45) {
        playing = true;
      }
    } else {
      if (temperature >= 25 && temperature <= 35) {
        playing = true;
      }
    }
    return playing;
  }

}
