package inheritanceandpolymorphism;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1020, "Alex", 1000.0);
		Account acc2 = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		//Polymorphism
		//Same operation of the same type but with different behaviors
		acc.withdraw(50.0);
		acc2.withdraw(50.0);
		
		System.out.println("Conta 1: " + acc.getBalance());
		System.out.println("Conta 2: " + acc2.getBalance());
	}

}
