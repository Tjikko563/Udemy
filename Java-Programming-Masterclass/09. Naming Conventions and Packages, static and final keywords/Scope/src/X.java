public class X {
    private int x;

    public X(int x) {
        this.x = x;
        System.out.println("Value of x is : " + x);
    }

    public void x() {
        for (int x = 0; x <= 12; x++) {
            System.out.printf("%d multiplied by %d is: %d\n", x, this.x, x * this.x);
        }
    }
}
