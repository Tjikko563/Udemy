public class ForLoop_Exercises {
    public static void main(String[] args) {

/*        for (int i = 8; i >= 2; i--) {
            System.out.printf("10000.00 at %d%% interest = %.2f\n", i, calculateInterest(10000.00, i));
        }

        int primeNumberCount = 0;
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                primeNumberCount++;
                System.out.println(i + " is prime");
                if (primeNumberCount == 10) {
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }*/

        // Sum 3 And 5 Challenge
/*        int sumDivisible = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 15 == 0) {
                count++;
                sumDivisible += i;
                System.out.println("Number: " + i + " met the conditions.");
            }
            if (count == 5) {
                break;
            }
        }

        System.out.println("The sum of the numbers, that have met the condition, is " + sumDivisible);*/

        System.out.println(sumOdd(100, 1000));

    }

    // Calculate Interest
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    // Is Prime
    public static boolean isPrime(int n) {
        if (n == 0) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            System.out.println("Loops" + i);
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Sum Odd
    public static boolean isOdd(int number) {
        if (number <= 0) {
            return false;
        }
        return (number % 2 != 0);
    }
    public static int sumOdd(int start, int end) {
        if ((start <= 0 || end <= 0) || end < start) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
