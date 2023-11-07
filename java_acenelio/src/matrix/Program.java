package matrix;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int matrixNumber = scan.nextInt();
		
		//arranjo bidimencional
		int[][] matrix = new int[matrixNumber][matrixNumber];
		
		//Percorre as linhas da matriz
		for (int i = 0; i < matrix.length; i++) {
			
			//Percorre as colunas da matriz
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}
		
		//Os elementos da diagonal principal sempre terão os mesmos índices
		System.out.println("Main dioagonal: ");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		System.out.println();
		
		//contador de números negativos, iniciado com valor zero
		int count = 0;
		
		//Percorre linhas e colunas
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				
				if (matrix[i][j] < 0) {
					count ++;
				}
			}
		}
		
		System.out.print("Negative numbers = " + count);
		
		scan.close();

	}

}
