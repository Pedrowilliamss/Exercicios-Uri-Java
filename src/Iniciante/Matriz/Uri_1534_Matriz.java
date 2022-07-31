package Iniciante.Matriz;

import java.util.Scanner;

public class Uri_1534_Matriz {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		String n = input.next();
		int[][] matriz = new int[Integer.parseInt(n)][Integer.parseInt(n)];
		
		while (n.equals("EOF") == false) {
			
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz.length; j++) {
					if( i == j) {
						matriz[i][j] = 1;
					}
					System.out.printf("%3d", matriz[i][j]);
					if (j != Integer.parseInt(n) - 1) System.out.printf(" ");
					if (j == Integer.parseInt(n) - 1) System.out.printf("\n");
				}
			}
			 n = input.next();
		}
	}
}
