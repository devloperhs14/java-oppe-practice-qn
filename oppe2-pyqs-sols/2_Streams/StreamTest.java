import java.util.*;
import java.util.stream.*;

class Product {
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String n, double p, int sq) {
        name = n;
        price = p;
        stockQuantity = sq;
    }

    public String toString() {
        return name + "- " + price + "- In Stock: " + stockQuantity;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    // define method productProcessor
    public static Stream<Product> productProcessor(ArrayList<Product> products){
        return products.stream().
            filter(p -> p.getPrice() > 5000 && p.getStockQuantity() > 10);
            // or
            // .filter(p -> p.getPrice() > 5000)
            // .filter(p -> p.getStockQuantity() > 10);
    }
    
}

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            Product product = new Product(sc.next(), sc.nextDouble(), sc.nextInt());
            products.add(product);
        }
        
        Stream<Product> filteredStream = Product.productProcessor(products);
        System.out.println("Premium Products with Sufficient Stock:");
        filteredStream.forEach(System.out::println);
        
        sc.close();
    }
}