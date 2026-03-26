package javaassignment2025;

public class BankAccount_Encapsulation {

	String accountNumber;
	double balance;
	String owner;

	public BankAccount_Encapsulation(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public double deposit(double depositAmount) {
		balance = balance + depositAmount;
		return balance;
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance) {
			balance = balance - withdrawAmount;
			System.out.println("Balance after withdraw " +balance);

		}
		else {
			System.out.println("No sufficient balance.Cannot withdraw!");
		}
		
	}

	public static void main(String[] args) {

		BankAccount ba = new BankAccount("12345", 4000.25);
		System.out.println("Available balance " + ba.balance);
		double balance1 = ba.deposit(1780);
		System.out.println("Balance after deposit " + balance1);
		ba.withdraw(1500);

	}


}

//Questions:
//1.How can encapsulation be used to hide implementation details from user of a class?By making variables private, the user of the class cannot see "how" the data is stored. They only interact with the public methods (the interface), which keeps the internal logic hidden.
//2.What are the benefits of using private attributes in a class?The main benefit is protection. It prevents outside code from accidentally changing your data to something wrong or invalid, ensuring the object stays reliable.
//3.What is the difference between a getter method and a setter method?A Getter is used to read or retrieve the value of a private variable/A Setter is used to update or change the value of a private variable.
//4.How can encapsulation improve the readability of code?It makes code cleaner because the user of the class doesn't need to understand complex internal variables; they only need to look at simple, well-named methods like deposit() or withdraw()
