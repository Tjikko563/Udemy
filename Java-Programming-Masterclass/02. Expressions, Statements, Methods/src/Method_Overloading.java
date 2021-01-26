public class Method_Overloading {
    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(6, 1);
        if (centimeters < 0) {
            System.out.println("Invalid parameters");
        }
        centimeters = calcFeetAndInchesToCentimeters(650);
        if (centimeters < 0) {
            System.out.println("Invalid parameters");
        }

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = (feet * 30.48) + (inches * 2.54);
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            System.out.printf("%.0f feet %.2f inches = %.2f cm\n", feet, inches, centimeters);
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches.");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        double inchesToFeet = Math.floor(inches / 12);
        double remainder = inches % 12;
        if (inches >= 0) {
            System.out.printf("%.2f inches are equal to %.0f feet and %.2f inches\n",inches, inchesToFeet, remainder);
            return calcFeetAndInchesToCentimeters(inchesToFeet, remainder);
        } else {
            System.out.println("Invalid feet or inches.");
            return -1;
        }
    }
}
