public class Main {
    public static void main(String[] args) {

        /*PrinterNew printerNew = new PrinterNew(35, 350, false);
        printerNew.getTonerLevel();
        printerNew.fillToner(50);
        printerNew.printPage(3600);
        printerNew.getTonerLevel();
        printerNew.printPage(4900);*/

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println(printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(pagesPrinted + " " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println(pagesPrinted + " " + printer.getPagesPrinted());
    }
}
