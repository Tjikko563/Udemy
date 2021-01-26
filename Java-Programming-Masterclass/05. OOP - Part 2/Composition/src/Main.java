public class Main {
    public static void main(String[] args) {

        Bed bed = new Bed("one-person", "wood", true, new Dimensions(12,5,6));
        Wardrobe wardrobe = new Wardrobe("two-door", true, new Dimensions(10,6,7));
        Desk desk = new Desk( "wood", new Dimensions(15,21,1), true, "movable");
        Windows windows = new Windows(2, new Dimensions(15,6,8));
        Bedroom bedroom = new Bedroom(bed, wardrobe, desk, windows);

        //bedroom.moveDesk();
        bedroom.windowsState(false);
        bedroom.getDesk().moveDesk();
    }
}
