public class While_Exercises {
    public static void main(String[] args) {

/*        int start = 4;
        int end = 22;
        int evenNumberCount = 0;
        while (start <= end) {
            start++;
            if (!isEvenNumber(start)) {
                continue;
            }
            System.out.println("Is an even number " + start);
            evenNumberCount++;
            if (evenNumberCount == 5) {
                break;
            }
        }
        System.out.println("Total number of even numbers found: " + evenNumberCount);*/

        System.out.println(sumDigits(5236));
    }

    // Is Even Number
    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }

    // Sum Digits
    public static int sumDigits(int number) {
        if (number <= 9) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
