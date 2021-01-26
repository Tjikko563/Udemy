public class DeluxeHamburger extends Hamburger{
    public DeluxeHamburger(String breadRoll) {
        super("Deluxe", breadRoll, "Beef", 7.99);
        super.addAddition("chips", 1.25);
        super.addAddition("coke", 1);
    }

    @Override
    public double calcPrice() {
        double hamburgerPrice = super.calcPrice();
        hamburgerPrice += (getAdditions().get("chips") + getAdditions().get("coke"));
        System.out.printf("Added chips for an extra %.2f$\n", getAdditions().get("chips"));
        System.out.printf("Added coke for an extra %.2f$\n", getAdditions().get("coke"));
        return hamburgerPrice;
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("Not allowed on deluxe menu");
    }
}
