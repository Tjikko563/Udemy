import java.util.Scanner;

public class Reading_User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number #" + i);
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
            } else {
                System.out.println("Invalid Number");
                i--;
            }
            scanner.nextLine();
        }

        System.out.println(sum);
        scanner.close();


    }
}
