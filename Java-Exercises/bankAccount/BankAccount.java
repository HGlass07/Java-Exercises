package bankAccount;

public class BankAccount {
	private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("11", "Sally Ryan", 5000.00);
        account1.displayAccountDetails();
        account1.deposit(200);
        account1.withdraw(100);
        account1.displayAccountDetails();

        System.out.println();

        SavingsAccount savingsAccount = new SavingsAccount("22", "Aaron Peele", 1000.00, 2.5);
        savingsAccount.displayAccountDetails();
        savingsAccount.deposit(500);
        savingsAccount.applyInterest(); 
        savingsAccount.displayAccountDetails();

	}

}
