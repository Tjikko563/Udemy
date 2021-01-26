public class Tesla extends Car{
    private String countryManufactured;

    public Tesla(String countryManufactured) {
        super(4, 5, "V6", 2500, "A", 230, "RWD", 4, "Electric");
        this.countryManufactured = countryManufactured;
    }

    public String getCountryManufactured() {
        return countryManufactured;
    }

    @Override
    public void changeGear() {
        System.out.println("Method Car.changeGear() called");
        super.changeGear();
    }

    public void changeGear(int gear) {
        System.out.println("Changed gear to: " + gear);
    }
}
