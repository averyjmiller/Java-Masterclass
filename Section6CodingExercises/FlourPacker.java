package Section6CodingExercises;

public class FlourPacker {
  public static void main(String[] args) {
    System.out.println(canPack(1, 0, 4));
    System.out.println(canPack(1, 0, 5));
    System.out.println(canPack(0, 5, 4));
    System.out.println(canPack(2, 2, 11));
    System.out.println(canPack(-3, 2, 12));

  }

  public static boolean canPack(int bigCount, int smallCount, int goal) {
    if (bigCount < 0 || smallCount < 0 || goal < 0) {
      return false;
    }

    int sum = 0;

    for(int i = 1; i <= bigCount; i++) {
      if ((sum + 5) <= goal) {
        sum += 5;
      }
    }

    for(int i = 1; i <= smallCount; i++) {
      if ((sum + 1) <= goal) {
        sum += 1;
      }
    }

    return (sum == goal);
  }

}
