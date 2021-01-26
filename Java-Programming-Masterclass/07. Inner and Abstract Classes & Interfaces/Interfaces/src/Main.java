import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Citizen> citizens = new ArrayList<>();
    private static List<Rebel> rebels = new ArrayList<>();
    private static List<String> purchasedFood = new ArrayList<>();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String[] splitter = scanner.nextLine().split(" ");
            try {
                Long.parseLong(splitter[2]);
                citizens.add(new Citizen(splitter[0], Integer.parseInt(splitter[1]), splitter[2], splitter[3]));
            } catch (Exception e) {
                rebels.add(new Rebel(splitter[0], Integer.parseInt(splitter[1]), splitter[2]));
            }
        }

        String name = scanner.nextLine();
        int sumFood = 0;

        while (!name.equals("End")) {
            purchasedFood.add(name);
            name = scanner.nextLine();
        }

        for (int i = 0; i < citizens.size(); i++) {
            for (int j = 0; j < purchasedFood.size(); j++) {
                if (citizens.get(i).getName().equals(purchasedFood.get(j))) {
                    sumFood += 10;
                }
            }
        }

        for (int i = 0; i < rebels.size(); i++) {
            for (int j = 0; j < purchasedFood.size(); j++) {
                if (rebels.get(i).getName().equals(purchasedFood.get(j))) {
                    sumFood += 5;
                }
            }
        }

        System.out.println(sumFood);
        scanner.close();
    }
}
