package ncTestScripts;

public class BankCustomers {

	String name;
	String accountNumber;
	int age;
	String accountType;
	double balance;

	public BankCustomers(String name, String accountNumber, int age, String accountType, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.age = age;
		this.accountType = accountType;
		this.balance = balance;
	}

	public static void main(String[] args) {
		BankCustomers customer1 = new BankCustomers("John", "123456789", 32, "CheckingAccount", 9000.00);
		System.out.println(customer1.name + " | " + customer1.accountNumber + " | " + customer1.accountType + " | "
				+ customer1.balance);

		BankCustomers customer2 = new BankCustomers("Maria", "567890123", 34, "SavingsAccount", 22000.00);
		System.out.println(customer2.name + " | " + customer2.accountNumber + " | " + customer2.accountType + " | "
				+ customer2.balance);

		BankCustomers customer3 = new BankCustomers("Ali", "987654321", 61, "RetirementAccount", 75000.00);
		System.out.println(customer3.name + " | " + customer3.accountNumber + " | " + customer3.accountType + " | "
				+ customer3.balance);

		BankCustomers customer4 = new BankCustomers("Ram", "872451065", 36, "MoneyMarketAccount", 5000.00);
		System.out.println(customer4.name + " | " + customer4.accountNumber + " | " + customer4.accountType + " | "
				+ customer4.balance);

	}

}
