public class Desk {
    private String type;
    private String material;
    private Dimensions dimensions;
    private boolean drawer;

    public Desk(String material, Dimensions dimensions, boolean drawer, String type) {
        this.material = material;
        this.dimensions = dimensions;
        this.drawer = drawer;
        this.type = type;
    }

    public void moveDesk() {
        if (type.equals("movable")) {
            System.out.println("Moving desk");
        } else {
            System.out.println("Can't move dest");
        }
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public boolean isDrawer() {
        return drawer;
    }
}
