import java.util.Scanner;

public class Coding_Exercises_3 {
    public static void main(String[] args) {

        //inputThenPrintSumAndAverage();
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
    }

    // Input Calculator
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double average = 0;
        int numberCount = 0;

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                numberCount++;
                int number = scanner.nextInt();
                sum += number;
            } else {
                average = Math.round(sum / numberCount);
                System.out.println("SUM = " + (int) sum +
                        " AVG = " + (int) average);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }

    // Pint Job
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;
        if ((extraBuckets * areaPerBucket) >= wallArea) {
            return 0;
        } else {
            double bucketsNeeded = Math.ceil(wallArea / areaPerBucket);
            return (int) (bucketsNeeded - extraBuckets);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double wallArea = width * height;
        double bucketsNeeded = Math.ceil(wallArea / areaPerBucket);
        return (int) bucketsNeeded;
    }

    public static int getBucketCount(double wallArea, double areaPerBucket) {
        if (wallArea <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double bucketsNeeded = Math.ceil(wallArea / areaPerBucket);
        return (int) bucketsNeeded;
    }


}
