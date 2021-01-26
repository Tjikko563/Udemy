public class Bedroom {
    private Bed bed;
    private Wardrobe wardrobe;
    private Desk desk;
    private Windows windows;

    public Bedroom(Bed bed, Wardrobe wardrobe, Desk desk, Windows windows) {
        this.bed = bed;
        this.wardrobe = wardrobe;
        this.desk = desk;
        this.windows = windows;
    }

    public void windowsState(boolean state) {
        windows.manipulateWindows(state);
    }

    public Bed getBed() {
        return bed;
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }

    public Desk getDesk() {
        return desk;
    }

    public Windows getWindows() {
        return windows;
    }
}
