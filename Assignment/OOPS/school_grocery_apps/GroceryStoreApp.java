import java.util.*;

class Product {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public Product(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public double getTotal() {
        return pricePerUnit * quantity;
    }

    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPricePerUnit() { return pricePerUnit; }
}

class Customer {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<Product> getProducts() { return products; }
    public String getName() { return name; }
}

class BillGenerator {
    public double generateBill(Customer c) {
        double total = 0;
        for (Product p : c.getProducts()) total += p.getTotal();
        return total;
    }
}

public class GroceryStoreApp {
    public static void main(String[] args) {
        Customer alice = new Customer("Alice");
        alice.addProduct(new Product("Apples", 3, 2)); 
        alice.addProduct(new Product("Milk", 2, 1));

        BillGenerator bg = new BillGenerator();
        System.out.println("Customer: " + alice.getName());
        for (Product p : alice.getProducts()) {
            System.out.println(p.getName() + " x " + p.getQuantity() + " @ $" + p.getPricePerUnit());
        }
        System.out.println("Total Bill: $" + bg.generateBill(alice));
    }
}
