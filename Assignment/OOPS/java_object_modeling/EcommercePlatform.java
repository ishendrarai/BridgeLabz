import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
}

class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrder() {
        for (Product p : products) {
            System.out.println(p.getName() + " $" + p.getPrice());
        }
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order o) {
        System.out.println(name + " placed an order:");
        o.showOrder();
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 800);
        Product p2 = new Product("Phone", 500);
        Order o = new Order();
        o.addProduct(p1);
        o.addProduct(p2);
        Customer c = new Customer("Asha");
        c.placeOrder(o);
    }
}
