import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final String name;
    private Map<StockItem, Integer> basket;

    public Basket(String name) {
        this.name = name;
        this.basket = new HashMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if (item != null && quantity > 0) {
            int quantityInBasket = basket.getOrDefault(item, 0);
            if (item.reserve(quantityInBasket + quantity) == -1) {
                System.out.println("Cannot add item to basket.");
                return 0;
            }
            basket.put(item, quantityInBasket + quantity);
            return quantityInBasket;

        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if ((basket.containsKey(item)) && (item != null) && (quantity >= 0 && quantity <= basket.get(item))) {
            item.removeReservedStock(quantity);
            basket.put(item, basket.get(item) - quantity);
            if (basket.get(item) == 0) {
                basket.remove(item);
            }
            return quantity;
        }
        return 0;
    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(basket);
    }

    public void clearBasket() {
        basket = new HashMap<>();
    }

    @Override
    public String toString() {
        String s = "Basket " + name + " contains " + basket.size() + " items\n";
        double totalPrice = 0;
        for (Map.Entry<StockItem, Integer> item : basket.entrySet()) {
            s = s + item.getKey().getName() + ": " + item.getValue() + " reserved.\n";
            totalPrice += item.getKey().getPrice() * item.getValue();
        }

        return s + "Total cost " + totalPrice;
    }
}
