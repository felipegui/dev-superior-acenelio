package inheritanceandpolymorphism;

public class Program {

	public static void main(String[] args) {
		
		//Account acc = new Account();
		
		//BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//Up casting - Convert an object from the sub class to a super class
		//Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//Down casting - Convert an object from the super class to a sub class
		//Force conversion from superclass to subclass, cast manually
		BusinessAccount bacc1 = (BusinessAccount)acc2;
		bacc1.loan(100.0);
		
		//It will give an error when run! How to avoid?
		//BusinessAccount bacc2 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bacc2 = (BusinessAccount)acc3;
			bacc2.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount bacc2 = (SavingsAccount)acc3;
			bacc2.updateBalance();
			System.out.println("Update!");
		}
	}

}
