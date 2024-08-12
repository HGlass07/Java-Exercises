package Inventory;

import java.util.HashMap;
import java.util.Map;

class Inventory {
    private Map<Integer, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    public void addProduct(Product product) {
        products.put(product.getProductID(), product);
        System.out.println("Product added: " + product.getProductName());
    }

    public void removeProduct(int productID) {
        Product removedProduct = products.remove(productID);
        if (removedProduct != null) {
            System.out.println("Product removed: " + removedProduct.getProductName());
        } else {
            System.out.println("Product ID " + productID + " not found.");
        }
    }

    public void checkLowInventory(int threshold) {
        System.out.println("Checking for products with quantity below " + threshold + ":");
        for (Product product : products.values()) {
            if (product.getQuantity() < threshold) {
                System.out.println(product);
            }
        }
    }

    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Current Inventory:");
            for (Product product : products.values()) {
                System.out.println(product);
            }
        }
    }
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("Laptop", 101, 10);
        Product product2 = new Product("Smartphone", 102, 5);
        Product product3 = new Product("Tablet", 103, 2);

        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        inventory.displayAllProducts();

        inventory.checkLowInventory(5);

        inventory.removeProduct(102);

        inventory.displayAllProducts();
    }
}
