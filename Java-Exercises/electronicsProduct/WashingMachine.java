package electronicsProduct;

public class WashingMachine extends electronicsProduct {
	private int warrenty;

    public WashingMachine(int productID, String productName, double price, int warrenty) {
        super(productID, productName, price);
        this.warrenty = warrenty;
    }
    
    public int getWarrenty() {
    	return warrenty;
    }
  
    public void increaseWarrenty(int warrentyIncrease) {
    	if (warrenty > 0) {
    		warrentyIncrease = warrenty += warrentyIncrease;
    		System.out.println("Warrenty of " + productName + " increased," + " new warrenty is: " + warrentyIncrease + " years");
    		}
    	}
    
    public void displayWashMachine() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Warrenty: " + warrenty + " years");
    }
    }

