public class PrinterNew {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public PrinterNew(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void getTonerLevel() {
        System.out.println("Current toner level: " + tonerLevel + "%");
        System.out.println("Toner needed: " + (100 - tonerLevel) + "%");
    }

    public void fillToner(int extraToner) {
        if (tonerLevel + extraToner <= 100) {
            System.out.println("Toner level has been refilled to: " + (tonerLevel + extraToner) + "%");
            tonerLevel += extraToner;
        } else if (tonerLevel + extraToner > 100) {
            System.out.println("Toner level has been refilled to: 100%. Remaining toner in capsule: " +
                    +((tonerLevel + extraToner) - 100) + "%");
            tonerLevel = 100;
        }
    }

    public void printPage(int numberOfPagesPrinted) {
        if (tonerUsed(numberOfPagesPrinted) <= tonerLevel) {
            if (isDuplex) {
                this.numberOfPagesPrinted += Math.ceil((double) numberOfPagesPrinted / 2);
            } else {
                this.numberOfPagesPrinted += numberOfPagesPrinted;
            }
            System.out.println("Printed " + numberOfPagesPrinted + " pages. Total pages printed: " +
                    + this.numberOfPagesPrinted);
            tonerLevel -= tonerUsed(numberOfPagesPrinted);
        } else {
            System.out.println("Not enough toner. Refill required. Can only print: " + (tonerLevel * 100) + " pages");
        }
    }

    public int tonerUsed(int numberOfPagesQueried) {
        return (numberOfPagesQueried / 100);
    }

}
