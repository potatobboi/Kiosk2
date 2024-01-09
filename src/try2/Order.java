package try2;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> basket = new ArrayList<>();
    private int orderNumber;

    public Order() {
        orderNumber = 1;
    }

    public ArrayList<Product> getBasket() {
        return basket;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void addBasket(Product menu) {
        basket.add(menu);
    }

    public void clearBasket() {
        basket.clear();
    }

    public double totalPrice() {
        double total = 0;
        for (Product menu : basket) {
            total += menu.getPrice();
        }
        return total;
    }
}
