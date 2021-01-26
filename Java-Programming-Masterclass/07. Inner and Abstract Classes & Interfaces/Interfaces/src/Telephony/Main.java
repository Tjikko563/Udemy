package Telephony;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Smartphone smartphone;


        String[] numbers = scanner.nextLine().split(" ");
        String[] urls = scanner.nextLine().split(" ");

        smartphone = new Smartphone(List.of(numbers), List.of(urls));

        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());

    }
}

