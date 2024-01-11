package try2;

import java.util.ArrayList;

public class Order {

    ArrayList<Product> basket = new ArrayList<>(); // 장바구니
    private int orderNumber; // 주문번호

    public Order() {
        orderNumber = 1; // 주문번호 1로 초기화
    }

    public ArrayList<Product> getBasket() { // 장바구니 가져오기
        return basket;
    }

    public int getOrderNumber() { // 주문번호 가져오기
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) { // 주문번호
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
