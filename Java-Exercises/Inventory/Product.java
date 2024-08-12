package Inventory;

class Product {
    private String productName;
    private int productID;
    private int quantity;

    public Product(String productName, int productID, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product ID: " + productID + ", Name: " + productName + ", Quantity: " + quantity;
    }
}
