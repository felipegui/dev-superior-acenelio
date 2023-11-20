package inheritanceandpolymorphism;

public class SavingsAccountPlus extends SavingsAccount {

	// Overlay
	//In this example the method has an error
	@Override
	public void withdraw(Double amount) {
		balance -= amount + 2.0;
	}
}
