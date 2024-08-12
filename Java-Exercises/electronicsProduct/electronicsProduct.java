package electronicsProduct;

public class electronicsProduct {
	protected int productID;
	protected String productName;
	protected double price;
	
	public electronicsProduct(int productID, String productName, double price) {
		this.productID = productID;
		this.productName = productName;
		this.price = price;
	}
	
	public int getID() {
		return productID;
	}
	public String getName() {
		return productName;
	}
	public double getPrice() {
		return price;
	}
	
	public void displayProductInfo() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
	
	public void applyDiscount(double percentage) {
		if (percentage > 0) {
			this.price -= this.price * (percentage / 100);
			this.price = Math.round(this.price * 10.0) / 10.0;
			System.out.println(productName + " discounted at " + percentage + " percent");
		} else {
			System.out.println("Invalid item");
		}
	}
	

	public static void main(String[] args) {
		electronicsProduct dishWasher = new electronicsProduct(1234, "Dish Washer", 430.99);
		electronicsProduct toaster = new electronicsProduct(9125, "Toaster", 80);
		
		dishWasher.displayProductInfo();
		dishWasher.applyDiscount(15);
		dishWasher.displayProductInfo();
		
		toaster.displayProductInfo();
		toaster.applyDiscount(10);
		toaster.displayProductInfo();
		
		
		WashingMachine washingMachine1 = new WashingMachine(4467, "Washomatic", 500, 5);
		
		washingMachine1.displayWashMachine();
		washingMachine1.increaseWarrenty(2);
		washingMachine1.displayWashMachine();

	}

}
