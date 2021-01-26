import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new HashMap<>();
    }

    public int addStock(StockItem item) {
        if (item != null) {
            StockItem newItem = list.getOrDefault(item.getName(), item);
            if (newItem != item) {
                item.adjustStock(newItem.getQuantityStock());
            }
            list.put(item.getName(), item);
        }
        return 0;
    }

    public int sellStock(String name, int quantity) {
        StockItem item = list.getOrDefault(name, null);
        if ((item != null) && (item.getQuantityStock() >= quantity) && (quantity > 0)) {
            item.adjustStock(-quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem getItem(String name) {
        return list.get(name);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List\n";
        double totalCost = 0;
        for (Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();
            //double itemValue = stockItem.getPrice() * (stockItem.getQuantityStock() - stockItem.getReservedStock());
            double itemValue = stockItem.getPrice() * (stockItem.getQuantityStock());
            s = s + stockItem.getName() + ". There are " +
                    (stockItem.getQuantityStock()) +
                    " in stock. Value of items: ";
            s = s + itemValue + "\n";
            totalCost += itemValue;
        }

        return s + "Total stock value " + totalCost;
    }
}
