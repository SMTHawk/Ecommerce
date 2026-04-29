import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private String category;
    private double price;
    private String shipFrom;

    public Product(String name, String category, double price, String shipFrom) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.shipFrom = shipFrom;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public String getShipFrom() {
        return shipFrom;
    }

    @Override
    public String toString() {
        return name + " | " + category + " | $" + price + " | Ships from: " + shipFrom;
    }
}

public class ProductSeeder {

    public static List<Product> getSampleProducts() {
        List<Product> products = new ArrayList<>();

        products.add(new Product("iPhone 14", "Electronics", 799.99, "USA"));
        products.add(new Product("Samsung Galaxy S23", "Electronics", 699.99, "South Korea"));
        products.add(new Product("Nike Running Shoes", "Footwear", 120.00, "Vietnam"));
        products.add(new Product("Levi's Jeans", "Clothing", 59.99, "Bangladesh"));
        products.add(new Product("Sony Headphones", "Electronics", 149.99, "Japan"));
        products.add(new Product("Wooden Dining Table", "Furniture", 499.99, "USA"));
        products.add(new Product("Instant Pot Cooker", "Home Appliances", 89.99, "China"));
        products.add(new Product("Dell Laptop", "Electronics", 999.99, "USA"));
        products.add(new Product("Adidas T-Shirt", "Clothing", 25.00, "Indonesia"));
        products.add(new Product("Gaming Mouse", "Electronics", 49.99, "China"));

        return products;
    }

    public static void main(String[] args) {
        List<Product> products = getSampleProducts();

        // For now, just print them (replace this with DB insert logic)
        for (Product p : products) {
            System.out.println(p);
        }
    }
}