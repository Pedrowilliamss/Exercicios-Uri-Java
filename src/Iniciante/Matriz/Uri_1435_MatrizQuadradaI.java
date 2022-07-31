package Iniciante.Matriz;

import java.util.Scanner;

public class Uri_1435_MatrizQuadradaI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int p = 1;
		int x;

		while (p != 0) {
			int n = input.nextInt();
			if (n != 0) {
				int[][] matriz = new int[n][n];

				for (int i = 0; i < matriz.length; i++) {
					for (int j = 0; j < matriz[i].length; j++) {
						x = i + 1;
						if( j == 0 || i == 0) {
							x = 1;
						}
						if( j < x) {
							x = j + 1;
						}
						if( n - i  < x) x = n - i ; 
						if( n - j  < x) x = n - j ; 
						matriz[i][j] = x;
						
						System.out.printf("%3d",x);
						if( j != n-1)System.out.printf(" ");
						if( j == n-1)System.out.printf("\n");
					}
				}
			}
			System.out.printf("\n");
			if (n == 0) {
				p = 0;
			}

		}
		input.close();
	}
}
