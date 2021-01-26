public class StockItem implements Comparable<StockItem>{
    private final String name;
    private double price;
    private int quantityStock;
    private int reservedStock = 0;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void adjustStock(int quantity) {
        int newStock = this.quantityStock + quantity;
        if (newStock >= 0) {
            this.quantityStock = newStock;
        }
    }

    public int reserve(int reserveQuantity) {
        if (quantityStock - (reservedStock + reserveQuantity) >= 0) {
            reservedStock += reserveQuantity;
            return reserveQuantity;
        }
        return -1;
    }

    public void removeReservedStock(int removeQuantity) {
        reservedStock -= removeQuantity;
    }

    public int getReservedStock() {
        return reservedStock;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 57;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if ((obj != null) && (this.getClass() == obj.getClass())) {
            String objName = ((StockItem) obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }

    @Override
    public int compareTo(StockItem o) {
        if (this == o) {
            return 0;
        }

        if (o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException("Cannot compare to null");
    }
}
