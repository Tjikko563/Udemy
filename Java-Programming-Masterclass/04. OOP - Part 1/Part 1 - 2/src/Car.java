public class Car extends Vehicle {
    private String steering;
    private int doors;
    private String type;

    public Car(int wheels, int seats, String engine, int weight, String category, int speed, String steering, int doors, String type) {
        super(wheels, seats, engine, weight, category, speed);
        this.steering = steering;
        this.doors = doors;
        this.type = type;
    }

    public void changeGear() {
        System.out.println("Changed Gear");
    }

    public void movement(int speed) {
        if (speed > 0) {
            System.out.println("Increasing speed by: " + speed);
        } else {
            System.out.println("Decreasing speed by: " + Math.abs(speed));
        }
    }

    public String getSteering() {
        return steering;
    }

    public int getDoors() {
        return doors;
    }

    public String getType() {
        return type;
    }

}
