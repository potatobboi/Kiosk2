package try2;

public class Product extends Menu {
    private double price;

    public Product(String name, double price, String detail) {
        super(name, detail);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
