public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int weight, int size, int eyes, int legs,
               int tail, int teeth, String coat) {
        super(name, 1, 1, weight, size);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog is walking");
        move(5);
    }

    public void run() {
        System.out.println("Dog is running");
        move(150);
    }

    public void moveLeft(int speed) {
        System.out.println("Dog.moveLeft() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLeft(speed);
        super.move(speed);
    }
}
