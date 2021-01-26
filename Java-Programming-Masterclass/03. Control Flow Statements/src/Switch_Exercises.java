public class Switch_Exercises {
    public static void main(String[] args) {

    }

    // Number In Word
    public static void printNumberInWord(int value) {
        String[] arr = {"ZERO", "ONE", "TWO", "THREE", "FOUR",
                "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        if (value < 0 || value > 9) {
            System.out.println("OTHER");
        } else {
            System.out.println(arr[value]);
        }
    }

    // Number Of Days In Month
    public static boolean isLeapYear(int year) {
        if (year <= 0 || year > 9999) {
            return false;
        }

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
    }

    public static int getDaysInMonth(int month, int year) {
        int[] arr = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }

        if (month == 2 && isLeapYear(year)) {
            return 29;
        } else {
            return arr[month];
        }
    }
}
