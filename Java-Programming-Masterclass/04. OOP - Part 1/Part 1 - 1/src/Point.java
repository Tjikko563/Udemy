public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        int distance = ((0 - x) * (0 - x)) + ((0 - y) * (0 - y));
        return Math.sqrt(distance);
    }

    public double distance(int x, int y) {
        int distance = ((this.x - x) * (this.x - x)) + ((this.y - y) * (this.y - y));
        return Math.sqrt(distance);
    }

    public double distance(Point another) {
        int distance = ((another.getX() - x) * (another.getX() - x)) + ((another.getY() - y) * (another.getY() - y));
        return Math.sqrt(distance);
    }
}
