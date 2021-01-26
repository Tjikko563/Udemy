public class Coding_Exercises_2 {
    public static void main(String[] args) {

        //System.out.println(canPack(4, 4, 19));
        //System.out.println(getLargestPrime(3));
        //System.out.println(getLargestPrimeVerTwo(20));
        printSquareStar(5);
    }

    // Flour Pack Problem
    public static boolean canPack3(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < bigCount; i++) {
            sum += 5;
            if (sum == goal) {
                return true;
            }
        }
        if ((sum > goal) && (smallCount >= (goal % 5))) {
            return true;
        } else if ((sum > goal) && (smallCount < (goal % 5))) {
            return false;
        } else {
            sum += smallCount;
        }

        return (sum >= goal);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false; // #1 validation
        }
        if (bigCount * 5 + smallCount < goal) {
            return false; // #2 supply must be greater than demand
        }
        return (goal % 5 <= smallCount); // #3 regardless of bigCount, remainder of goal has to be less than smallCount
    }

    // Largest Prime
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int largestPrime = 2;
        for (int i = number; i >= 2; i--) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag && (number % i == 0)) {
                largestPrime = i;
                break;
            }

        }
        return largestPrime;
    }

    public static int getLargestPrimeVerTwo(int number) {
        if (number < 2) {
            return -1;
        }
        for (int i = number / 2; i >= 2; i--) {
            if (number % i == 0) {
                number = i;
            }

        }
        return number;
    }

    // Diagonal Star
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 1; row <= number; row++) {
                for (int col = 1; col <= number; col++) {
                    if (row == 1 || row == number) {
                        System.out.print("*");
                    } else if (col == 1 || col == number) {
                        System.out.print("*");
                    } else if ((row == col) || col == ((number - row) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }
    }

}
