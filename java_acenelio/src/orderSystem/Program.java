package orderSystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy");
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Email: ");
		String email = scan.next();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(scan.next());
		
		//After receiving the data, instantiate the object
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		//Convert String to corresponding value defined in OrderStatus class
		OrderStatus status = OrderStatus.valueOf(scan.next());
		
		//Order -> Client
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order: ");
		int quantityOfItems = scan.nextInt();
		
		for (int i = 1; i <= quantityOfItems; i++) {
			System.out.println("Enter #" + i + " item data:");
			
			System.out.print("Product name: ");
			scan.nextLine();
			String productName = scan.nextLine();
			
			System.out.print("Product price: ");
			double productPrice = scan.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = scan.nextInt();
			
			//After receiving the data, instantiate the object
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			//add order item to order
			order.addItem(it);
		}
		
		System.out.println();
		
		System.out.println(order);
		
		scan.close();

	}

}
