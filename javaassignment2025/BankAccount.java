package javaassignment2025;

public class BankAccount {

	String accountNumber;
	double balance;

	public BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
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
		ba.withdraw(9500);

	}

}

//Questions:
//1.What is the purpose of an instance variable in Java?They define the attributes or state of an object.Every time you create a new BankAccount object (like ba in your main method), it gets its own unique copy of accountNumber and balance.
//2.How are instance variables different from local variables in Java?
//Scope: Instance variables are declared in the class and are accessible by all methods in that class. Local variables (like depositAmount in your code) are declared inside a method and can only be used within that specific method.
//Lifetime: Instance variables stay in memory as long as the object exists. Local variables are destroyed as soon as the method finishes execution.
//Default Values: Instance variables have default values (e.g., 0.0 for double, null for String). Local variables do not have defaults and must be initialized before use.
//3.What is the access level of an instance variable in Java?
//Public: Accessible from any class
//Private: Accessible only within the same class (recommended for encapsulation)
//Protected: Accessible within the same package and subclasses
//Default (No modifier)
//4.What is the purpose of a method in Java?It contains the code that performs some logic
//5.Can a method call other methods within the same class?A method can call another method within the same class - Refer Method Chaining