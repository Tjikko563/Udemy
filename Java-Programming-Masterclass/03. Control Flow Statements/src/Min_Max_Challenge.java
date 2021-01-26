import java.util.Scanner;

public class Min_Max_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Enter Number");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (number > maximum) {
                    maximum = number;
                }
                if (number < minimum) {
                    minimum = number;
                }
            } else {
                System.out.println("Minimum Number: " + minimum + " and Maximum Number: " + maximum);
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
