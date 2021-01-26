public class HealthyBurger extends Hamburger{
    public HealthyBurger(String meat, double price) {
        super("Healthy", "rye", meat, price);
    }

    @Override
    public double calcPrice() {
        double hamburgerPrice = super.calcPrice();
        if (getAdditions().containsKey("egg")) {
            hamburgerPrice += getAdditions().get("egg");
            System.out.printf("Added egg for an extra %.2f$\n", getAdditions().get("egg"));
        }
        if (getAdditions().containsKey("pickles")) {
            hamburgerPrice += getAdditions().get("pickles");
            System.out.printf("Added pickles for an extra %.2f$\n", getAdditions().get("pickles"));
        }
        return hamburgerPrice;
    }
}
