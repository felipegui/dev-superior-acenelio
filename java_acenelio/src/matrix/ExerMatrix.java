package matrix;

import java.util.Scanner;

public class ExerMatrix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Números de linhas da matriz: ");
		int m = scan.nextInt();

		System.out.print("Números de colunas da matriz: ");
		int n = scan.nextInt();

		int[][] mat = new int[m][n];

		System.out.println("Digite os valores da matriz:");
		
		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				mat[i][j] = scan.nextInt();
			}
		}

		System.out.println();

		System.out.println("Qual valor deseja buscar na matriz?");
		int x = scan.nextInt();

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				if (mat[i][j] == x) {
					System.out.println("Posição " + i + ", " + j + ":");

					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Abaixo: " + mat[i + 1][j]);
					}
				}
			}
		}

		scan.close();

	}

}
