public class Coding_Exercises {
    public static void main(String[] args) {

        // checkNumber(0);
        // printConversion(-5);
        // printMegaBytesAndKiloBytes(3000);
        // System.out.println(shouldWakeUp(true, -1));
        //System.out.println(isLeapYear(2017));
        //System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        //System.out.println(hasEqualSum(1, -1, 0));
        //System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
    }

    // Positive, Negative or Zero
    public static void checkNumber(int number) {
        String printOut = "zero";
        if (number > 0) {
            printOut = "positive";
        } else if (number < 0) {
            printOut = "negative";
        }
        System.out.println(printOut);
    }

    // Speed Converter
    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour;
        if (kilometersPerHour >= 0) {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
            return milesPerHour;
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (toMilesPerHour(kilometersPerHour) == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = "
                    + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    // MegaBytes Converter
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = Math.round(kiloBytes / 1024);
            int remainder = kiloBytes % 1024;
            System.out.printf("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainder);
        }
    }

    // Barking Dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking) {
            if (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23) {
                return true;
            }
        }
        return false;
    }

    // Leap Year Calculator
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 == 0) {
                    return true;
                } else if (year % 100 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    // Decimal Comparator
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        if ((int) (firstNumber * 1000) == (int) (secondNumber * 1000)) {
            return true;
        } else {
            return false;
        }
    }

    // Equal Sum Checker
    public static boolean hasEqualSum(int firsNumber, int secondNumber, int thirdNumber) {
        if (firsNumber + secondNumber == thirdNumber) {
            return true;
        } else {
            return false;
        }
    }

    // Teen Number Checker
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        int[] array = {firstAge, secondAge, thirdAge};
        for (int i = 0; i < 3; i++) {
            if (isTeen(array[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen(int age) {
        return (age >= 13 && age <= 19);
    }
}
