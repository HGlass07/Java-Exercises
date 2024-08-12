package Customer;

public class loyalCustomer extends Customer {
	private double discount;

    public loyalCustomer(String name, String email, double discount) {
        super(name, email);
        this.discount = discount;
    }

    public double getDiscountRate() {
        return discount;
    }

    public void setDiscountRate(double discountRate) {
        this.discount = discountRate;
    }

    @Override
    public void addPurchase(double amount) {
        double discountedAmount = amount * (1 - discount);
        super.addPurchase(discountedAmount);
        System.out.println("Purchase of $" + amount + " with discount applied: $" + discountedAmount);
    }

}
