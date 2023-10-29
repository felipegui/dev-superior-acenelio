//Seção 10: Exer do pensionato
package boardinghouse;

import java.util.Locale;

import javax.swing.JOptionPane;

public class Program {

	public static void main( String[] args ) {
		
		Locale.setDefault(Locale.US);
		
		Rent[] vect = new Rent[ 10 ];
		
		String n = JOptionPane.showInputDialog( "How many rooms will be rented?" );
		int n1 = Integer.parseInt( n );
		
		int roomNumber1;
		
		for ( int i = 1; i <= n1; i++ ) {
			String name = JOptionPane.showInputDialog( null, "Name", "Rent ## " + i +" ##", JOptionPane.INFORMATION_MESSAGE );
			
			String email = JOptionPane.showInputDialog( null, "Email", "Rent ## " + i +" ##", JOptionPane.INFORMATION_MESSAGE );
			
			String roomNumber = JOptionPane.showInputDialog( null, "Room", "Rent ## " + i +" ##", JOptionPane.INFORMATION_MESSAGE );
			roomNumber1 = Integer.parseInt( roomNumber );
			
			vect[ roomNumber1 ] = new Rent( name, email );
		}
		
		for ( int i = 0; i < 10; i++ ) {
			
			if ( vect[ i ] != null ) {
				JOptionPane.showMessageDialog( null, vect[ i ], "Busy rooms", JOptionPane.INFORMATION_MESSAGE );
			}
		}
		System.exit(0);

	}

}
