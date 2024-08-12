package Customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private String email;
	private List<Double> purchaseHistory;

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
		this.purchaseHistory = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public List<Double> getPurchaseHistory() {
        return purchaseHistory;
    }
	
	
	public void addPurchase(double amount) {
        purchaseHistory.add(amount);
        System.out.println("Purchase of $" + amount + " added to history.");
    }

    public double calculateTotalPurchases() {
        double total = 0;
        for (double purchase : purchaseHistory) {
            total += purchase;
        }
        return total;
    }
    
    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer Email: " + email);
        System.out.println("Total Expenditure: $" + calculateTotalPurchases());
    }
	
	public static void main(String[] args) {
		Customer customer1 = new Customer("Joe Bloggs", "jb@example.com");
        customer1.addPurchase(100);
        customer1.addPurchase(50);
        customer1.addPurchase(70);
        customer1.addPurchase(30);
        customer1.addPurchase(40);
        customer1.displayCustomerInfo();


        loyalCustomer loyalCustomer1 = new loyalCustomer("Sarah Jones", "sarah.Jones@example.com", 0.1); // 10% discount
        loyalCustomer1.addPurchase(200);
        loyalCustomer1.addPurchase(150);
        loyalCustomer1.addPurchase(100);
        loyalCustomer1.addPurchase(80);
        loyalCustomer1.addPurchase(120);
        loyalCustomer1.addPurchase(50);  
        loyalCustomer1.displayCustomerInfo();

	}

}
