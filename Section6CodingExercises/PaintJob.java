package Section6CodingExercises;

public class PaintJob {
  public static void main(String[] args) {
    System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
    System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
    System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));

    System.out.println(getBucketCount(-3.4, 2.1, 1.5));
    System.out.println(getBucketCount(3.4, 2.1, 1.5));
    System.out.println(getBucketCount(7.25, 4.3, 2.35));

  }

  public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
    if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
      return -1;
    }

    double wallArea = width * height;
    double areaCovered = areaPerBucket * extraBuckets;
    double areaDifference = wallArea - areaCovered;

    int neededBuckets = (int) Math.ceil(areaDifference / areaPerBucket);

    return neededBuckets > 0 ? neededBuckets : 0;
  }

  public static int getBucketCount(double width, double height, double areaPerBucket) {
    if(width <= 0 || height <= 0 || areaPerBucket <= 0) {
      return -1;
    }

    double wallArea = width * height;

    int neededBuckets = (int) Math.ceil(wallArea / areaPerBucket);

    return neededBuckets;
  }

  public static int getBucketCount(double area, double areaPerBucket) {
    if(area <= 0 || areaPerBucket <= 0) {
      return -1;
    }

    int neededBuckets = (int) Math.ceil(area / areaPerBucket);

    return neededBuckets;
  }
}
