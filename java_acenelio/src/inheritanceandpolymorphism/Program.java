package inheritanceandpolymorphism;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withdraw(200.0);
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		
		System.out.println("Conta 1: " + acc.getBalance());
		System.out.println("Conta 2: " + acc2.getBalance());
		System.out.println("Conta 3: " + acc3.getBalance());
	}

}
