package exerpolymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<Employee>();
		
		System.out.print("Enter the number of employees: ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Employee #" + i + " data:");
			
			System.out.print("Outsourced (y/n)? ");
			char y_n = scan.next().charAt(0);
			
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			
			System.out.print("Hours: ");
			int hours = scan.nextInt();
			
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			
			if (y_n == 'y') {
				
				System.out.print("Additional charge: ");
				double addCharge = scan.nextDouble();
				
//				Outsourced employee instance
				OutsourcedEmployee outEmp = new OutsourcedEmployee(name, hours, valuePerHour, addCharge);
//				Add to list
				list.add(outEmp);
//				list.add(new OutsourcedEmployee(name, hours, valuePerHour, addCharge));
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
//				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		
		System.out.println("PAYMENTS:");
		
		for (Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		scan.close();

	}

}
