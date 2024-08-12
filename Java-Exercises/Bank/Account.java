package Bank;

public class Account {
	private String accountName;
	private String accountNumber;
	private double balance;
	
	public Account(String accountName, String accountNumber, double balance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccName() {
		return accountName;
	}
	public String getAccNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

}
