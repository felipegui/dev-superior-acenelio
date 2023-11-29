package tryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		methodOne();
		
		System.out.println("Fim do programa.");

	}

	public static void methodOne() {
		System.out.println("***METHOD 1 START***");
		
		methodTwo();
		
		System.out.println("***METHOD 1 END***");
	}
	
	public static void methodTwo() {
		Scanner sc = new Scanner(System.in);

		System.out.println("***METHOD 2 START***");
		
		try {
			System.out.print("Digite os nomes: ");
			String[] vect = sc.nextLine().split(" ");

			System.out.print("Informe a posição no vetor: ");
			int position = sc.nextInt();

			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição não encontrada!");
			//Stack Trace mostra toda a chamada de métodos que ocasionou a exceção
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Erro na entrada de dados! Talvez você possa ter digitado errado.");
		}

		System.out.println("***METHOD 2 END***");
		
		sc.close();
	}

}
