public class Windows {
    private int count;
    private Dimensions dimensions;

    public Windows(int count, Dimensions dimensions) {
        this.count = count;
        this.dimensions = dimensions;
    }

    public void manipulateWindows(boolean state) {
        if (state) {
            System.out.println("Opened " + count + " windows");
        } else {
            System.out.println("Closed " + count + " windows");
        }
    }
}
