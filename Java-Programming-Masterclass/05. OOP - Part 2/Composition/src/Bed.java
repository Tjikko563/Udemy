public class Bed {
    private String type;
    private String material;
    private boolean matresFrame;
    private Dimensions dimensions;

    public Bed(String type, String material, boolean matresFrame, Dimensions dimensions) {
        this.type = type;
        this.material = material;
        this.matresFrame = matresFrame;
        this.dimensions = dimensions;
    }
}
