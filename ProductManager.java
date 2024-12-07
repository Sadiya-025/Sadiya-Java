import java.util.Vector;
import java.util.Comparator;
import java.util.Enumeration;

class Product {
    public String productName;
    public double productPrice;

    public Product(String name, int price) {
        this.productName = name;
        this.productPrice = price;
    }

    public String getName() {
        return this.productName;
    }

    public double getPrice() {
        return this.productPrice;
    }
}

public class ProductManager {
    public static void main(String[] args) {
        Vector<Product> products = new Vector<>();
        products.add(new Product("Sofa", 20000));
        products.add(new Product("T.V", 10000));
        display(products);
        products.sort(Comparator.comparingDouble(Product::getPrice));
        display(products);
    }

    public static void display(Vector<Product> products) {
        Enumeration<Product> enumeration = products.elements();
        while (enumeration.hasMoreElements()) {
            Product product = enumeration.nextElement();
            System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        }
    }
}