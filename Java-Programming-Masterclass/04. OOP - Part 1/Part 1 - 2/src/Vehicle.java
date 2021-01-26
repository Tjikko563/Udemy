public class Vehicle {
    private int wheels;
    private int seats;
    private String engine;
    private int weight;
    private String category;
    private int speed;

    public Vehicle(int wheels, int seats, String engine, int weight, String category, int speed) {
        this.wheels = wheels;
        this.seats = seats;
        this.engine = engine;
        this.weight = weight;
        this.category = category;
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public int getWeight() {
        return weight;
    }

    public String getCategory() {
        return category;
    }

    public int getSpeed() {
        return speed;
    }

}
