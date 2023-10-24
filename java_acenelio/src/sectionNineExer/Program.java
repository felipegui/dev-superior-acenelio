//Exer. Seção 9 - Conta Bancária
package sectionNineExer;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Program {

	public static void main( String[] args ) {
		
		Locale.setDefault( Locale.US );
		
		Account account;
		
		String number = JOptionPane.showInputDialog( "Enter account number" );
		int number1 = Integer.parseInt(number);
		
		String holder = JOptionPane.showInputDialog( "Enter account holder" );
		
		int response = JOptionPane.showConfirmDialog( null, "Is there an initial deposit (y/n)?", "kkkkkk", JOptionPane.YES_NO_OPTION );
		
		double initialDeposit2;
		if (response == 0) {
			String initialDeposit = JOptionPane.showInputDialog( "Enter initial deposit value" );
			initialDeposit2 = Double.parseDouble( initialDeposit );
			
			account = new Account( number1, holder, initialDeposit2 );
		} else {
			
			account = new Account( number1, holder );
		}
		
		JOptionPane.showMessageDialog(null, account, "Account Data", JOptionPane.INFORMATION_MESSAGE);
		
		String depositValue = JOptionPane.showInputDialog( "Enter a deposit value" );
		double depositValue2 = Double.parseDouble( depositValue );
		
		account.deposit( depositValue2 );
		
		JOptionPane.showMessageDialog( null, account, "Updated account data", JOptionPane.INFORMATION_MESSAGE );
		
		String withdrawValue = JOptionPane.showInputDialog( "Enter a withdraw value" );
		double withdrawValue2 = Double.parseDouble( withdrawValue );
		
		account.withdraw( withdrawValue2 );
		
		JOptionPane.showMessageDialog( null, account, "Updated account data", JOptionPane.INFORMATION_MESSAGE );
		
		System.exit(0);

	}

}
