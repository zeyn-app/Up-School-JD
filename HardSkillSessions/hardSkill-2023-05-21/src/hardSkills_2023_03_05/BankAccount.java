package hardSkills_2023_03_05;

public class BankAccount {
	String accountNumber;
	String ownerFirstName;
	String ownerLastName;
	
	// nesne değişkeni olduğu için atama yapılmazsa default değer alacaktır.
	// balance = 0 şeklinde olacaktır.
	double balance;
	
	// constructor --> nesne new lendiğinde ilk çağrılan metoddur.
	
	public BankAccount(String accountNumber, String ownerFirstName, String ownerLastName,double balance) {
		this.accountNumber = accountNumber;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.balance = balance;
	}
	
	public BankAccount() {
		
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		if(amount<=balance) balance -= amount;
		else System.out.println("Hesabınızda yeterli para bulunmamaktadır.");
	}
	
	public void displayBalance() {
		System.out.println("Hesap bakiyeniz: " + balance);
	}
}
