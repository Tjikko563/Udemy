import java.util.ArrayList;

public class Coding_Exercises {
    public static void main(String[] args) {

        //System.out.println(isPalindrome(-1001));
        //System.out.println(sumFirstAndLastDigit(257));
        //System.out.println(getEvenDigitSum(123456789));
        //System.out.println(hasSharedDigit(1367513757, 984984987));
        //System.out.println(hasSameLastDigit(23, 34, 46));
        //System.out.println(isValid(9));
        //System.out.println(getGreatestCommonDivisor(1010, 10));
        //printFactors(10);
        //System.out.println(isPerfectNumber(0));
        numberToWords(0);
        System.out.println(reverse(361));
        System.out.println(getDigitCount(-222));

    }

    // Number Palindrome
    public static boolean isPalindrome(int number) {
        String newNumber = "";
        int oldNumber = number;
        if (number < 0) {
            number *= -1;
            newNumber += "-";
        }
        while (number > 0) {
            newNumber += number % 10;
            number /= 10;
        }

        return (Integer.parseInt(newNumber) == oldNumber);
    }

    // First And Last Digit Sum
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit = number % 10;
        while (number > 0) {
            if (number / 10 == 0) {
                sum += (lastDigit + (number % 10));
            }
            number /= 10;
        }
        return sum;
    }

    // Even Digit Sum
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int currentDigit = 0;
        while (number > 0) {
            currentDigit = number % 10;
            if (currentDigit % 2 == 0) {
                sum += currentDigit;
            }
            number /= 10;
        }
        return sum;
    }

    // Shared Digit
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        ArrayList<Integer> firstNumberDigits = new ArrayList<>();
        ArrayList<Integer> secondNumberDigits = new ArrayList<>();

        if (firstNumber < 10 || firstNumber > 99) {
            return false;
        } else if (secondNumber < 10 || secondNumber > 99) {
            return false;
        }
        while (firstNumber > 0) {
            firstNumberDigits.add(firstNumber % 10);
            firstNumber /= 10;
        }
        while (secondNumber > 0) {
            secondNumberDigits.add(secondNumber % 10);
            secondNumber /= 10;
        }
        if (firstNumberDigits.size() >= secondNumberDigits.size()) {
            for (int i = 0; i < secondNumberDigits.size(); i++) {
                for (int j = 0; j < firstNumberDigits.size(); j++) {
                    if (secondNumberDigits.get(i).equals(firstNumberDigits.get(j))) {
                        return true;
                    }
                }
            }
        } else {
            for (int i = 0; i < firstNumberDigits.size(); i++) {
                for (int j = 0; j < secondNumberDigits.size(); j++) {
                    if (firstNumberDigits.get(i).equals(secondNumberDigits.get(j))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Last Digit Checker
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        if (!isValid(firstNumber) || !isValid(secondNumber) || !isValid(thirdNumber)) {
            return false;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(firstNumber % 10);
        arr.add(secondNumber % 10);
        arr.add(thirdNumber % 10);
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).equals(arr.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        return !(number < 10 || number > 1000);
    }

    // Greatest Common Divisor
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int count = 1;
        for (int i = 1; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
                count = i;
            }
        }
        return count;
    }

    // All Factors
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    // Perfect Number
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // Number To Words
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            String[] arr = {"Zero", "One", "Two", "Three", "Four",
                    "Five", "Six", "Seven", "Eight", "Nine"};
            int reversedNumber = reverse(number);
            int numberDigitCount = getDigitCount(number);

            while (numberDigitCount > 0) {
                numberDigitCount--;
                int digit = reversedNumber % 10;
                System.out.println(arr[digit]);
                reversedNumber /= 10;
            }
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        while(number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count > 0 ? count : 1;
    }
}
