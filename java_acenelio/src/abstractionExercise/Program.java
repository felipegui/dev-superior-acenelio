package abstractionExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner scan = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter number of shapes: ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.println("Shape #" + i + " data:");
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = scan.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(scan.next());
			
			if (ch == 'r') {
				System.out.print("Width: ");
				double width = scan.nextDouble();
				
				System.out.print("Height: ");
				double height = scan.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Radius: ");
				double radius = scan.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		
		System.out.println("SHAPE AREAS:");
		for (Shape shp : list) {
			System.err.println(String.format("%.2f", shp.area()));
		}
		
		scan.close();

	}

}
