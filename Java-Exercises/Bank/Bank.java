package Bank;


import java.util.HashMap;
import java.util.Map;


public class Bank {
	private Map<String, Account> accounts;
	
	public Bank() {
		accounts = new HashMap<>();
	}
	
	public void addAccount(String accountName, String accountNumber, double balance) {
		if (!accounts.containsKey(accountNumber)) {
			Account newAccount = new Account(accountName, accountNumber, balance);
			accounts.put(accountNumber, newAccount);
			System.out.println("Account " + accountNumber + " added");
		} else {
			System.out.println("Account " + accountNumber + " already added");
		}
	}
	public void removeAccount(String accountNumber) {
		if (accounts.containsKey(accountNumber)) {
			accounts.remove(accountNumber);
			System.out.println("Account " + accountNumber + " removed");
		} else {
			System.out.println("Account " + accountNumber + " not found");
		}
	}
	
	public void depositFunds(String accountNumber, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			account.deposit(amount);
		} else {
			System.out.println("Account not found");
		}
	}
	
	public void withdrawFunds(String accountNumber, double amount) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			account.withdraw(amount);
		} else {
			System.out.println("Account not found");	
		}
	}
	
	public void displayAccount(String accountNumber) {
		Account account = accounts.get(accountNumber);
		if (account != null) {
			System.out.println("Account Number: " + account.getAccNumber());
            System.out.println("Account Holder: " + account.getAccName());
            System.out.println("Balance: " + account.getBalance());
		} else {
			System.out.println("Account not found");
		}
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.addAccount("Tom", "1234", 1000);
		bank.addAccount("Linda", "5678", 0);
		
		bank.displayAccount("1234");
		bank.displayAccount("5678");
		
		bank.depositFunds("1234", 100);
		bank.depositFunds("5678", 2000);
		
		bank.displayAccount("1234");
		bank.displayAccount("5678");
		
		bank.withdrawFunds("5678", 35.8);
		
		bank.displayAccount("1234");
		bank.displayAccount("5678");


	}

}
