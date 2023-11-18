package ordersystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		Client cli = new Client("Maria", "maria@gmail.com", sdf.parse("20/10/1995"));
		
		System.out.println(cli);
		
		scan.close();

	}

}
