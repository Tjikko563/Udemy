public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double healthyBurgerPrice = super.itemizeHamburger();
        if (healthyExtra1Name != null) {
            healthyBurgerPrice += healthyExtra1Price;
            System.out.printf("Added %s for an extra %.2f\n", healthyExtra1Name, healthyExtra1Price);
        }
        if (healthyExtra2Name != null) {
            healthyBurgerPrice += healthyExtra2Price;
            System.out.printf("Added %s for an extra %.2f\n", healthyExtra2Name, healthyExtra2Price);
        }
        return healthyBurgerPrice;
    }
}
