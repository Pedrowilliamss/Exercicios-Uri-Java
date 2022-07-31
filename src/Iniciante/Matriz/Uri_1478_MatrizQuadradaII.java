package Iniciante.Matriz;

import java.io.IOException;
import java.util.Scanner;

public class Uri_1478_MatrizQuadradaII {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		while (n != 0) {

			int[][] matriz = new int[n][n];

			for (int i = 0; i < matriz.length; i++) {
				int decrecente = i + 1;
				int crecente =  2;
				for (int j = 0 ; j < matriz[i].length; j++) {
					if ( j > i) { 
						matriz[i][j] = crecente;
						crecente++;					
					}
					if ( j < i) {
						matriz[i][j] = decrecente;
						decrecente--;
					}
					
					if (j == i) matriz[i][j] = 1;

					System.out.printf("%3d", matriz[i][j]);
					if (j != n - 1) System.out.printf(" ");
					if (j == n - 1) System.out.printf("\n");
				}
			}
			System.out.printf("\n");
			n = input.nextInt();

		}
	}
}
