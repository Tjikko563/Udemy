import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket timsBasket = new Basket("Tim");
        timsBasket.addToBasket(stockList.getItem("car"), 2);
        timsBasket.addToBasket(stockList.getItem("juice"), 4);
        timsBasket.addToBasket(stockList.getItem("cup"), 12);
        timsBasket.addToBasket(stockList.getItem("bread"), 1);
        System.out.println("\n" + timsBasket);

        Basket todsBasket = new Basket("Todor");
        todsBasket.addToBasket(stockList.getItem("car"), 1);
        todsBasket.addToBasket(stockList.getItem("juice"), 32);
        todsBasket.removeFromBasket(stockList.getItem("juice"), 30);
        todsBasket.addToBasket(stockList.getItem("cup"), 12);
        todsBasket.addToBasket(stockList.getItem("bread"), 1000);
        System.out.println("\n" + todsBasket);

        checkOut(timsBasket);
        checkOut(todsBasket);
        checkOut(todsBasket);

        System.out.println("ASD");
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
            item.getKey().removeReservedStock(item.getValue());
        }
        basket.clearBasket();
    }
}

    /*public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.getItem(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }*/