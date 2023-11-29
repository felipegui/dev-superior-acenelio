package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Digite os nomes: ");
			String[] vect = sc.nextLine().split(" ");
			
			System.out.print("Informe a posição no vetor: ");
			int position = sc.nextInt();
			
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição não encontrada!");
		}
		catch (InputMismatchException e) {
			System.out.println("Erro na entrada de dados! Talvez você possa ter digitado errado.");
		}
		
		System.out.println("Programa foi encerrado! Tente novamente...");
		
		sc.close();

	}

}
