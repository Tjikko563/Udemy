public class Coding_Exercises_2 {

    public static void main(String[] args) {
        //System.out.println(area(5.0));
        //System.out.println(area(5,5));
        //printYearsAndDays(-1);
        //printEqual(1, 2, 3);
        System.out.println(isCatPlaying(true, 45));
    }

    // Area Calculator
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return (Math.pow(radius, 2) * Math.PI);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }

    // Minutes To Years And Days Calculator
    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.printf("%d min = %d y and %d d\n", minutes, years, remainingDays);
        }
    }

    // Equality Printer
    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else {
            if (a == b && b == c) {
                System.out.println("All numbers are equal");
            } else if (a != b && b != c && a != c) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }

    // Playing Cat
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return (!summer && (temperature >= 25 && temperature <= 35));
        }
    }
}
