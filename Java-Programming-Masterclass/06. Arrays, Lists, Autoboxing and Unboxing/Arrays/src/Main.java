import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*int[] array = getIntegers(6);
        array = sortIntegers(array);
        printArray(array);*/

/*        int n = readInteger();
        int[] array = readElements(n);
        System.out.println(findMin(array));*/

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12};
        reverse(array);
        System.out.println(Arrays.toString(array));

    }

    private static int[] getIntegers(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // Sorted Array
    private static int[] sortIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int max = array[i];
            int temp = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    temp = j;
                }
            }
            array[temp] = array[i];
            array[i] = max;
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d\n", i, array[i]);
        }
    }

    // Minimum Element Challenge
    private static int readInteger() {
        return scanner.nextInt();
    }

    private static int[] readElements(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    // Reverse Array
    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
