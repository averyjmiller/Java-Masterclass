public class Challenge {
  public static void main(String[] args) {
    System.out.println("5 inches = " + convertToCentimeters(5) + " centimeters");
    System.out.println("5 feet 8 inches = " + convertToCentimeters(5, 8) + " centimeters");
  }

  public static double convertToCentimeters(int inches) {
    return inches * 2.54;
  }

  public static double convertToCentimeters(int feet, int inches) {
    int totalInches = feet * 12 + inches;
    return convertToCentimeters(totalInches);
  }

}
