import java.util.HashMap;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private double price;
    private HashMap<String, Double> additions = new HashMap<>();

    public Hamburger(String name, String breadRoll, String meat, double price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public void addAddition(String name, double price) {
        additions.put(name, price);
    }

    public double calcPrice() {
        double hamburgerPrice = price;
        System.out.printf("%s hamburger on a %s breadroll with %s. Default price is: %.2f\n", name, breadRoll, meat, price);
        if (additions.containsKey("lettuce")) {
            hamburgerPrice += additions.get("lettuce");
            System.out.printf("Added lettuce for an extra %.2f$\n", additions.get("lettuce"));
        }
        if (additions.containsKey("tomato")) {
            hamburgerPrice += additions.get("tomato");
            System.out.printf("Added tomato for an extra %.2f$\n", additions.get("tomato"));
        }
        if (additions.containsKey("cheese")) {
            hamburgerPrice += additions.get("cheese");
            System.out.printf("Added cheese for an extra %.2f$\n", additions.get("cheese"));
        }
        if (additions.containsKey("onions")) {
            hamburgerPrice += additions.get("onions");
            System.out.printf("Added onions for an extra %.2f$\n", additions.get("onions"));
        }
        return hamburgerPrice;
    }

    public HashMap<String, Double> getAdditions() {
        return additions;
    }

    public String getName() {
        return name;
    }
}
