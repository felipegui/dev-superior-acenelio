package employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int numbersEmployees = scan.nextInt();

		for (int i = 0; i < numbersEmployees; i++) {
			System.out.println();

			System.out.println("Employee #" + (i + 1) + ": ");

			System.out.print("Id: ");
			Integer id = scan.nextInt();

			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();

			System.out.print("Salary: ");
			Double salary = scan.nextDouble();

			Employee emp = new Employee(id, name, salary);

			list.add(emp);
		}

		System.out.println();
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = scan.nextInt();

		//Expressão lambda
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		//Integer position = positionId(list, idSalary);
		
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percentage = scan.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		
		System.out.println("List of employee:");
		for (Employee employee : list)
			System.out.println(employee);
		
		scan.close();

	}

	// Função auxiliar para encontrar um item na lista
//	public static Integer positionId(List<Employee> list, int id) {
//
//		for (int i = 0; i < list.size(); i++) {
//			if (list.get(i).getId() == id) {
//				return i;
//			}
//		}
//		return null;
//	}

}
